package advancejavaprograms;

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class BicycleTwo
{
    public int gear;
    public int speed;

    BicycleTwo(int gear, int speed)
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

    public String printInfo()
    {
        return ("No of gears are "+ gear + "\n" + "speed of bicycle is " + speed);
    }
}

class MountainBikeTwo extends BicycleTwo
{
    public int setHeight;

    public MountainBikeTwo(int gear, int speed, int setHeight)
    {
        super(gear,speed);

        this.setHeight = setHeight;
    }

    public void setHeight(int newValue)
    {
        setHeight = newValue;
    }

}
public class InheritanceTwo {


    public static void main (String[] args) {

        MountainBikeTwo mb = new MountainBikeTwo(3, 100, 25);
        System.out.println(mb.printInfo()+"\n");

        mb.speedUp(20);
        System.out.println(mb.printInfo()+"\n");

        mb.setHeight(22);
        System.out.println(mb.printInfo()+"\n");



    }
}



