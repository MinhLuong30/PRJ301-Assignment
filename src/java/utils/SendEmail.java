/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import dto.User;

/**
 *
 * @author minhl
 */
public class SendEmail {
    public String getRandom(){
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        
        return String.format("%06d", number);
    }
    
    
    public  boolean sendEmail(User user){
        boolean test = false;
        
        String toEmail = user.getEmail();
        System.out.println(toEmail);
        String fromEmail = "storemibell30@gmail.com";
        String password = "kbrxsgcsuwhgtbwb";
        
        try{
            
            Properties pr = new Properties();
            pr.setProperty("mail.smtp.host", "smtp.gmail.com");
            pr.setProperty("mail.smtp.port", "587");
            pr.setProperty("mail.smtp.auth", "true");
            pr.setProperty("mail.smtp.starttls.enable", "true");
            pr.setProperty("mail.smtp.socketFactory.port", "587");
            pr.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            
            //getSession
            Authenticator auth = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(fromEmail, password);
                }
            };
            Session session = Session.getInstance(pr, auth);
            MimeMessage mess = new MimeMessage(session);
            try {
            mess.setFrom(new InternetAddress(fromEmail, "Store MiBell"));
            mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            
            mess.setSubject("User Email Verification");
            
            mess.setText("Registered successsfully. Please verify your account using this code:" + user.getCode());
            } catch (Exception e) {
            }
            
            //send
            Transport.send(mess);
            test = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return test;
    }
}
