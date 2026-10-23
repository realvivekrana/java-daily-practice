package controlFlow;

public class switchStatements {
    public static void main(String[]args){
        //switch statements -> byte, int, short, char, Enumeration
    int i = 5;

    switch(i){
        case 1:
            System.out.println("i is 1");
            break;
        case 2:
            System.out.println("i is 2");
            break;
        case 3:
            System.out.println("i is 3");
            break;
        default:
            System.out.println("i is greater than 3");
            break;
    }
    //switch statements limited uses
    //No dublicates cases
    //after JDK 7 Strings can also be used as switch expression
  }
}
