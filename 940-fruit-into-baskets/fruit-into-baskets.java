import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

            while (freq.size() > 2) {
                int fruit = fruits[left];
                freq.put(fruit, freq.get(fruit) - 1);

                if (freq.get(fruit) == 0) {
                    freq.remove(fruit);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}