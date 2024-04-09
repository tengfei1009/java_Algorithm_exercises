package 二分查找;

public class x的平方根4 {
    public int mySqrt(int x) {
        if(x<2) {
            return x;
        }
        int l = 0;
        int r = x;
        while(l<r){
            int mid = l + (r-l)/2;
            if((long)mid*mid == x){
                return mid;
            }else if(mid * mid <x){
                l = mid+1;
            }else {
                r= mid;
            }
        }
        return l-1;
    }
}
