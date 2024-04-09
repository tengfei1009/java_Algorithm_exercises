import java.util.*;

public class 滑动窗口2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] aa = new int[n - k + 1];
        int[] bb = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Deque<Integer> maxQueue = new LinkedList<>();
        Deque<Integer> minQueue = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            while (!maxQueue.isEmpty() && arr[i] >= arr[maxQueue.peekLast()]) {
                maxQueue.pollLast();
            }
            while (!minQueue.isEmpty() && arr[i] <= arr[minQueue.peekLast()]) {
                minQueue.pollLast();
            }
            maxQueue.offerLast(i);
            minQueue.offerLast(i);
        }

        aa[0] = arr[maxQueue.peekFirst()];
        bb[0] = arr[minQueue.peekFirst()];

        for (int i = k; i < n; i++) {
            while (!maxQueue.isEmpty() && maxQueue.peekFirst() <= i - k) {
                maxQueue.pollFirst();
            }
            while (!minQueue.isEmpty() && minQueue.peekFirst() <= i - k) {
                minQueue.pollFirst();
            }
            while (!maxQueue.isEmpty() && arr[i] >= arr[maxQueue.peekLast()]) {
                maxQueue.pollLast();
            }
            while (!minQueue.isEmpty() && arr[i] <= arr[minQueue.peekLast()]) {
                minQueue.pollLast();
            }
            maxQueue.offerLast(i);
            minQueue.offerLast(i);
            aa[i - k + 1] = arr[maxQueue.peekFirst()];
            bb[i - k + 1] = arr[minQueue.peekFirst()];
        }

        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < bb.length; i++) {
            System.out.print(bb[i] + " ");
        }
    }
}
