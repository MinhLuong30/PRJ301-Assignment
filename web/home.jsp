
<%@page import="dto.User"%>
<%-- 
    Document   : home
    Created on : Mar 20, 2024, 5:01:22 PM
    Author     : minhl
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>F.Studio</title>
<style>
html, body, body div, span, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, abbr, address, cite, code, del, dfn, em, img, ins, kbd, q, samp, sub, sup, var, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, figure, footer, header, menu, nav, section, time, mark, audio, video, details, summary {
    margin: 0;
    padding: 0;
    border: 0;
    font-size: 100%;
    font-weight: normal;
    vertical-align: baseline;
    background: transparent;
}
    .header-body {
    position: relative;
    z-index: 1000;
    background: #000;
    padding: 8px 0;
}
.container {
    
    width: 100%;
    max-width: 1200px;
    padding-right: 12px;
    padding-left: 12px;
    margin-right: auto;
    margin-left: auto;
}
.flex-center {
    display: flex;
    align-items: center;
    justify-content: center;
}
.header-body .header-logo {
    flex: auto;
    max-width: 276px;
}
.header-body .header-search {
    flex: 1;
    position: relative;
}
.header-body .header-search .form-group {
    width: 476px;
    margin: 0 auto;
}
.form-group {
    position: relative;
}
.header-body .header-cart .c-cart {
    cursor: pointer;
    display: inline-flex;
    align-items: center;
    color: #e1e4e6;
    padding: 10px 0 10px 24px;
}
a {
    color: #0664f9;
    text-decoration: none;
    background-color: transparent;
    -webkit-text-decoration-skip: objects;
}
a {
    margin-bottom: -55px;
    margin-top: -40px;
    margin-left: 20px;
    margin-right: 20px;
    padding: 0px;
    font-size: 100%;
    vertical-align: middle;
    background: transparent;
}
.header-body .header-cart .c-cart .form-cart-icon {
    position: relative;
}
.m-r-8 {
    margin-right: 8px;
}
.f-s-p-14, .form-mobile .form-search-result a, .form-float-input, .form-float label, .form-search-xs .form-search-input, .form-search-sm .form-search-input, .form-search-md .form-search-input, .checkbox label, .radio label, .form-input-sm, .form-input-sm::placeholder, .form-input-md, .form-input-md::placeholder, .form-input, .form-input::placeholder {
    font-size: 14px;
    line-height: 20px;
}
.header-body .header-cart .c-cart i {
    font-size: 102px;
}
.header-body .header-cart .c-cart {
    cursor: pointer;
    display: inline-flex;
    align-items: center;
    color: #e1e4e6;
    padding: 32px
 0 10px 24px;
    width: 40px;
}
[class^=ic-], [class*=" ic-"], [class^=icon-], [class*=" icon-"] {
    font-family: "icon" !important;
    speak: never;
    font-style: normal;
    font-weight: normal;
    font-variant: normal;
    text-transform: none;
    line-height: 1;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}
.header-bot {
    background: #212529;
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.header-bot .header-item {
    display: flex;
    align-items: center;
}
.header-bot .header-item ul {
    flex: 1;
    justify-content: space-between;
}
.header-bot .header-item ul a {
    cursor: pointer;
}
.header-bot li a.active {
    padding: 0;
    display: inline-flex;
    align-items: center;
    justify-content: center;
    margin: 11px 0;
    color: #f6c743;
    font-weight: 500;
}
.header-bot .header-item ul a {
    cursor: pointer;
}
.header-bot li a {
    display: block;
    padding: 19px 0;
    color: #939ca3;
    font-size: 14px;
    line-height: 14px;
    font-weight: 400;
    min-width: 122px 
px
;
}
.flex {
    display: flex;
}
.text-center {
    text-align: center !important;
}
.header-bot .header-item .header-btn {
    margin-left: 52px;
}
.section-wrap {
    background: #212529;
}
article, aside, figure, footer, header, nav, section, details, summary {
    display: block;
}
.home__cate {
    text-align: center;
    gap: 24px;
    align-items: center;
}
.home__cate .cate__item {
    position: relative;
    padding: 54px 0 52px;
    background: #32373d;
    box-shadow: 0 0 16px rgba(0,0,0,.7);
    border-radius: 10px;
    transition: transform 0.3s ease-in-out;
    will-change: transform;
}
.home__cate .cate__item:before {
    content: "";
    position: absolute;
    top: 0;
    right: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: #32373d;
    border: 2px solid #444b52;
    border-radius: 6px;
    transition: transform 0.3s ease-in-out;
}
.home__cate .cate__item:hover {
    transform: translateY(-5px); /* Slightly raise the card on hover */
    box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.15); /* Increase shadow on hover */
}
*, *:before, *:after {
    box-sizing: inherit;
}
.home__cate .cate__item a {
    display: block;
    position: relative;
}
.home__cate .cate__item-title {
    color: #fff;
    font-size: 20px;
    line-height: 28px;
    font-weight: 500;
    margin-bottom: -20px;
}
.home__cate .cate__item-btn {
    display: inline-flex;
    justify-content: center;
    align-items: center;
    opacity: 0;
    visibility: hidden;
    margin-top: 15px;
    color: #e1e4e6;
    position: absolute;
    left: 0;
    right: 0;
    width: auto;
    transition: all .3s ease;
    padding: 3px 0;
    font-size: 14px;
    line-height: 14px;
    font-weight: 400;
}
img {
    vertical-align: middle;
}
img, object, embed {
    max-width: 100%;
}
.header-body
{
    background-image: url('https://i.pinimg.com/564x/48/a6/3c/48a63c549e02ecabfd068370eddb3fac.jpg');
    background-size: cover;
    background-position: center;
    position: relative;
    overflow: hidden;
    height: 150px; /* Adjust height as needed */
}
.user-greeting, .login-link {
    margin-left: auto;
    margin-right: auto;
    width: 230px; /* Adjust based on your layout */
    color: #e1e4e6;
    font-size: 25px;
    text-align: center;
    
}

/* Further responsive design */
@media (max-width: 600px) {
    .user-greeting, .login-link {
        margin-left: 10px;
        margin-right: 10px;
        width: auto;
    }
}
</style>
</head>
<body class="home" style="background: #212529;">
    <div class="header">
        <div class="header-body">
            <img style="width: 200px; margin-right: -900px;" src="https://i.stack.imgur.com/022Fl.gif" alt="Your GIF" class="gif">  
            <div class="container flex-center" style="margin-top: -175px;">
                
                <div>
                    <br>
                    <br>
                    
                    <h1 style="font-family: Copperplate; text-align: center; color: #FFB808; font-size: 62px;">MIBELL COMIC STORE</h1>
                        <%
                            // Assuming "LOGIN_US" is stored as a session attribute when user logs in
                            Object userObj = session.getAttribute("LOGIN_US");
                            if (userObj != null) {
                                User loginUser = (User)userObj; // Cast to your User class
                        %>
                        <div  class="user-greeting">
                                <%= loginUser.getFullname() %>
                        </div>
                        <div>
                                <a style="color:#e1e4e6; " href="login.jsp">Log Out</a>
                        </div>    
                        <%
                            } else {
                        %>
                            <div class="login-link">
                                <a href="login.jsp">Sign In/ Sign Up</a>
                            </div>
                        <%
                            }
                        %>
                </div>
            </div>
        </div>

                <main class="main home" style="background: #212529;">
    <section class="section-wrap home-page">
    <section class="section-module section__banner">
    </section>
    <section class="section-module section__cate">
    <div class="container">
        <div class="home__cate flex">
            <div class="cate__item">
            <a href="MainController?action=ShowCus&id=DB">
                <div class="cate__item-img"><img width="200px"src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/677b7403-76bf-4871-b1eb-996331c62c03/d4hnd6k-8dd9fe41-0438-4d82-945d-506be33bef10.png/v1/fill/w_800,h_258/logo___dragon_ball_tankoubon_spain_dbz_anime_by_vicdbz_d4hnd6k-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MjU4IiwicGF0aCI6IlwvZlwvNjc3Yjc0MDMtNzZiZi00ODcxLWIxZWItOTk2MzMxYzYyYzAzXC9kNGhuZDZrLThkZDlmZTQxLTA0MzgtNGQ4Mi05NDVkLTUwNmJlMzNiZWYxMC5wbmciLCJ3aWR0aCI6Ijw9ODAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.s0pPGyByTP_nxVfpy-OivPWVX26aDKQEOly4GAKEo0M" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-img"><img width="150px" src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/3c2de0d3-f642-445f-9852-f3505837f06c/dbt4osa-d98d150a-2631-4a91-9267-ba35e8493004.png/v1/fill/w_1024,h_1383/son_goku_ssj_fase_dios__by_jaredsongohan_dbt4osa-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTM4MyIsInBhdGgiOiJcL2ZcLzNjMmRlMGQzLWY2NDItNDQ1Zi05ODUyLWYzNTA1ODM3ZjA2Y1wvZGJ0NG9zYS1kOThkMTUwYS0yNjMxLTRhOTEtOTI2Ny1iYTM1ZTg0OTMwMDQucG5nIiwid2lkdGgiOiI8PTEwMjQifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.p-OUcBRJhF8n7ZNgJP8Vxa7306ZovXYporMeFNHzfNI" alt="iPhone" data-pagespeed-url-hash="2772646832" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
            <div class="cate__item">
            <a href="MainController?action=ShowCus&id=JJK"> 

                <div class="cate__item-title"><img style="margin-top: -20px" width="200px"src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/a44778ea-3457-40e0-8979-b7e3685d23d0/dekiqwv-be5d6933-0cc6-40e1-9b67-60b3affb002b.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2E0NDc3OGVhLTM0NTctNDBlMC04OTc5LWI3ZTM2ODVkMjNkMFwvZGVraXF3di1iZTVkNjkzMy0wY2M2LTQwZTEtOWI2Ny02MGIzYWZmYjAwMmIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.MTyBudLEGmNsCm4sYllShvFfo8MopGfgIQseKhejx00" alt="Apple Watch" data-pagespeed-url-hash="1901690717" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-img"><img width="135px"src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/4725ad62-b01b-4832-bc94-3b6cbaac4423/dgkubkk-aaafcf76-1ecb-4d9f-9d1c-a21a0fbf109e.png/v1/fill/w_1280,h_1919/yuji_render_by_jinhehe_dgkubkk-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTkxOSIsInBhdGgiOiJcL2ZcLzQ3MjVhZDYyLWIwMWItNDgzMi1iYzk0LTNiNmNiYWFjNDQyM1wvZGdrdWJray1hYWFmY2Y3Ni0xZWNiLTRkOWYtOWQxYy1hMjFhMGZiZjEwOWUucG5nIiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.9YoyYhhoJ2LhF35ktmR_so-sJ2oSMc5slpM8Cs0-4zQ" alt="iPad" width="270px" class="imgjjk"  ></div>
            <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
            <div class="cate__item">
            <a href="MainController?action=ShowCus&id=SF">
                <div style="color: white; text-align: center; margin-top: 28px; font-size: 25px; ">SPY X FAMILY</div>
                <div class="cate__item-img"><img width="250px" height="187px" src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/3a6b1865-2510-4b88-8576-954660f8fd7d/df4edyt-ecf8812f-6368-41c5-934f-aec5c7b6d068.png/v1/fit/w_512,h_512/spy_x_family_by_phantom_ws_df4edyt-375w-2x.png 1024w" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
            <div class="cate__item">
            <a href="MainController?action=ShowCus&id=NA">
                <div class="cate__item-img"><img width="240px" height="65px" style="margin-top: 0px" src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8d722a95-67c0-4327-8dec-74bac90d68b6/d9dreww-4ed8e896-6dbc-4162-b4d0-148801907aee.png/v1/fill/w_1024,h_341/haikyuu_logo_by_animedark2_d9dreww-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MzQxIiwicGF0aCI6IlwvZlwvOGQ3MjJhOTUtNjdjMC00MzI3LThkZWMtNzRiYWM5MGQ2OGI2XC9kOWRyZXd3LTRlZDhlODk2LTZkYmMtNDE2Mi1iNGQwLTE0ODgwMTkwN2FlZS5wbmciLCJ3aWR0aCI6Ijw9MTAyNCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.uZ3JKdVj19wj5Bqsxuhc-BlSqm9qjv7br_5xGdkOeZY" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
                <div class="cate__item-img"><img width="240px" src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/a98cff5d-a612-49d8-a0db-175994384b20/dc6xagk-4289b16f-408f-4b67-80c5-44f81f5a602b.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2E5OGNmZjVkLWE2MTItNDlkOC1hMGRiLTE3NTk5NDM4NGIyMFwvZGM2eGFnay00Mjg5YjE2Zi00MDhmLTRiNjctODBjNS00NGY4MWY1YTYwMmIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.oq4tiFcoUQ6Opqg2-P0AUMO7rYIAFsC3Dr2WiGCEe54" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
            <div class="cate__item">
            <a href="MainController?action=ShowCus&id=CO">
                <div class="cate__item-img"><img style="" width="250px" height="245px" src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/7010633a-fbb6-4a19-869a-91a8611c03f4/d8vurlw-ceec9390-2d23-45e6-878c-d741d4dd68fc.png/v1/fit/w_512,h_512/icon_folder___detective_conan__2__by_alex_064_d8vurlw-375w-2x.png"></div>
            <div class="cate__item-link"><span></span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>

        </div>
    </div>
        <div class="container" style="margin-top: 30px;background: #212529;">
            <div class="home__cate flex">
            <div class="cate__item">
            <a href="MainController?action=ShowCus&id=DS">
            <div class="cate__item-img"><img src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/61a0bc66-cb18-46e5-b297-131a0602018b/df88umv-a5509655-e708-4acb-81a5-b10eaaad1bec.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzYxYTBiYzY2LWNiMTgtNDZlNS1iMjk3LTEzMWEwNjAyMDE4YlwvZGY4OHVtdi1hNTUwOTY1NS1lNzA4LTRhY2ItODFhNS1iMTBlYWFhZDFiZWMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.MTzOTFG1jP3q9sqAvFp1O3ukZx7UrUFIlDGCAY2NTGo" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-img"><img style="margin-top: -120px;" src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8a08a240-9a6e-442e-9336-b801e4f3bdcc/dd82f6e-49491038-fd7e-4159-a181-13c83e145423.png/v1/fit/w_828,h_466/kimetsu_no_yaiba___render_by_ikatzz_dd82f6e-414w-2x.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NzIwIiwicGF0aCI6IlwvZlwvOGEwOGEyNDAtOWE2ZS00NDJlLTkzMzYtYjgwMWU0ZjNiZGNjXC9kZDgyZjZlLTQ5NDkxMDM4LWZkN2UtNDE1OS1hMTgxLTEzYzgzZTE0NTQyMy5wbmciLCJ3aWR0aCI6Ijw9MTI4MCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.TohzR206OK3QPjaNj7gu5_ifeh17cHUgQWbCDlIWng8" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>        <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
                <div class="cate__item" style="margin-top: -220px;">
            <a href="MainController?action=ShowCus&id=DO">
                <div class="cate__item-img"><img width="580px" style="margin-top: 10px; margin-bottom: 10px;"src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/1425a7d1-05a8-4dd7-8e23-a55405e8c165/d26znl6-f5d6d04c-2854-4e85-b055-26a164003d7b.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzE0MjVhN2QxLTA1YTgtNGRkNy04ZTIzLWE1NTQwNWU4YzE2NVwvZDI2em5sNi1mNWQ2ZDA0Yy0yODU0LTRlODUtYjA1NS0yNmExNjQwMDNkN2IucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.VL6hvNY6_Ns6RQ1AfQakFYDBrNQQEnJjG2Y2T-EFwwM" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
                <div class="cate__item" style="margin-bottom: -140px; margin-left: -260px; margin-top: 20px;" >
            <a href="MainController?action=ShowCus&id=PM">
                <div class="cate__item-img"><img  src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/3a6b1865-2510-4b88-8576-954660f8fd7d/df9jx1t-dd593264-d8e7-4453-9528-84a012a49f1c.png/v1/fit/w_512,h_512/one_punch_man_by_phantom_ws_df9jx1t-375w-2x.png" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
            <div class="cate__item">
            <a href="MainController?action=ShowCus&id=OP">
            <div class="cate__item-img"><img src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8a156873-a830-43b1-9b31-3becb2f788fb/dfkgj9g-08fa4e7d-73c6-4cc2-ba0f-68c5a3a12ecb.png/v1/fit/w_700,h_700/one_piece_logo_by_firzecrescent_dfkgj9g-375w-2x.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NzAwIiwicGF0aCI6IlwvZlwvOGExNTY4NzMtYTgzMC00M2IxLTliMzEtM2JlY2IyZjc4OGZiXC9kZmtnajlnLTA4ZmE0ZTdkLTczYzYtNGNjMi1iYTBmLTY4YzVhM2ExMmVjYi5wbmciLCJ3aWR0aCI6Ijw9NzAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.5zps7dK0jWElAVjeEctoW9JFxgC-h-uuYdU-lrz9p3o" alt="Mac" data-pagespeed-url-hash="2978817478" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
            <div class="cate__item">
            <a href="/cart.jsp">
                <div class="cate__item-img"><img width="500px"src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/cdba954f-a7f5-417a-9337-8b719326f6be/deen9eg-f391a2eb-e134-4e0f-8ad4-bbd9e0fdca6d.png/v1/fill/w_819,h_975/kissing_booth_overlay__high_resolution_png_file__by_lewis4721_deen9eg-pre.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2NkYmE5NTRmLWE3ZjUtNDE3YS05MzM3LThiNzE5MzI2ZjZiZVwvZGVlbjllZy1mMzkxYTJlYi1lMTM0LTRlMGYtOGFkNC1iYmQ5ZTBmZGNhNmQucG5nIiwiaGVpZ2h0IjoiPD0xNTI0Iiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uud2F0ZXJtYXJrIl0sIndtayI6eyJwYXRoIjoiXC93bVwvY2RiYTk1NGYtYTdmNS00MTdhLTkzMzctOGI3MTkzMjZmNmJlXC9sZXdpczQ3MjEtNC5wbmciLCJvcGFjaXR5Ijo5NSwicHJvcG9ydGlvbnMiOjAuNDUsImdyYXZpdHkiOiJjZW50ZXIifX0.csto_tfNiVC97AZYqgxgRj0Z970_dytjlicTu5xXhfQ" onload="pagespeed.CriticalImages.checkImageForCriticality(this);"></div>
            <div class="cate__item-btn">
            <div class="cate__item-link"><span>Khám phá ngay</span><i class="ic-angle-right"></i></div>
            </div>
            </a>
            </div>
        </div>
</div>    
</section>
          
</body>