
package modeloDAO;

import Interfaces.ValidarUsuario;
import conexion.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;



public class UsuarioDAO implements ValidarUsuario{

 Connection con;
 Conection conexion = new Conection();
   PreparedStatement ps;
    ResultSet rs;
    int resultado =0;

    @Override
    public int validarUsuario(Usuario usu) {
       int resultado =0;
    
       String sql = "Select mail from usuario where mail=? ";
       
       try{
           con = conexion.getConection();
           ps= con.prepareStatement(sql);
           ps.setString(1, usu.getMail());
           rs = ps.executeQuery();
           
           while(rs.next()){
               resultado = resultado +1;
               usu.setMail(rs.getString("mail"));
              
           }
           if(resultado ==1){
               return 1;
           }else{
               return 0;
           }
       }catch(Exception e){
           return 0;
       }
    }
    
}
