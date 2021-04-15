import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!ans.containsKey(arr[i]))
                ans.put(arr[i], 1);
            else
                ans.put(arr[i], ans.get(arr[i]) + 1);
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> map : ans.entrySet()) {
            if (map.getKey() == map.getValue()) {
                max = Math.max(max, (int) map.getValue());
            }
        }
        return max;
    }
}