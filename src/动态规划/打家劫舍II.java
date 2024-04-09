package 动态规划;

public class 打家劫舍II {
    public int rob(int[] nums) {
        // 如果数组为空或长度为0，无法进行打家劫舍，返回0
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int len = nums.length;
        // 如果只有一个房屋，直接返回该房屋的金额
        if (len == 1) {
            return nums[0];
        }

        // 比较偷窃0到n-1号房屋和1到n号房屋的最大金额，取较大的作为结果
        return Math.max(robAction(nums, 0, len - 1), robAction(nums, 1, len));
    }

    public int robAction(int[] nums, int start, int end) {
        int x = 0, y = 0, z = 0;
        for (int i = start; i < end; i++) {
            y = z; // y表示上一个房屋的最大金额
            //当前房间取,或者不取,不取,就是y(上一个房间的最大金额)  取就是上一个房间的最大金额加上当前房间的金额
            z = Math.max(y, x + nums[i]); // z表示当前房屋的最大金额，选择偷窃当前房屋或不偷窃当前房屋的较大值
            x = y; // x更新为上一个房屋的最大金额
        }
        return z; // 返回最后一个房屋的最大金额
    }
}
