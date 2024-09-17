
package Datos;

import java.util.Objects;


public class DatosReservas {
    
    
    private String CheckIn;
    private String Checkout;
    private int NroHabitacion; 
    private String Huesped;
    private int Se�a;

    public DatosReservas(String CheckIn, String Checkout, int NroHabitacion, String Huesped, int Se�a) {
        this.CheckIn = CheckIn;
        this.Checkout = Checkout;
        this.NroHabitacion = NroHabitacion;
        this.Huesped = Huesped;
        this.Se�a = Se�a;
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

    public String getHuesped() {
        return Huesped;
    }

    public void setHuesped(String Huesped) {
        this.Huesped = Huesped;
    }

    public int getSe�a() {
        return Se�a;
    }

    public void setSe�a(int Se�a) {
        this.Se�a = Se�a;
    }

    @Override
    public String toString() {
        return "DatosReservas{" + "CheckIn=" + CheckIn + ", Checkout=" + Checkout + ", NroHabitacion=" + NroHabitacion + ", Huesped=" + Huesped + ", Se\u00f1a=" + Se�a + '}';
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.CheckIn);
        hash = 79 * hash + Objects.hashCode(this.Checkout);
        hash = 79 * hash + this.NroHabitacion;
        hash = 79 * hash + Objects.hashCode(this.Huesped);
        hash = 79 * hash + this.Se�a;
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
        if (this.Se�a != other.Se�a) {
            return false;
        }
        if (!Objects.equals(this.CheckIn, other.CheckIn)) {
            return false;
        }
        if (!Objects.equals(this.Checkout, other.Checkout)) {
            return false;
        }
        return Objects.equals(this.Huesped, other.Huesped);
    }
    
    
}
