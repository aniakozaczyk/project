package Homework4;

public class MobilePhone {

    public String brand;
    public String model;
    public int batteryCapacity;
    public int batteryAmount;
    public int memory;
    public int freeMemory;
    public String applicationName;
    public int memoryAmount;
    public int hours;
    public boolean isCharged;


  public void installAplication(String applicationName,int memoryAmount ){
      if (memoryAmount<memory) {
          System.out.print("Application " + applicationName + " has been instaled on " + model);
          memory = memory - memoryAmount;
          System.out.println(". Remain memory: " + memory + " MB");
      }else {
          System.out.println("Appplication "+ applicationName + " can't be installed on Samsung galaxy. There are no enough memory. ");
      }
  }

  public void use (String applicationName, int hours) {





        if (hours * 100 < batteryAmount) {
            System.out.print("Application " + applicationName + " has been run for " + hours + " hours on " + model);
            batteryAmount = batteryAmount - hours * 100;
            System.out.println(". Remain battery capacity:  " + batteryAmount + " mAh");
            isCharged=true;


        } else if (hours * 100 == batteryAmount+100) {

            System.out.print("Application " + applicationName + " has been run for " + hours + " hours on " + model);
            batteryAmount = batteryAmount - hours * 100;
            System.out.println(". Phone has been discharged.");
            isCharged = false;


        } else if (hours * 100 > batteryAmount) {
            System.out.println("Application " + applicationName + " can't be run on " + model + ". Phone discharged");
            isCharged = false;

         }



  }


        public boolean  charge (){
            this.batteryAmount = batteryCapacity;
            return isCharged=true;
        }

        public void chechCharg(){
            System.out.println(batteryAmount);
        }



    public MobilePhone(String model, int batteryCapacity, int memory ){
        this.model=model;
        this.memory=memory;
        this.batteryCapacity=batteryCapacity;
        //this.applicationName = "";
        //this.hours=0;
        this.isCharged= true;
        this.batteryAmount=batteryCapacity;


    }



}
