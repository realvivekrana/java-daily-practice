package functions;

public class stringNumber {
    static String greet(String name){
        return "Hello, " + name;
    }
    static int length(String s){
        return s.length();
    }
    public static void main(String[]args){
        System.out.println(greet("Vivek"));
        System.out.println(length("Rana"));
    }
}
