package 队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {
    static void printMaxAndMin(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> maxDeque = new ArrayDeque<>(); // 存储当前窗口的最大值的索引
        Deque<Integer> minDeque = new ArrayDeque<>(); // 存储当前窗口的最小值的索引

        // 处理窗口的第一个元素
        for (int i = 0; i < k; i++) {   //maxDeque.peekLast()获取队列中最后一个元素的索引
            while (!maxDeque.isEmpty() && arr[i] >= arr[maxDeque.peekLast()]) {
                //将前面比当前小的全部移除
                maxDeque.pollLast();
            }
            while (!minDeque.isEmpty() && arr[i] <= arr[minDeque.peekLast()]) {
                //将前面比当前大的全部移除,只留下最小的
                minDeque.pollLast();
            }
            maxDeque.offerLast(i);
            minDeque.offerLast(i);
        }

        // 处理窗口的后续元素
        for (int i = k; i < n; i++) {//因为索引比窗口大小小1,相当于从第一个窗口移动后的下一个窗口开始
            //先输出,第一次中的最大和最小
            System.out.println("Max: " + arr[maxDeque.peekFirst()] + ", Min: " + arr[minDeque.peekFirst()]);

            // 移除不在当前窗口范围内的最大值和最小值的索引
//            条件maxDeque.peekFirst() <= i - k的作用是移除不在当前窗口范围内的最大值的索引。
//
//            在滑动窗口算法中，当窗口向右滑动时，我们需要移除窗口左侧不再属于当前窗口的元素。这包括当前窗口的最大值索引。
//            通过判断maxDeque.peekFirst() <= i - k，我们可以确定最大值索引是否在当前窗口的范围内。
            while (!maxDeque.isEmpty() && maxDeque.peekFirst() <= i - k) {
                maxDeque.pollFirst();
            }
            while (!minDeque.isEmpty() && minDeque.peekFirst() <= i - k) {
                minDeque.pollFirst();
            }

            // 更新当前窗口的最大值的索引
            while (!maxDeque.isEmpty() && arr[i] >= arr[maxDeque.peekLast()]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(i);

            // 更新当前窗口的最小值的索引
            while (!minDeque.isEmpty() && arr[i] <= arr[minDeque.peekLast()]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(i);
        }
        // 输出最后一个窗口的最大值和最小值
        System.out.println("Max: " + arr[maxDeque.peekFirst()] + ", Min: " + arr[minDeque.peekFirst()]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        printMaxAndMin(arr, k);
    }
}

//条件maxDeque.peekFirst() <= i - k的作用是移除不在当前窗口范围内的最大值的索引。
//
//        在滑动窗口算法中，当窗口向右滑动时，我们需要移除窗口左侧不再属于当前窗口的元素。这包括当前窗口的最大值索引。通过判断maxDeque.peekFirst() <= i - k，我们可以确定最大值索引是否在当前窗口的范围内。
//
//        如果最大值索引小于等于i - k，说明最大值索引已经不属于当前窗口，因为它超出了窗口的左边界。在这种情况下，我们可以从maxDeque的队首移除该索引，并继续检查下一个最大值索引。
//
//        通过这个条件，我们可以保持maxDeque中的索引始终处于当前窗口范围内，从而确保我们始终获取到正确的最大值。
//
//        类似地，minDeque也会使用类似的逻辑来移除不在当前窗口范围内的最小值索引。


//当maxDeque.peekFirst() <= i - k条件成立时，意味着当前窗口的最大值索引已经超出了窗口的左侧边界，需要将其移除。
//
//        让我们通过一个例子来说明这个条件的作用：
//
//        假设数组arr = [4, 3, 6, 2, 1, 5]，窗口大小k = 3。我们使用双端队列maxDeque来存储当前窗口的最大值索引。
//
//        初始阶段，窗口的左边界为索引0，右边界为索引2。我们将索引0、1、2的元素加入队列并找到最大值索引。
//
//        maxDeque = [2]，最大值索引为2，对应元素为6。
//
//        窗口向右滑动一步，左边界为索引1，右边界为索引3。此时我们需要移除不在窗口范围内的最大值索引。
//
//        当前maxDeque.peekFirst()为2，i - k = 3 - 3 = 0，条件maxDeque.peekFirst() <= i - k不满足。最大值索引2仍然在窗口范围内，不需要移除。
//
//        窗口再次向右滑动一步，左边界为索引2，右边界为索引4。我们继续检查最大值索引是否在窗口范围内。
//
//        当前maxDeque.peekFirst()为2，i - k = 4 - 3 = 1，条件maxDeque.peekFirst() <= i - k不满足。最大值索引2仍然在窗口范围内，不需要移除。
//
//        窗口再次向右滑动一步，左边界为索引3，右边界为索引5。我们继续检查最大值索引是否在窗口范围内。
//
//        当前maxDeque.peekFirst()为2，i - k = 5 - 3 = 2，条件maxDeque.peekFirst() <= i - k满足。最大值索引2已经不在当前窗口的范围内，需要将其移除。
//
//        移除后，maxDeque = []，表示当前窗口中没有最大值索引。
//
//        通过这个例子，我们可以看到条件maxDeque.peekFirst() <= i - k的作用。它用于判断最大值索引是否不在当前窗口的范围内，如果是，则将其从队列中移除。
//
//        类似的逻辑也适用于minDeque来移除不在当前窗口范围内的最小值索引。