/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class User implements Serializable{
    private String username;
    private String fullname;
    private String password;
    private String email;
    private String roleid;
    private String code;
    private boolean status;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", fullname=" + fullname + ", password=" + password + ", email=" + email + ", roleid=" + roleid + ", code=" + code + ", status=" + status + '}';
    }


    public User(String username, String fullname, String password, String email, String roleid, boolean status) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.roleid = roleid;
        this.status = status;
    }

    public User(String username, String email, String code) {
        this.username = username;
        this.email = email;
        this.code = code;
    }


    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
