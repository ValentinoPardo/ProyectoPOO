
package Interfaces;

import Datos.BaseDatos;
import Datos.Huespedes;
import Interfaces.DAOHuespedes;
import java.util.List;
import java.sql.PreparedStatement;

public class DAOHuespedesImpl extends BaseDatos implements DAOHuespedes{

    @Override
    public void crear(Huespedes huesped) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Huespedes( nombre, apellido, correo, telefono, documento) VALUES(?,?,?,?,?)");
            st.setString(1, huesped.getNombre());
            st.setString(2, huesped.getApellido());
            st.setString(3, huesped.getCorreo());
            st.setString(4, huesped.getTelefono());
            st.setLong(5, huesped.getDocumento());
            st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Huespedes huesped) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void borrar(Huespedes huesped) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
