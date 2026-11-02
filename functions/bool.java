package functions;

public class bool {
    static boolean NewValue(int a){
        return a % 2 == 0;
    }
    public  static void main(String[]args){
        System.out.println(NewValue(5));
        System.out.println(NewValue(4));
    }
}
