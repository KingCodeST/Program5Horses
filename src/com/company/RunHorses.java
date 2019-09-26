package com.company;

public class RunHorses {

    public static  void main(String[] args)
    {
        int[] horseObject=new int[5];
        HorseUserControl huC= new HorseUserControl(horseObject,5);
        huC.menuControl();
    }



}
