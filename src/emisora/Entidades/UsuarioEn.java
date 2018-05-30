/*
    Clase que tendría como comportamiento similar a la herencia
    Esta clase contiene los atributos que serán almacenados directamente
    en el arhivo usuarios.txt definido en FileDAO.java
 */
package emisora.Entidades;

import java.util.Calendar;

public class UsuarioEn {
    private String nombre;
    private String nombre2;
    private String apellido;
    private String apellido2;
    private String correo;
    private String pass;
    private String fecha;
    private String documento;    

    public String getFecha() {return fecha;}

    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getCorreo() {return correo;}

    public void setCorreo(String correo) {this.correo = correo;}

    public String getNombre2() {return nombre2;}

    public void setNombre2(String nombre2) {this.nombre2 = nombre2;}

    public String getApellido2() {return apellido2;}

    public void setApellido2(String apellido2) {this.apellido2 = apellido2;}

    public String getDocumento() {return documento;}

    public void setDocumento(String documento) {this.documento = documento;}

    public String getPass() {return pass;}

    public void setPass(String pass) {this.pass = pass;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}    
}
