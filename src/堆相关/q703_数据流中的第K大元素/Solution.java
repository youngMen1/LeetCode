package 堆相关.q703_数据流中的第K大元素;

import java.util.PriorityQueue;

/**
 * @author fengzhiqiang
 * @date 2021/3/23 11:59
 * 优先队列
 * <p>
 * 时间复杂度：
 * 初始化时间复杂度为：O(nlogk) ，其中 nn 为初始化时 textit{nums}nums 的长度；
 * 单次插入时间复杂度为：O(logk)
 **/
public class Solution {

    PriorityQueue<Integer> pq;
    int k;

    public Solution(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for (int x : nums) {
            add(x);
        }
        System.out.println(pq.peek());
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = {4,5,8,2};
        new Solution(10,nums);
    }

}
