package Loop;

public class nestedLoop {
    public static void main(String[]args){

        // for(int i = 1; i <= 5; i++){
            
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }


        /*
        *
        * *
        * * *
        * * * *
        * * * * * 
        */


        //Jump Statements in Java
        //break, continue

        // for(int i = 1; i <= 10; i++){
        //     System.out.println(i);

        //      if(i > 5){
        //      break;
        //     }
        // }

        //whether a number is prime or not
        // int p = 9;

        // //2,3,4,5,.......6,7

        // int i;

        // for(i = 2; i < p; i++){
        //     if(p % i == 0){
        //         System.out.println("The number is not a prime");
        //         break;
        //     }
        // }

        // if(i == p){
        //     System.out.println("The number is prime");
        // }

        // for(int i = 1; i <= 10; i++){
        //     // if(i % 2 != 0){
        //     //     System.out.println(i);
        //     //     break;
        //     // }
        //     if(i % 2 == 0){
        //         continue;
        //     }

        //     System.out.println(i);
        // }

        //Break in nested loops
        // for(int i = 1; i <= 10; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");

        //         if(j >= 5){
        //             break;
        //         } 
        //     }
        //     System.out.println();
        // }
        /*
        * 
        * *
        * * *
        * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        */

        //Labels
        outer: for(int i = 1; i <= 10; i++){
        inner:    for(int j = 1; j <= i; j++){
                System.out.print("* ");

                if(j >= 5){
                    break outer;
                } 
            }
            System.out.println();
        }
        /*
        * 
        * * 
        * * *
        * * * *
        * * * * *
        */

        //code blocks
        // first:{
        //     second:{
        //         third:{
        //             System.out.println("Hello");
        //             break first;
        //         }
        //     }
        // }
    }
}


