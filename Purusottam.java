import java.util.HashMap;
import java.util.Map;

public class Purusottam {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices == null || prices.length == 0) {
            return profit;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - min);
            }
        }
        return profit;
    }



    public static void main(String[] args) {

    }
}
