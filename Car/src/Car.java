/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Car {


        public String name;
        public final int modle = 2022;
        public float saraly;
        
        
        
       
public Car(String name , float saraly){
    this.name = name;
    this.saraly = saraly;




}
public void print(){
    System.out.println("Name:" + name);
    System.out.println("Saraly:" + saraly);
    System.out.println("Model:"+modle);
    System.out.println("--------------------");
}
    
}
