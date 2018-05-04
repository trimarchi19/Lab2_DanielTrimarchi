/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_danieltrimarchi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author X
 */
public class Lab2_DanielTrimarchi {

    public static Scanner lea = new Scanner(System.in);
    static ArrayList<Examenes> Pruebas = new ArrayList();
    static ArrayList<Cuenta> Cuentas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opt = 0;
        // TODO code application logic here   
        while (opt != 4) {
            System.out.println("------------------\n");
            System.out.println("1)Administracion:\n"
                    + "2)Crear Cuenta:\n"
                    + "3)Log In:\n"
                    + "4)Salir\n"
                    + "Escoja su Opcion");
            opt = lea.nextInt();
            switch (opt) {
                case 1:
                    Administracion();
                    break;
                case 2:
                    Crearcuenta();
                    break;
                case 3:
                    boolean resp=Entra();
                    if(resp==true){
                        System.out.println("1)Realizar Examen");
                        int opt2=lea.nextInt();
                        switch(opt2){
                            case 1:
                                if(Pruebas.size()>0){
                                    int puntos=0;
                                    System.out.println(Pruebas.get(0).materia);
                                    System.out.println("Desea hacerlo?s/n");
                                    char resp1=lea.next().charAt(0);
                                    if(resp1=='s'||resp1=='S'){
                                        System.out.println(Pruebas.get(0).materia);
                                        System.out.println(Pruebas.get(0).Nota);
                                        System.out.println(Pruebas.get(0).examen2);
                                        System.out.println("---------------------");
                                        int questions=(Pruebas.get(0).examen2.size());
                                        lea.nextLine();
                                        for(int j=0;j<questions;j++){
                                            System.out.println(j+1+")Ingrese las respuestas");
                                            String respues=lea.nextLine();
                                            if(respues.equals(Pruebas.get(0).resp0.get(j))){
                                                puntos+=1;
                                            }
                                        }
                                        System.out.println("El usuario contesto bien"+puntos+"-preguntas");
                                       
                                    }
                                    
                                }else{
                                    System.out.println("No tiene examenes pendientes");
                                }
                                break;
                        }
                    }
                    
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }

    public static void Administracion() {
        System.out.println("------------------\n");
        System.out.println("1)Crear Examen:\n"
                + "2)Ingresar Nota:\n"
                + "3)Ver Notas:\n"
                + "4)Modificar Notas:\n"
                + "Escoja su Opcion");
        int opt = lea.nextInt();
        switch (opt) {
            case 1:
                Pruebas.add(new Examenes());             

                break;
            case 2:
                lea.nextLine();
                for(int i=0;i<Cuentas.size();i++){
                    System.out.println(Cuentas.get(i).Us);
                }
                System.out.println("Ingrese el usuario que desea meterle nota");
                String us=lea.nextLine();
                for(int i=0;i<Cuentas.size();i++){
                    if((Cuentas.get(i).Us).equals(us)){
                        System.out.println("Inserte la nota del estudiantes");
                        int nota=lea.nextInt();
                        Cuentas.get(i).setNota(nota);
                    }
                }
                break;
            case 3:
                for(int i=0;i<Cuentas.size();i++){
                        System.out.println(i+1+")Estudiantes:"+Cuentas.get(i).Us+"--Nota:"+Cuentas.get(i).Nota);      
                    }
                System.out.println("-----------------------------");
                break;
            case 4:
                break;
            default:
                break;
        }

    }

    public static void Crearcuenta() {
        Cuentas.add(new Cuenta());
    }

    public static boolean Entra() {
        int cont = 1;
        boolean bresp=false;
        if (Cuentas.size() > 0) {
            lea.nextLine();
            System.out.println("Ingrese su usuario:");
            String us = lea.nextLine();
            System.out.println("Ingrese password:");
            String pass = lea.nextLine();
            for (int i = 0; i < Cuentas.size(); i++) {
                cont=0;
                String comprobante =Cuentas.get(i).cuenta;
                StringTokenizer st1 = new StringTokenizer(comprobante, "-");
                while (st1.hasMoreTokens()) {
                    Object nextElement1 = st1.nextToken();
                    String Sa = nextElement1.toString();
                    if (Sa.equals(us)||Sa.equals(pass)) {
                        cont += 1;
                    }
                            
                }
            }

        }else{
            System.out.println("No has creado una cuenta");
        }
        if(cont==2){
            bresp=true;
        }
        return bresp;
    }
}
