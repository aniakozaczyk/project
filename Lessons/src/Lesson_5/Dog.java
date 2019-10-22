package Lesson_5;

public class Dog extends Pet {

    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    protected void soundSth(){
        System.out.println("wof wof");
    }
}
