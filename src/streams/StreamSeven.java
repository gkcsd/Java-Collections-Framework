package streams;

import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class StudentTwo
{
    int roll;
    int marks;
    String name;

    StudentTwo(int r, String n, int m)
    {
        roll=r;
        name=n;
        marks=m;
    }

    int getRoll()
    {
        return roll;
    }

    String getName()
    {
        return name;
    }

    int getMarks()
    {
        return marks;
    }
}


public class StreamSeven {

    public static void main (String[] args) {

        StudentTwo arr[]= {new StudentTwo(110, "abc", 70),
                new StudentTwo(101, "bcd", 80),
                new StudentTwo(120, "xyz", 60)
        };

        Map<Integer,String> m= Arrays.stream(arr)
                .collect(Collectors.toMap(
                        StudentTwo::getRoll,
                        StudentTwo::getName));


        for(Map.Entry<Integer,String> ent: m.entrySet())
        {
            System.out.println(ent.getKey()+" "+ent.getValue());
        }

    }

}
