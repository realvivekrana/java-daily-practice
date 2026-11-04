package functions;

public class demo2 {
    public static void main(String[] args) {
        //Function overloading

        int x = sum(2,3);
        System.out.println(x);

        int y = sum(5,6);
        System.out.println(y);

        int z = sum2(5,6,7);
        System.out.println(z);

        greet("Aditya", 24);
        greet(24, "Aditya");

        fun();

    }

    static int sum(int a, int b){
        return (a + b);
    }

    static int sum2(int a, int b, int c){ //different types of parameters
        return (a + b + c);
    }

    static int sum(double a, double b){ //different types of parameters
        return (int)(a + b);
    }

    static void greet(String name, int age){
        System.out.println("Hi " + name + ". your age is " + age);
    }

    static void greet(int age, String name){  //ordering of parameter
        System.out.println("Hi " + name + ". your age is " + age);
    }

    static void fun(){
        System.out.println("Hello");
    }

    static int fun2(){
        System.out.println("Hello");
        return 5;
    }
}
