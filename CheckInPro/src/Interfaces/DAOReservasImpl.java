// DAOReservasImpl.java
package Interfaces;

import Datos.BaseDatos;
import Datos.DatosReservas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOReservasImpl extends BaseDatos implements DAO<DatosReservas> {
    
    @Override
    public void crear(DatosReservas reserva) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                "INSERT INTO Reservas (checkin, Checkout, habitacion_es, id_huesped, seña) VALUES (?, ?, ?, ?, ?)"
            );
            st.setString(1, reserva.getCheckIn());
            st.setString(2, reserva.getCheckout());
            st.setInt(3, reserva.getNroHabitacion());
            st.setInt(4, reserva.getHuesped());
            st.setLong(5, reserva.getSeña());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(DatosReservas reserva) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                "UPDATE Reservas SET CheckIn = ?, Checkout = ?, NroHabitacion = ?, Huesped = ?, Seña = ? WHERE id_reserva = ?"
            );
            st.setString(1, reserva.getCheckIn());
            st.setString(2, reserva.getCheckout());
            st.setInt(3, reserva.getNroHabitacion());
            st.setInt(4, reserva.getHuesped());
            st.setLong(5, reserva.getSeña());
            st.setInt(6, reserva.getId()); // Usar el ID de la reserva para identificar la fila a modificar
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void borrar(int id) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM Reservas WHERE id_reserva = ?;");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<DatosReservas> listar() throws Exception {
        List<DatosReservas> lista = new ArrayList<>();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM Reservas;");
            lista = new ArrayList();
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DatosReservas reserva = new DatosReservas();
                reserva.setCheckIn(rs.getString("CheckIn"));
                reserva.setCheckout(rs.getString("Checkout"));
                reserva.setNroHabitacion(rs.getInt("NroHabitacion"));
                reserva.setHuesped(rs.getInt("Huesped")); // Extraer directamente del ResultSet
                reserva.setSeña((int) rs.getLong("Seña"));
                lista.add(reserva);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}

