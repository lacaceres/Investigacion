/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2.objetos;

/**
 *
 * @author ORLANDO
 */ 
//public final class Alumno extends Persona{
public class Alumno extends Persona {
    private int NumeroCuenta; 

    public Alumno() { 
        super();
    } 

    public Alumno(int NumeroCuenta, int Id, String Nombre) {
        super(Id, Nombre);
        this.NumeroCuenta= NumeroCuenta;
        
    }
    

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }
//    @Override
//    public String toString(){ 
//        return "";
//    }
}
