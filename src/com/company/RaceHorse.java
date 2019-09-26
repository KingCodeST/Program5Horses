package com.company;

public class RaceHorse extends Horse {

    private int numberOfRace;
    private int numberOfWins;

    public RaceHorse() {
    }

    public RaceHorse(String name, String colour, double height, int numberOfRace, int numberOfWins) {
        super(name, colour, height);
        this.numberOfRace = numberOfRace;
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfRace() {
        return numberOfRace;
    }

    public void setNumberOfRace(int numberOfRace) {
        this.numberOfRace = numberOfRace;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    private RaceHorse createHorse()
    {
        String message ="";
        int number=0;
        super.setName(message);
        super.setColour(message);
        super.setHeight(number);
        setNumberOfRace(numberOfRace);
        setNumberOfWins(numberOfWins);
        toString();
        return this;
    }



    @Override
    public String toString() {
        return "RaceHorse{" +
                "numberOfRace=" + numberOfRace +
                ", numberOfWins=" + numberOfWins +
                '}';
    }

    public void anotherWin()
    {

    }

    public void anotherRace(){

    }


}
