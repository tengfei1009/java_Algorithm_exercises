package 队列;

import java.util.*;

public class 日志统计_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>[] arr = new ArrayList[100001];
        int N = sc.nextInt();  // N行日志
        int D = sc.nextInt(); // 任意时间段长度
        int K = sc.nextInt();  // 需要k个点赞

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>(); // 初始化时间戳
        }

        for (int i = 0; i < N; i++) {
            int ts = sc.nextInt();
            int id = sc.nextInt();
            arr[id].add(ts);
        }

        ArrayList <Integer>ne =new ArrayList();

        // 遍历每个帖子的时间戳列表，并判断滑动窗口内的点赞数量
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> time = arr[i];
            if (time.isEmpty()) {
                continue;
            }
            Collections.sort(time);
            //得到不为空的帖子
            Deque<Integer> queue = new LinkedList<>();
            int index = 0;
            while (index < time.size()) {
                int offer =time.get(index);
                queue.offerLast(offer);
                while (!queue.isEmpty() &&offer-queue.peekFirst()>=D) {  //去除当前时间戳
                    queue.removeLast();
                }
                index++;
                if(queue.size()>=K){
                    System.out.println(i);
                }
            }
        }
        Collections.sort(ne);
        for (int i = 0; i < ne.size(); i++) {
            System.out.println(ne.get(i));
        }
    }
}
