package demo;

public class demo1 {
    public static void main(String[]args){
        //Implicit conversion
        // (byte to init)
        // byte b =24;
        // int i;

        // i = b;
        // System.out.println(i); //24

        //character to int
        // char c = 'a';
        // int i;

        // i = c;

        // System.out.println(i);  //97

        //Explicit conversion
        // int i = 300;
        // byte b;  //-128 to +127

        // b = (byte) i;
        // System.out.println(b); //300 % 256 = 44

        //Truncating conversion
        float f = 15.678f;
        int i;

        i = (int)f;
        System.out.println(i);
    }
}
