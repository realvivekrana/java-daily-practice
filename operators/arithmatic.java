package operators;

public class arithmatic {
    public static void main(String[]args){
        //Arithmatics operators = +, -, *, /, %, +=, -=, *=, /=, %=, --
        int a = 5;
        int b = 10;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println(a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g + ","  );
        int h = a + 2; //Since this is okay in CSE
        h += 2; //h = h+2; //9
        h -= 2;
        System.out.println(h);
    }
}
