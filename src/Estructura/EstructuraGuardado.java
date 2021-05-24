/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import Modelo.Personaje;
import java.util.ArrayList;

/**
 *
 * @author Adrig
 */
public class EstructuraGuardado {
    
    private ArrayList<String> inventario = new ArrayList<>();
    private ArrayList<String> palabasClave = new ArrayList<>();
    private ArrayList<String> habilidades = new ArrayList<>();
    
    private  String dialogo;
    private  Personaje personaje;
    private  String rutaImagen;

    public EstructuraGuardado(Personaje p, String dialogo, String rutaImagen, ArrayList inventario, ArrayList palabrasClave) {
        this.dialogo = dialogo;
        personaje = p;
        this.rutaImagen = rutaImagen;
        this.inventario = inventario;
        this.palabasClave = palabrasClave;
    }
    
    public EstructuraGuardado() { }

    public ArrayList<String> getInventario() {
        return inventario;
    }

    public ArrayList<String> getPalabasClave() {
        return palabasClave;
    }
    
    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public String getDialogo() {
        return dialogo;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }
    
    public Personaje getPersonaje() {
        return personaje;
    }

    public void setInventario(ArrayList<String> inventario) {
        this.inventario = inventario;
    }

    public void setPalabasClave(ArrayList<String> palabasClave) {
        this.palabasClave = palabasClave;
    }
    
    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public void setDialogo(String dialogo) {
        this.dialogo = dialogo;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
   
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
   
    
    
    
    
    
    
}
