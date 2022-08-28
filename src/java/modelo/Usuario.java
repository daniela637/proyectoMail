
package modelo;

public class Usuario {
    


private int id;
private String mail;
private String usuario;
private String clave;

    public Usuario() {
    }

    public Usuario(int id, String mail, String usuario, String clave) {
        this.id = id;
        this.mail = mail;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

  



}
