public class prefixsum {

    public static void prefixsumarray(int num[]) {

        int max = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        // build prefix sum array
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        // find max subarray sum using prefix sums
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int currentsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (currentsum > max) {
                    max = currentsum;
                }
            }
        }

        System.out.println("Max Subarray sum is: " + max);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        prefixsumarray(numbers);
    }
}
