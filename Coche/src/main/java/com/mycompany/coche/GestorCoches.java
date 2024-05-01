/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coche;

/**
 *
 * @author José
 */
import java.util.HashMap;
import java.util.Map;

public class GestorCoches {
    private Map<Integer, Coche> coches = new HashMap<>();

    public void agregarCoche(Coche coche) {
        coches.put(coche.getId(), coche);
    }
    public Coche obtenerCoche(int id) {
        return coches.get(id);
    }

    public void modificarCoche(int id, Coche cocheModificado) {
        coches.put(id, cocheModificado);
    }

    public void eliminarCoche(int id) {
        coches.remove(id);
    }
}
