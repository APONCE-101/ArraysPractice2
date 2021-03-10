public class ArraysPractice2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = new int[0];
        System.out.println(printMean(nums));
        System.out.println(printMean(nums2));
    }

    public static int printMean(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return nums.length > 0 ? sum / nums.length : 0;
    }
}