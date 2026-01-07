import java.util.Scanner;

public class N209 {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("7\n6\n2 1 3 2 4 3");

        int target = sc.nextInt();
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; ++i){
            nums[i] = sc.nextInt();
        }

        int result = minSubArrayLen(target, nums);
        System.out.println(result);
        sc.close();
    }

    public static int minSubArrayLen(int target, int[] nums) {
        // 暴力
        int result = Integer.MAX_VALUE;
        int ans = 0;
        int sum = 0;
        int n = nums.length;
        // 1. 每个都遍历
        for(int i = 0; i < n; ++i){
            sum = 0;
            for(int j = i; j < n; ++j){
                sum += nums[j];
                if(sum >= target){
                    result = Math.min(result, j - i + 1);
                }
            }
        }
        // 2. 加到厌倦

        // 3. result 是否变了，没变就返回0
        if(result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }

}
