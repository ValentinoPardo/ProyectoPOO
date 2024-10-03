/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.ArrayList;
import java.util.List;


public class DatosHuespedesDaoListImpl implements Dao<DatosHuespedes>{
    private List<DatosHuespedes> huespedes;
    
    public DatosHuespedesDaoListImpl(){
        this.huespedes = new ArrayList();
    }
    
    @Override
    public void save(DatosHuespedes data) throws DuplicateEntryException{
        for (DatosHuespedes h: this.huespedes){
            if (h.getId() == data.getId()){
                throw new DuplicateEntryException("Huesped with id "+ data.getId() +"already exists");
            }
        }
        data.setId(this.huespedes.size()+1); //temporal buscar id mas alto en lista
        this.huespedes.add(data);
    }

    @Override
    public DatosHuespedes getById(int id) throws NotFoundException {
        for (DatosHuespedes h: this.huespedes) {
            if ( h.getId() == id) {
                return h;
            }
        }
        throw new NotFoundException("Huesped with id " + id + " not found");
    }

    @Override
    public List<DatosHuespedes> listAll() {
        return this.huespedes;
    }

    @Override
    public void update(DatosHuespedes data) { /*Buscar al huesped por id y asignar informacion "data" sobre ese elemento de mismo id */
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(DatosHuespedes data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
