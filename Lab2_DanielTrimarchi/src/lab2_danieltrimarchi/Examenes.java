/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_danieltrimarchi;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author X
 */
public class Examenes {
  Scanner lea= new Scanner(System.in);
    String materia="";
  String Nota="NOTA:";
  //ArrayList <String> preguntas=new ArrayList<>();  
  String Preguntas="";
  ArrayList resp0=new ArrayList();
  ArrayList examen2=new ArrayList();
   ArrayList examen=new ArrayList();  
   String muestra="";
    public Examenes(){
        System.out.println("");
        System.out.println("Ingrese la Materia");
        materia=lea.nextLine();
        materia=materia.toUpperCase();
        System.out.println("Cuantas preguntas desea Ingresar:?");
        int preg=lea.nextInt();
        lea.nextLine();
        for (int i=0;i<preg;i++){
            System.out.println(i+1+")Ingrese la pregunta");
            String pre=lea.nextLine();
            System.out.println("Ingrese la respuesta:");
             String resp=lea.nextLine();
            Preguntas+=i+1+")"+pre+"?\nR: "+resp+"-\n";
            examen2.add("¿"+pre+"?\n");
            resp0.add(resp);
        }
    examen.add("Examen:"+materia+"\n");
    examen.add(Nota+"\n");
    examen.add(Preguntas);  
    String Muestras="";
    for(Object muestra:examen){
        this.muestra+=muestra.toString()+"-\n";    
    }
}
    public ArrayList getArrayList(){
      return examen;
        
    }
    public void setNota(int nota){
     this.Nota=String.valueOf(nota);
        
    }
    public String getExamen(){
        return muestra;
    }
    @Override
    public String toString(){
        
        return examen.toString();
    }
}
