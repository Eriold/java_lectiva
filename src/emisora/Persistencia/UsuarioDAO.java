/*
    Clase definida para la construcción de dónde y cómo se almacenará
    los datos que le proporcionará UsuarioEn.java
*/

package emisora.Persistencia;

import emisora.Entidades.TipoDocumentoEn;
import emisora.Entidades.UsuarioEn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    
    public boolean insertarUsuario(Connection con, UsuarioEn uen, TipoDocumentoEn tdEn) {
    boolean result = true;
    
        try {
            String sql = UsuarioHelper.guardarUsuario();
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, uen.getNombre());
            p.setString(2, uen.getNombre2());
            p.setString(3, uen.getApellido());
            p.setString(4, uen.getApellido2());
            p.setString(5, uen.getCorreo());            
            p.setString(6, uen.getPass());
            p.setString(7, uen.getFecha());
            p.setString(8, uen.getDocumento());   
            p.execute();
            try {
                PreparedStatement px = con.prepareStatement(TipoDocumentoHelper.guardarTipoDocumento());
                
                    px.setString(1, tdEn.getTipoDocu());
                    px.execute();                

            } catch (Exception ex) {
                ex.printStackTrace();
                result = false;
            }
            
        }catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        } finally {
             try {
                 con.close();
             } catch (Exception clo) {
            }
        }
        return result;
    }
    
    public UsuarioEn buscarPropietario(Connection con, int cod) {
        UsuarioEn userEn = null;                      
        try {
            String sql = UsuarioHelper.buscarUsuario();
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, cod);
            ResultSet r = p.executeQuery();
            if (r.next()) {
                userEn = new UsuarioEn();
                userEn.setNombre(r.getString(1));
                userEn.setNombre2(r.getString(2));
                userEn.setApellido(r.getString(3));
                userEn.setApellido2(r.getString(4));
                userEn.setCorreo(r.getString(5));
                userEn.setDocumento(r.getString(6));
                userEn.setFecha(r.getString(7));
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            try {
                con.close();
            } catch (Exception clo) {
            }

        }
        return userEn;
    }
    
}

           

