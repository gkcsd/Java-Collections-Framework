package advancejavaprograms;

import java.io.*;
import java.util.*;


class Bicycle
{
    public int gear;
    public int speed;

    Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this. speed = speed;
    }

    public void applyBreak(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }
}

class MountainBike extends Bicycle
{
    public int setHeight;

    public MountainBike(int gear, int speed, int setHeight)
    {
        super(gear,speed);

        this.setHeight = setHeight;
    }

    public void setHeight(int newValue)
    {
        setHeight = newValue;
    }

}
public class InheritanceOne {


    public static void main (String[] args) {

        MountainBike mb = new MountainBike(3, 100, 25);

        mb.speedUp(20);
        mb.setHeight(22);
    }
}



