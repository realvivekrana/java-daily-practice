package functions;

public class array {
    static int sumArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }
    public static void main(String[]args){
        int[] numbers = {2,3,5,6};
        System.out.println(sumArray(numbers));
    }
}
