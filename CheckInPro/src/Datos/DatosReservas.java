
package Datos;

import java.util.Objects;


public class DatosReservas {
    
    
    private String CheckIn;
    private String Checkout;
    private int NroHabitacion; 
    private int Huesped;
    private int Anticipo;

    public DatosReservas(String CheckIn, String Checkout, int NroHabitacion, int Huesped, int Anticipo) {
        this.CheckIn = CheckIn;
        this.Checkout = Checkout;
        this.NroHabitacion = NroHabitacion;
        this.Huesped = Huesped;
        this.Anticipo = Anticipo;
    }

    public DatosReservas() {
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.CheckIn);
        hash = 79 * hash + Objects.hashCode(this.Checkout);
        hash = 79 * hash + this.NroHabitacion;
        hash = 79 * hash + this.Huesped;
        hash = 79 * hash + this.Anticipo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DatosReservas other = (DatosReservas) obj;
        if (this.NroHabitacion != other.NroHabitacion) {
            return false;
        }
        if (this.Huesped != other.Huesped) {
            return false;
        }
        if (this.Anticipo != other.Anticipo) {
            return false;
        }
        if (!Objects.equals(this.CheckIn, other.CheckIn)) {
            return false;
        }
        return Objects.equals(this.Checkout, other.Checkout);
    }

    @Override
    public String toString() {
        return "DatosReservas{" + "CheckIn=" + CheckIn + ", Checkout=" + Checkout + ", NroHabitacion=" + NroHabitacion + ", Huesped=" + Huesped + ", Anticipo=" + Anticipo + '}';
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String CheckIn) {
        this.CheckIn = CheckIn;
    }

    public String getCheckout() {
        return Checkout;
    }

    public void setCheckout(String Checkout) {
        this.Checkout = Checkout;
    }

    public int getNroHabitacion() {
        return NroHabitacion;
    }

    public void setNroHabitacion(int NroHabitacion) {
        this.NroHabitacion = NroHabitacion;
    }

    public int getHuesped() {
        return Huesped;
    }

    public void setHuesped(int Huesped) {
        this.Huesped = Huesped;
    }

    public int getAnticipo() {
        return Anticipo;
    }

    public void setAnticipo(int Anticipo) {
        this.Anticipo = Anticipo;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
