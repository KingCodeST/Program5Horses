package com.company;

import javax.swing.*;

public class HorseUserControl {

    int[] horses =new int[20];
    int numberOfHorses=20;

    Horse horse;
    RaceHorse raceHorse;
    WorkHorse workHorse;

    public HorseUserControl(int[] horses, int numberOfHorses) {
        this.horses = horses;
        this.numberOfHorses = numberOfHorses;
    }



    public static int getNumber(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    private void add()
    {

        int user=0;
        if(user == 1)
        {
            for(int i= 0; 1<horses.length; i++ )
            {

          //      raceHorse.setNumberOfWins();
            }

        }else
        {
            for(int i= 0; 1<horses.length; i++ )
            {

                //      WorldHorse.setNumberOfWins();
            }

        }


    }

    private void displayAllHorses()
    {

    }

    public void displayAllRaceHorses()
    {

    }

    public void displayAllWorkHorses()
    {

    }

    private int findHorse(){
        int k=0;
        return k;
    }

    private void horseWinRace()
    {

    }

    private void canItCarryWorkLoad(){

    }




    private int menu()
    {


        String message="1:  Add a Horse \n"
        + "2: Display all horses \n"
        + "3: Display all race horses \n"
        + "4: Display all work horses \n"
        + "5: Can the workhorse carry the load? \n"
        + "6: A racehorse has won anther race. \n"
        + "9: Exit";


        return getNumber(message);
    }

    public void menuControl()
    {



        final int Exit =9;
       int userChoice  =menu();
       String outputString ="";

        while(userChoice !=Exit)
        {
            switch(userChoice){
                case  1:
                   add();


                    break;
                case  2: displayAllHorses();
                    break;
                case  3: displayAllRaceHorses();
                    break;
                case  4: displayAllWorkHorses();
                    break;
                case  5: canItCarryWorkLoad();
                    break;
                case  6: horseWinRace();
                    break;
                case  9: ;
                    break;
            }
           userChoice = menu();
        }
        System.exit(0);

//                 1: add()
//                 2: displayAllHorses();
//                 3: displayAllRaceHorses();
//                 4: displayAllWorkHorses();
//                 5: canItCarryWorkLoad();
//                 6: horseWinRace();
//                 9: program stops;



    }









}
