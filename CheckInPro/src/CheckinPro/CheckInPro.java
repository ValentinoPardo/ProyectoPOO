
package CheckinPro;

import Datos.Dao;
import Datos.DatosHuespedesDaoListImpl;
import Vista.Inicio;


public class CheckInPro {

    public static void main(String[] args) {
        Inicio N1= new Inicio();
        
        N1.setVisible(true);
        
        Dao storage = new DatosHuespedesDaoListImpl ();
        
       
        
        
    }
    
}
