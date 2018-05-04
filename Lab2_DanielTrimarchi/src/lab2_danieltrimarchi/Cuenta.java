/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_danieltrimarchi;

import static lab2_danieltrimarchi.Lab2_DanielTrimarchi.lea;

/**
 *
 * @author X
 */
public class Cuenta {
    String cuenta="";
    public Cuenta() {
        lea.nextLine();
        System.out.println("Ingrese usuario*Sin espacios*:");
        String us = lea.nextLine();
        System.out.println("Ingrese el password:");
        String pass = lea.nextLine();
        cuenta=us+"-"+pass;
    }
    @Override
    public String toString(){
        return cuenta;
    }
}
