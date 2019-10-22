package Homework4;

import java.awt.*;

public class Cat_zad3 {

    public String name;
    public String foods;
    public int sleep;
    public String play ;
    public String eating;
    public boolean Hungry;

   public void eat(String foods) {
       if(Hungry==true) {
           System.out.println(name + " is eating " + foods);
           Hungry=false;
       }
       else
        {
           System.out.println(name+ " is not hungry!");
        }
   }

   public void sleep(int sleep){
       System.out.println(name+ " is going to sleep "+ sleep + " hours");
       Hungry = true;
   }

   public void play(String play){
       System.out.println(name+ "is playing "+ play);
       Hungry = true;

   }


    public Cat_zad3 (String name){
        this.name=name;
        this.foods="";
        this.sleep= 0;
        this.play="";
        this.Hungry=true;

    }
}
