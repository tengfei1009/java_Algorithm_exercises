package 二分查找;

public class x的平方根3 {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        while (l<r) {
            int mid = l +(r-l)/2+1; //向上取整,保证 r 和 l 相邻时,使得 判断 r -1 与 r相等,退出循环
            if((long)mid*mid <= x){
                l = mid;
            }else {
                r = mid -1;
            }
        }
        return l;
    }

}
