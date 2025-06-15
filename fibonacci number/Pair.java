import java.util.*;

public class Pair {
    public static List<List<Integer>> twoSumAllPairs(List<Integer> arr, int target, int n) {
        List<List<Integer>> result = new ArrayList<>();
        int left = 0, right = n - 1;

        while (left < right) {
            int sum = arr.get(left) + arr.get(right);
            if (sum == target) {
                result.add(Arrays.asList(arr.get(left), arr.get(right)));
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int target = 10;
        int n = arr.size();
        List<List<Integer>> pairs = twoSumAllPairs(arr, target, n);
        
        System.out.println("All pairs " + target + ":");
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}
