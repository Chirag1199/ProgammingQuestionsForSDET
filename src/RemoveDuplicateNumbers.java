public class RemoveDuplicateNumbers {

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 6, 1, 3, 4, 5};
        int n = nums.length;

        String repeatedNums = "";

        for (int i = 0; i < n; i++) {
            if (nums[i] == -1) {
                continue; // skip if already marked
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    nums[j] = -1; // mark duplicate, not nums[i]
                }
            }

            if (count > 1) {
                repeatedNums += nums[i] + " ";
            }
        }

        System.out.println("The repeated numbers are: " + repeatedNums);
    }
}
