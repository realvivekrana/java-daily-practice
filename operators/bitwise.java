package operators;

public class bitwise {
    public static void main(String[] args) {
        //Bitwise operators
        int a = 2;  //10 => 00000000 00000000 000000000 00000010
        int b = 3;  //11 => 00000000 00000000 000000000 00000011
        int c = a & b; //10 => 2
        int d = a | b; //11 => 3
        int e = a ^ b; //01 => 1
        int f = ~a;    //-3  /11111111 11111111 111111111 11111101
        System.out.println(c + " , " + d + " , " + e + " , " + f);

        //Shift operators
        int g = 1;   //000000000 000000000 000000000 000000001
        g = g << 30; //10000000 000000000 000000000 000000000
        System.out.println(g);

        //Right shift operators
        byte h = 1;
        h = (byte)(h << 1); //00000010 => 2
        System.out.println(h);
    }
}
