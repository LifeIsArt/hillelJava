package oop;

import animalsTest.Cat;
import animalsTest.Dog;
import animalsTest.Zoo;

public class App {
    public static void main(String[] args) {
        Cat murka= new Cat(1,3,2.4,"Black","Murka",true);
        Dog tuzik = new Dog (2,5,3.0,"Ginger","Tuzik",true);
        Cat barsik= new Cat(2,4,4.5,"Grey","Barsik",false);

        Zoo zoo = new Zoo();
        zoo.addAnimal(murka);
        zoo.addAnimal(barsik);
        zoo.addAnimal(tuzik);


       zoo.voiceAll();

//        System.out.println(murka.getVoice());
//        System.out.println(barsik.getVoice());
//        System.out.println(tuzik.getVoice());

    }

}
