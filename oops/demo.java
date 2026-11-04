package oops;

public class demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aditya";
        s1.age  = 22;
        s1.rollNumber = 10;
        s1.college = "IIT Kharagpur";

        s2.name = "Vishal";
        s2.age = 30;
        s2.rollNumber = 40;
        s2.college = "IIT Guhati";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendence marked by " + name);
    }

    void print(){
        System.out.println(name + " , " + rollNumber + " , " + college);
    }
}
