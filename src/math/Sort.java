package math;
import java.util.Arrays;
public class Sort {
    public static void main(String[]args){
        Integer []arr ={5,4,3,2,1};
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
