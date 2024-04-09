package 二分查找;

public class 有效的完全平方数2 {
    public boolean isPerfectSquare(int num) {
        if(num<2) {
            return true;
        }
        int l = 0 ;
        int r = num;
        while(l <r) {
            int mid = l+ (r-l)/2;
            if((long)mid * mid == num){
                return true;
            }else if((long)mid * mid<num){
                l = mid +1;
            }else {
                r = mid;
            }
        }
        return false;
    }
}
