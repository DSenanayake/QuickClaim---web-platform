package controller;

import com.sun.mail.smtp.SMTPTransport;
import java.io.UnsupportedEncodingException;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.management.openmbean.InvalidKeyException;

public class Services {

    public static void sendEmail(String email, String subject, String message, String pat) throws javax.mail.MessagingException {

        String[] guy = {email};
        String fnm = pat;                              // attatching file path............
        String from = "pickme.lk@gmail.com";
        String pass = "pickme.lk2015";
        String host = "smtp.gmail.com";

        Properties prop = new Properties();
        prop = System.getProperties();
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.socketFactory.port", 465);
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.put("mail.smtp.user", from);
        prop.put("mail.smtp.password", pass);
        prop.put("mail.smtp.port", 587);
        prop.put("mail.smtp.auth", "true");

        Session ses = Session.getDefaultInstance(prop, null);

        javax.mail.internet.MimeMessage mm = new MimeMessage(ses);

        mm.setFrom(new InternetAddress(from));

        InternetAddress[] ias = new InternetAddress[guy.length];

        for (int i = 0; i < guy.length; i++) {
            ias[i] = new InternetAddress(guy[i]);
        }

        for (int i = 0; i < ias.length; i++) {
            mm.addRecipients(Message.RecipientType.TO, ias);
        }
        mm.setSubject(subject);
//            mm.setContent("<img src=" + "<h1>" + Message + "</h1>", "text/html");
        mm.setContent(message, "text/html");

        //MimeBodyPart mbp=new MimeBodyPart();
        //mbp.attachFile(fnm);
        //Multipart mp=new MimeMultipart();
        //mp.addBodyPart(mbp);
        //mm.setContent(mp);
        SMTPTransport tran = (SMTPTransport) ses.getTransport("smtp");

        System.out.print("[SERVICES - EMAIL SERVICE] - Attempting to Login.");
        tran.connect(host, 587, from, pass);
        System.out.println(".");
        tran.sendMessage(mm, mm.getAllRecipients());

        tran.close();

        System.out.println("[SERVICES - EMAIL SERVICE] - Sent.");

    }

    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private static KeySpec ks;
    private static SecretKeyFactory skf;
    private static Cipher cipher;
    static byte[] arrayBytes;
    private static String myEncryptionKey;
    private static String myEncryptionScheme;
    static SecretKey key;

    private static void refresh() {
        try {
            myEncryptionKey = "QuickClaimInsuranceService";
            myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
            arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
            ks = new DESedeKeySpec(arrayBytes);
            skf = SecretKeyFactory.getInstance(myEncryptionScheme);
            cipher = Cipher.getInstance(myEncryptionScheme);
            key = skf.generateSecret(ks);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String unencryptedString) throws UnsupportedEncodingException {
        refresh();
        String encryptedString = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            encryptedString = Base64.getEncoder().encodeToString(encryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encryptedString;
//        return encryptedString;
    }

    public static String decrypt(String encryptedString) throws UnsupportedEncodingException {
        refresh();
        String decryptedText = null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] encryptedText = Base64.getDecoder().decode(encryptedString);
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText = new String(plainText);
        } catch (InvalidKeyException | BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            System.err.println("NO MINIMUM BLOCKS.");
        } catch (Exception e) {

        }
        return decryptedText;
    }
}
