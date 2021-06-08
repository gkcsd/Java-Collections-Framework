package arraylist;

import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");

        Pair<String,Integer> p1 = new Pair<>("Ganesh",24);
        p1.getDescription();

        Pair<Boolean,Character> p2 = new Pair<>(true,'G');
        p2.getDescription();
    }
}
