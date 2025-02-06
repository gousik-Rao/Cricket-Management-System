package Prototype.Application;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailSender {

    public static void sendOTPEmail(String toEmail, String emailPassword, int otp) {
        // Configuring mail server properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Authenticating your email credentials
        final String username = "gousikthason@gmail.com";  // Replace with your email
        final String password = "your-email-password";  // Replace with your email password
        
        // Getting the session object
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Creating the email message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("your-email@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Your OTP Code");
            message.setText("Dear user,\n\nYour OTP is: " + otp + "\n\nThank you!");

            // Sending the email
            Transport.send(message);
            System.out.println("OTP email sent successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
