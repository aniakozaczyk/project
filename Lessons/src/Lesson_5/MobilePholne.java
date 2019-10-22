package Lesson_5;

public class MobilePholne {
    private String brand;
    private String model;
    private int batteryCapacity;
    private int batteryAmount;
    private int memory;
    private int freeMemory;

    public MobilePholne(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryCapacity;
        this.memory = memory;
        this.freeMemory = memory;
    }

    public int charge() {
        batteryAmount = batteryCapacity;
        return batteryAmount;
    }

    public void installAplication(String applicationName, int memoryUsege) {

        if (freeMemory < memoryUsege) {
            System.out.println("There are no free memory to instal " + applicationName);
        } else {
            System.out.println("Aplication " + applicationName + "has been instaled");
            freeMemory = freeMemory - memoryUsege;
        }
        System.out.println("Free memory left: " + freeMemory);
    }

    public void useApplication (String applicationName, int hours){
        int powerUsage = hours * 100;

        if(batteryAmount> powerUsage){
            batteryAmount=batteryAmount-powerUsage;
            System.out.println("Application " + applicationName+ " has been used for "+ hours);

        }else if (batteryAmount>0){
            batteryAmount=0;
            int realyHoursOfUsage = batteryAmount/100;
            System.out.println("Aplication "+ applicationName + "has been used for " +realyHoursOfUsage);
            System.out.println("Battery discharged!");

        }else {
            System.out.println("Battery discharged!");
        }

    }
}