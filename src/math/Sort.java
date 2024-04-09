package math;
import java.util.Arrays;
public class Sort {
    public static void main(String[]args){
        int []arr ={5,4,3,2,1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
