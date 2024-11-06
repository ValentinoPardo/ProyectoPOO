/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.util.Objects;import Datos.BaseDatos;
import Datos.DatosReservas;
import Datos.Huespedes;
import java.util.List;
import java.sql.PreparedStatement;
import Interfaces.DAO;
import java.util.ArrayList;
import java.sql.ResultSet;

public class DAOReservasImpl extends BaseDatos implements DAO{
    
    public void crear(DatosReservas reserva) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Huespedes( nombre, apellido, correo, telefono, documento) VALUES(?,?,?,?,?)");
            st.setString(1, reserva.getCheckIn());
            st.setString(2, reserva.getCheckout());
            st.setInt(3, reserva.getNroHabitacion());    
            st.setString(4, reserva.getHuesped());
            st.setLong(5, reserva.getSeña());
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    public void modificar(DatosReservas reserva) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE Huespedes SET CheckIn = ?, Checkout = ?, NroHabitacion = ?, Huesped = ?, getSeña= ? WHERE id = ?");
            st.setString(1, reserva.getCheckIn());
            st.setString(2, reserva.getCheckout());
            st.setInt(3, reserva.getNroHabitacion());
            st.setString(4, reserva.getHuesped());
            st.setLong(5, reserva.getSeña());
            st.setInt(1, reserva.getId());
            st.executeUpdate();
            st.close();
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
    public List<DatosReservas> listar() throws Exception {
        List<DatosReservas> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Huespedes;");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DatosReservas reserva = new DatosReservas();
                reserva.setCheckIn(rs.getString ("CheckIn"));
                reserva.setCheckout(rs.getString ("Checkout"));
                reserva.setNroHabitacion(rs.getInt("NroHabitacion"));
                reserva.setHuesped("Huesped");
                reserva.setSeña(rs.getInt("Seña"));
                lista.add(reserva);
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

    @Override
    public void crear(Huespedes huesped) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(Huespedes huesped) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
