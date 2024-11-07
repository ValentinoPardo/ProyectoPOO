
package Interfaces;

import Datos.BaseDatos;
import Datos.Huespedes;
import java.util.List;
import java.sql.PreparedStatement;
import Interfaces.DAO;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DAOHuespedesImpl extends BaseDatos implements DAO<Huespedes>{

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
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Huespedes huesped) throws Exception {
         try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE Huespedes SET nombre = ?, apellido = ?, correo = ?, telefono = ?, documento = ? WHERE id_huesped = ?");
            st.setString(1, huesped.getNombre());
            st.setString(2, huesped.getApellido());
            st.setString(3, huesped.getCorreo());
            st.setString(4, huesped.getTelefono());
            st.setLong(5, huesped.getDocumento());
            st.setInt(6, huesped.getId());
            int rowsUpdated = st.executeUpdate();
            
        }catch(Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void borrar(int id) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM Huespedes WHERE id_huesped = ?;");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Huespedes> listar() throws Exception {
        List<Huespedes> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Huespedes;");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Huespedes huesped = new Huespedes();
                huesped.setId(rs.getInt("id_huesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setTelefono(rs.getString("telefono"));
                huesped.setDocumento(rs.getInt("documento"));
                lista.add(huesped);
            }
        rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        }finally {
            this.Cerrar();
        }
        return lista;
    }

}
