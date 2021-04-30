package collectionframeworkprograms.wildcard;

import java.util.ArrayList;

class StudentMain {
    void print() {
        System.out.println("Student class");
    }
}
class EnggStudentChild extends StudentMain {
    void print() {
        System.out.println("Engineering Student class");
    }
}
class ManagStudentChild extends StudentMain {
    void print() {
        System.out.println("Management Student class");
    }
}

public class ProgramOneInheritanceWildCard {
    public static void main(String[] args) {
        ArrayList<EnggStudentChild> al1 = new ArrayList<>();
        al1.add(new EnggStudentChild());
        al1.add(new EnggStudentChild());

        ArrayList<ManagStudentChild> al2 = new ArrayList<>();
        al2.add(new ManagStudentChild());
        printStudents(al1);
        printStudents(al2);
    }
    public static void printStudents(ArrayList<? extends StudentMain> al) {
        for(StudentMain s : al) {
            s.print();
        }
    }
}
