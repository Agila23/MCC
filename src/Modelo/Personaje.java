/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author puesto1
 */
public class Personaje {
    
    private String Nombre;
    private String Apellidos;
    private String Profesion;
    private String Sexo;
    
    private int Fuerza;
    private int Constitucion;
    private int Tamano;
    private int Destreza;
    private int Inteligencia;
    private int Educacion;
    
    
    
    private int Vida;
    private int Bonus_Atq;
    private int Dinero;
    
    
    private ArrayList<String> habiliades = new ArrayList();
    

    
    public Personaje(){
        
        this.Nombre = "";
        this.Apellidos = "";
        this.Profesion = "";
        this.Sexo = "";
        
        this.Fuerza = 50;
        this.Constitucion = 50;
        this.Tamano = 50;
        this.Destreza = 50;
        this.Inteligencia = 50;
        this.Educacion = 50;
        
        
        
        this.Vida = 0;
        this.Bonus_Atq = 0;
        this.Dinero = 0;
        
        ArrayList<String> habilidades = this.habiliades;
        
    }
    
    public Personaje(String Nom,String Ape,String Prof,String Sexo,int Fue,int Con,int Tam,int Des,int Int,int Edu,int Vid,int Bon,int Din,ArrayList<String>hab){
        
        
        this.Nombre = Nom;
        this.Apellidos = Ape;
        this.Profesion = Prof;
        this.Sexo = Sexo;
        
        this.Fuerza = Fue;
        this.Constitucion = Con;
        this.Tamano = Tam;
        this.Destreza = Des;
        this.Inteligencia = Int;
        this.Educacion = Edu;
        
        
        
        this.Vida = Vid;
        this.Bonus_Atq = Bon;
        this.Dinero = Din;
        
        this.habiliades = hab;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

    public int getConstitucion() {
        return Constitucion;
    }

    public void setConstitucion(int Constitucion) {
        this.Constitucion = Constitucion;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public int getDestreza() {
        return Destreza;
    }

    public void setDestreza(int Destreza) {
        this.Destreza = Destreza;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public void setInteligencia(int Inteligencia) {
        this.Inteligencia = Inteligencia;
    }

    public int getEducacion() {
        return Educacion;
    }

    public void setEducacion(int Educacion) {
        this.Educacion = Educacion;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getBonus_Atq() {
        return Bonus_Atq;
    }

    public void setBonus_Atq(int Bonus_Atq) {
        this.Bonus_Atq = Bonus_Atq;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<String> getHabiliades() {
        return habiliades;
    }

    public void setHabiliades(ArrayList<String> habiliades) {
        this.habiliades = habiliades;
    }

    
   
    
    
    
}
