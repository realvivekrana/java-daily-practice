package functions;

public class basic {
    // Method: returnType name(parameters)
    static int add(int a, int b){
        return a + b;
        }
    static void greet(String name){
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args){
        System.out.println(add(5,3));
        greet("Vivek");
    }
}
