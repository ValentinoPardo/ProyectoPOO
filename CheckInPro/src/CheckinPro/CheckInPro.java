
package CheckinPro;

import Datos.Dao;
import Datos.DatosHuespedes;
import Datos.DatosHuespedesDaoListImpl;
import Vista.Inicio;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CheckInPro {

    public static void main(String[] args) {
        Inicio N1= new Inicio();
        
        N1.setVisible(true);
        
        DatosHuespedes h = new DatosHuespedes("Julio");
        Connection cn;
        
        String url = "jdbc:mysql://localhost:3306/CheckInPro?user=root&password=1234";
        String sqlInsert = "INSERT INTO Huespedes(nombre) VALUES(?); ";
        
        
        try {
            cn = java.sql.DriverManager.getConnection(url);
            
            System.out.println("Conectado");
            
            System.out.println("insertar Huesped");
            System.out.println(h);
            PreparedStatement pst = cn.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, h.getNombre());
            pst.execute();
            
            System.out.println(h);
            
        } catch (SQLException ex) {
            Logger.getLogger(CheckInPro.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            cn = null;
        }
        
    }
    
}
