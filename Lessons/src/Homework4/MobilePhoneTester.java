package Homework4;

public class MobilePhoneTester {
    public static void main(String [] args ){

        MobilePhone samsung =new MobilePhone("Samsung galaxy", 1000, 500);
        samsung.installAplication("Google maps", 100);
        samsung.installAplication("Tinder", 200);
        samsung.installAplication("Pokemon Go", 250);

        samsung.use("You Tube", 5);
        samsung.use("Facebook", 6);
        samsung.use("Angry Birds", 2);

        samsung.charge();
        samsung.use("Angry Birds", 2);
        samsung.chechCharg();



    }

}
