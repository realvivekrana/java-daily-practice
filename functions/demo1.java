package functions;

public class demo1 {
    public static void main(String[]args){
        // Functions in Java
        greet();

        sayHello("Aditya");  //Arguments

        System.out.println(getNumber());

        System.out.println(multiply(2,4));
    }
    //No Ip, No op
    static void greet(){
        System.out.println("Hello");
        //return;
    }

    // IP, No op
    static void sayHello(String name){  //Number of parameters can be anything
        System.out.println("Hello, " + name);
    }

    //No Ip, op
    static int getNumber(){
        return 10;
    }
    
    //Ip, op
    static int multiply(int a, int b){
        return (a * b);
    }
}
