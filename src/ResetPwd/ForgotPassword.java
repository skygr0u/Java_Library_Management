package ResetPwd;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class ForgotPassword {
    private static final String EMAIL_USERNAME = "azizmejri939@gmail.com"; // Replace with your Gmail email address
    private static final String EMAIL_PASSWORD = "lbwqqxclgzimanzr"; // Replace with your application-specific password
    private static final String SMTP_HOST = "smtp.gmail.com"; // Gmail SMTP host
    private static final int SMTP_PORT = 465; // Gmail SMTP port for SSL

    
     public static String generateCode() {
        // Generate a random code
        Random random = new Random();
        int code = 100000 + random.nextInt(900000); // 6-digit code
        return String.valueOf(code);
    }


    public static void sendEmail(String recipientEmail, String code) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", SMTP_HOST);
        properties.put("mail.smtp.port", SMTP_PORT);
        properties.put("mail.smtp.ssl.enable", "true"); // Enable SSL

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_USERNAME, EMAIL_PASSWORD);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL_USERNAME));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Password Reset Code");
            message.setText("Your password reset code is: " + code);

            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*String userEmail = "k361826@gmail.com"; // Replace with the recipient's email address
        String resetCode = generateCode();
        sendEmail(userEmail, resetCode);*/
    }
}
