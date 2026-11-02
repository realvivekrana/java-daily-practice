package functions;

public class loops {
    static int sumTill(int n){
        int sum = 0;
        for(int i = 1; i <= n; i ++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[]args){
        System.out.println(sumTill(5));
        System.out.println(sumTill(15));
    }
}
