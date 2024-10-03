
package Datos;

import java.util.Objects;


public class DatosHuespedes {
    private int id;
    private String nombre;
    private String apellido;
    private String correo ;
    private int telefono;
    private int documento;
    
    
 public DatosHuespedes(String nombre){
     this.nombre = nombre;
 }    
    
 public DatosHuespedes(String nombre, String apellido, String correo, int telefono, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + Objects.hashCode(this.apellido);
        hash = 31 * hash + Objects.hashCode(this.correo);
        hash = 31 * hash + this.telefono;
        hash = 31 * hash + this.documento;
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
        final DatosHuespedes other = (DatosHuespedes) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.telefono != other.telefono) {
            return false;
        }
        if (this.documento != other.documento) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.correo, other.correo);
    }

    @Override
    public String toString() {
        return "DatosHuespedes{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + ", documento=" + documento + '}';
    }
    
    
}