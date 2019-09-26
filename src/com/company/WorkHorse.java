package com.company;

public class WorkHorse extends Horse {


    private double carryCapacity;
    private int strengthIndicator;

    public WorkHorse() {
    }

    public WorkHorse(String name, String colour, double height, double carryCapacity, int strengthIndicator) {
        super(name, colour, height);
        this.carryCapacity = carryCapacity;
        this.strengthIndicator = strengthIndicator;
    }

    public double getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(double carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    public int getStrengthIndicator() {
        return strengthIndicator;
    }

    public void setStrengthIndicator(int strengthIndicator) {
        this.strengthIndicator = strengthIndicator;
    }

    @Override
    public String toString() {
        return "WorkHorse{" +
                "carryCapacity=" + carryCapacity +
                ", strengthIndicator=" + strengthIndicator +
                '}';
    }

    public boolean canItCarryLoad(double load)
    {
        load =carryCapacity;
        load =strengthIndicator;
        if((carryCapacity == 3)&&(strengthIndicator ==3))
        {
            System.out.println("Strong");
            return true;
        }
        else
        {
            if((carryCapacity == 4)&&(strengthIndicator == 4))
            {
                System.out.println("Very, Very Strong");
                return true;
            }
            if((carryCapacity == 2)&&(strengthIndicator == 2))
            {
                System.out.println("Not too bad");
                return false;
            }if((carryCapacity == 1)&&(strengthIndicator == 1))
            {
                System.out.println("Weak");
                return false;
            }



        }


                return true;


    }

    private WorkHorse createWorkHorse(){
        String message ="";
        int number=0;
        super.setName(message);
        super.setColour(message);
        super.setHeight(number);
        setStrengthIndicator(strengthIndicator);
        setCarryCapacity(carryCapacity);
        toString();
        return this;
    }


}
