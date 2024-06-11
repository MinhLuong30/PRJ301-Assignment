/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Delayed;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class MainController extends HttpServlet {
    public final static String LOGIN = "LoginServlet";
    public final static String SEARCH = "SearchSevlet";
    public final static String CHECK = "CheckInventory";
    public final static String ADD = "AddServlet";
    public final static String REMOVE = "RemoveServlet";
    public final static String UVERI = "UserVerify";
    public final static String CODE = "VerifyCode";
    public final static String UPDATE = "UpdateServlet";
    public final static String SHOWA = "ShowAcc";
    public final static String DELETEACC = "DeleteAcc";
    public final static String SHOWCUS = "SearchtoShow";
    public final static String GBACK = "GoBackServlet";
    public final static String ADDTOCART = "AddToCart";
    public final static String SHOWO = "OrderDetails";
    
 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = "login.jsp";
        String action = request.getParameter("action");
        System.out.println(action);
        try {
            if(action == null){
                url = "login.jsp"; 
            }else if("Sign In".equals(action)){
                url = LOGIN;
//            your code here
            }else if("Show Inventory".equals(action) || "SearchInventory".equals(action)){
                url = SEARCH;
                System.out.println("hiiii");
            }else if("Check".equals(action)){
                url = CHECK;
            }else if("Sign Up".equals(action)){
                url = UVERI;
            }else if("Verify".equals(action)){
                url = CODE;
            }else if("Add".equals(action)){
                url = ADD;
            }else if("Remove".equals(action)){
                url = REMOVE;
            }else if("Update".equals(action)){
                System.out.println("1");
                url = UPDATE;
            }else if("Show Account".equals(action)){
                url = SHOWA;  
            }else if("ShowCus".equals(action)){
                url = SHOWCUS; 
            }else if("GoBack".equals(action)){
                url = GBACK;
            }else if("Addtocart".equals(action)){
                url = ADDTOCART;
            }else if("Delete".equals(action)){
                url = DELETEACC;
            }else if("Show Orderdetail".equals(action) || "Order".equals(action)){
                url = SHOWO;
            
            
            
            
            
            }else if("Back LogIn".equals(action)){
                url = "login.jsp";
            }else if("Revenue".equals(action)){
                url = "revenue.jsp";
            }else if("Product".equals(action)){
                url = "product.jsp";
            }else if("Invoice".equals(action)){
                url = "invoice.jsp";
            }else if("Account".equals(action)){
                url = "account.jsp";
            }else if("Order".equals(action)){
                url = "Order.jsp";
            }else if("Feedback".equals(action)){
                url = "feedback.jsp";
            }
            
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
