/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

// CRUD

import Datos.DatosReservas;
import Datos.Huespedes;
import java.util.List;


public interface DAO<T> {
    public void crear(Huespedes huesped) throws Exception;
    public void modificar(Huespedes huesped) throws Exception;
    public void borrar(int id) throws Exception;
    public List<T> listar() throws Exception;
 
}