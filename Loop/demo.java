package Loop;

public class demo {
    public static void main(String[] args) {
        //comma seprated variation
        for(int i = 1, j = 1; i <= 10; i++, j+=2){
            System.out.println(i * j);
            // 1 * 1 = 1
            // 2 * 3 = 6
            // 3 * 5 = 15
            // 4 * 7 = 28
            // 5 * 9 = 45
        }
    }
}
