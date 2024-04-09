package 队列;

import java.util.*;

public class 日志统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // N行日志
        int D = sc.nextInt(); // 任意时间段长度
        int K = sc.nextInt();  // 需要k个点赞

//        在给定的代码中，同一时间点不同的帖子会被记录在mvp这个有序映射中。由于mvp是一个TreeMap，它会根据时间戳（键）进行排序，并且每个时间戳只能对应一个帖子的点赞数量（值）。
//
//        当多个帖子在同一时间点收到点赞时，它们的点赞数量会被分别记录在arr数组中的不同索引位置，并且在mvp中会有不同的时间戳对应不同的点赞数量。因此，不同的帖子在同一时间点不会相互覆盖或影响彼此的点赞数量记录。
        Map<Integer, ArrayList> mvp = new HashMap<>();
        for (int i = 0; i < N; i++) {
            // 点赞日志
            int ts = sc.nextInt();  // 时间戳
            int id = sc.nextInt();  // 某个帖子
            if (!mvp.containsKey(id)) {
                ArrayList<Integer> array = new ArrayList<>();
                array.add(ts);
                mvp.put(id,array);
            } else {
                mvp.get(id).add(ts);
            }
        }
        ArrayList <Integer>ne =new ArrayList();
        for (Map.Entry<Integer, ArrayList> entry : mvp.entrySet()) {
            ArrayList<Integer> ts = entry.getValue();
            int id = entry.getKey();
            Collections.sort(ts);
            Deque <Integer>qu = new LinkedList();
            int index = 0;
//            System.out.print(id+" :");
//            for (int count = 0; count < ts.size(); count++) {
//                System.out.print(ts.get(count)+" ");
//            }
//            System.out.println();
            while(index<ts.size()){
                int offer = ts.get(index); //时间戳
                qu.offerLast(offer);
                while(!qu.isEmpty()&&offer-qu.peekFirst()>=D){
                    qu.removeFirst();
                }
                index++;
                if(qu.size()>=K){
                    ne.add(id);
                    break;
                }
            }
        }
        Collections.sort(ne);
        for (int i = 0; i < ne.size(); i++) {
            System.out.println(ne.get(i));
        }
    }
}