package Business.Students;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

public class SendMail {

    void sendMail(){
        String host = "localhost";
        final String user = "madushankamanoj414@gmail.com";  
        final String password = "";  
        
        Intake i=new Intake();

        String to = i.senderAddress;//emport receiver address from intake interface 

        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        //Compose the message  
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Registration for NSBM school of Business");
            message.setText(i.query+i.query1);//import message from query

            //send the message  
            Transport.send(message);

            System.out.println("message sent successfully...");

        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(i, "Error sending mail");
        }
    }
}

