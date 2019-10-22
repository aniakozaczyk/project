package Lesson_4;

public class Laptop {


        public String name;
        public int weight;
        public String procesorType;
        public boolean isSwitchedOn;
        public static int counter;

        public void checkPower () {
            if (isSwitchedOn) {
                System.out.println("Laptop power is On");
            } else {
                System.out.println("Laptop power is Off");
            }

        }

        public boolean switchOn () {
            return isSwitchedOn = true;
        }

        public boolean switchOff () {
            return isSwitchedOn = false;
        }


    public Laptop(String name, int weight, String procesorType){
        this.name=name;
        this.weight=weight;
        this.procesorType= procesorType;
        this.isSwitchedOn=false;
        counter++;
    }
    public Laptop(){
            this.isSwitchedOn=false;
    }

    public static void main(String[] args) {

           Laptop dell = new Laptop("Dell", 3, "Intel");
            dell.switchOff();
            dell.checkPower();
            dell.switchOn();
            dell.checkPower();

            Laptop macBook= new Laptop();
            macBook.name="MacBook Pro";
            macBook.weight=2;
            macBook.procesorType="mac";
            macBook.switchOn();
            macBook.checkPower();
            macBook.switchOff();
            macBook.checkPower();


        }

}
