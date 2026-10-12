package demo;

public class demo {
    public static void main(String[]args){

        //Integers --> byte, short, int, long
        //Binary(2), Ocatal(8), Hexadecimal(16) number system
        //byte b = 5; //decimal
        //byte b = 0b101; //Binary
        //byte b = 07;  //0 - 7 -->Octal
        byte b = 0Xf;   //Hexadecimal (0 - 15) --> 0-9, A,B,C,D,F
        short s = 10;
        int i = 4000;
        long l = 10000;

        //Real numbers
        float f = 10.54f;
        double d = 23.0987;

        //character value
        char c = 'a';  //'a' --> integer --> binary --> store

        //boolean value
        boolean bool = false;
        
        System.out.println("Integer value -->" + b +  "," + s + "," + i + "," + l);
        System.out.println("Real Value -->" + f + "," + d);
        System.out.println("Character value -->" + c);
        System.out.println("Boolean value -->" + bool);
    }
}
