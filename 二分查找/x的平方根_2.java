package 二分查找;

public class x的平方根_2 {
    public int mySqrt(int x) {
        //开根号肯定是小于等于,所以最后一次,使得 l +1 变成 r 判断了mid = r 因为mid大于,所以导致了原来的r -1 变成了 l
        //取最接近的值也就是要求,最后 r 必须减 1 r=l 循环结束, r就是那个最接近根号的数
        int l = 0;
        int r = x;
        while (l<r){
            int mid = l+(r-l)/2 +1;
            if((long)mid *mid<=x){
                l =mid;
            }else {
                r=mid-1;
            }
        }
        return l;
    }
}
