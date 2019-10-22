package Lesson_5;

public class Cat extends Pet {


    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    protected void soundSth() {
        System.out.println("miau ");
    }



}
