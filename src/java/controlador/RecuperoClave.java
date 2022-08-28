
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modeloDAO.UsuarioDAO;

/**
 *
 * @author daniela
 */
@WebServlet(name = "RecuperoClave", urlPatterns = {"/RecuperoClave"})
public class RecuperoClave extends HttpServlet {
    
    Usuario usu = new Usuario();
    UsuarioDAO udao = new UsuarioDAO();
    int resultado;
    int mailTrue ;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           String accion = request.getParameter("accionRecupero");
           
           if(accion.equals("Enviar") ){
                String mail = request.getParameter("mailRecupero");
                
                usu.setMail(mail);
               resultado = udao.validarUsuario(usu);
               
               if(resultado == 1){
                   mailTrue = transfer_to_email(mail);
                   if(mailTrue == 1){
                           
                //me lleva a la pagina menu.
                request.getRequestDispatcher("correctoEnvio.jsp").forward(request, response);
                   }
               }else{
                     request.getRequestDispatcher("index.jsp").forward(request, response);
               }
           }
     
      
    }
    
    /***
     * recibe un correo de mail y se encarga de enviarle
     * el mail para recuperar la contraseña de su cuenta
     * @param correo
     * @return 
     */
    public int transfer_to_email(String correo) {
        String correoEnvia = "apiacerepanaderia2022@gmail.com";
        String password = "ctjkahbudkaawwed";
        String mensaje = "Ingrese a la siguiente pagina para editar su contraseña. http://localhost:8080/APiacere";

        Properties objetoPEC = new Properties();

        objetoPEC.put("mail.smtp.host", "smtp.gmail.com");
        objetoPEC.setProperty("mail.smtp.starttls.enable", "true");
        objetoPEC.put("mail.smtp.port", "587");
        objetoPEC.setProperty("mail.smtp.port", "587");
        objetoPEC.put("mail.smtp.user", correoEnvia);
        objetoPEC.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(objetoPEC);
        MimeMessage mail = new MimeMessage(sesion);

        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            mail.setSubject("Recuperacion de Contraseña");
            mail.setText(mensaje);

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, password);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
          return 1;
            
        } catch (Exception ex) {
            return 0;
        }

    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
