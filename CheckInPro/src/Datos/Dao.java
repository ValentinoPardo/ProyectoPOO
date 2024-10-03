/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

// CRUD

import java.util.List;
public interface Dao<T> {
    public abstract void save(T data) throws DuplicateEntryException;
    public abstract T getById(int id) throws NotFoundException;
    public abstract List<T> listAll();
    public abstract void update(T data);
    public abstract void delete(T data);
}