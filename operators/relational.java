package operators;

public class relational {
    //Relational operators : ==, !=, <, >, <=, >=
    public static void main(String[] args) {
    int a = 5;
    int b = 10;

    boolean c = (a == b);
    System.out.println(c); //false

    boolean d = (a != b);
    System.out.println(d); //true

    boolean e = (a < b);
    System.out.println(e); //true

    boolean f = (a > b);
    System.out.println(f); //false

    boolean g = (a <= b);
    System.out.println(g); //true

    boolean i = (a >= b);
    System.out.println(i); //false
    }
}
