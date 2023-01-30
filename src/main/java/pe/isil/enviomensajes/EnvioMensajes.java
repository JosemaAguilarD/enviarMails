package pe.isil.enviomensajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author 51992
 */
public class EnvioMensajes {

        public static String emailEnvia = "josemariaaguilar8999@gmail.com";
	public static String passwordEnvia = "durtqoexbzhgmmhi";
	public static String emailRecibe;
	public static String asunto;
	public static String contenido;
	
	public static Properties mProperties = new Properties();
	public static Session mSession;
	public static MimeMessage mCorreo;
	

	
	public static void crearEmail(String emailRecibe, String asunto, String contenido) {
		
		//Simple mail transfer protocol (SMTP)
		mProperties.put("mail.smtp.host", "smtp.gmail.com");
		mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		mProperties.setProperty("mail.smtp.starttls.enable", "true");
		mProperties.setProperty("mail.smtp.port", "587");
		mProperties.setProperty("mail.smtp.user", emailEnvia);
		mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
		mProperties.setProperty("mail.smtp.auth", "true");

		mSession = Session.getDefaultInstance(mProperties);
		
		try {
			BodyPart texto = new MimeBodyPart();
			texto.setText(contenido);
			BodyPart adjunto = new MimeBodyPart();
			adjunto.setDataHandler(new DataHandler(new FileDataSource("D:/JmYo.jpg")));
			MimeMultipart m = new MimeMultipart();
			m.addBodyPart(texto);
			m.addBodyPart(adjunto);		
			
			mCorreo = new MimeMessage(mSession);
			mCorreo.setFrom(new InternetAddress(emailEnvia));
			mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailRecibe));
			mCorreo.setSubject(asunto);
			mCorreo.setContent(m);

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void enviarEmail(String correo) {
		try {
			Transport mTransport = mSession.getTransport("smtp");
			mTransport.connect(emailEnvia, passwordEnvia);
			mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
			mTransport.close();
			
			System.out.println("Correo enviado correctamente a " + correo +"!");

		} catch (MessagingException e) {
			System.out.println("No se llegó enviar el correo");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	    static List<String> correos = new ArrayList<>();
            
	
	public static void enviarCorreosMasivos(List<String> correos, String asunto, String mensaje) {
		 for(String correo:correos) {
			   crearEmail(correo, asunto, mensaje);
			   enviarEmail(correo);
		   }	
		 }
        
    public static void main(String[] args) {
        enviarCorreosMasivos(correos, "Mensaje de Prueba", "Contenido del mensaje");
    }
}
