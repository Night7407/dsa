public class maxdiffremap {
    public static int minMaxDifference(int num) {
        String str = Integer.toString(num);
        char[] maxChars = str.toCharArray();
        char[] minChars = str.toCharArray();

        // Step 1: Find first non-'9' digit for max
        char replaceForMax = ' ';
        for (char c : maxChars) {
            if (c != '9') {
                replaceForMax = c;
                break;
            }
        }

        // Step 2: Replace with '9' for max
        if (replaceForMax != ' ') {
            for (int i = 0; i < maxChars.length; i++) {
                if (maxChars[i] == replaceForMax) {
                    maxChars[i] = '9';
                }
            }
        }

        // Step 3: Find first digit not '0' or '1' for min
        char replaceForMin = ' ';
        for (char c : minChars) {
            if (c != '0' && c != '1') {
                replaceForMin = c;
                break;
            }
        }

        // Step 4: Replace that digit with '0'
        if (replaceForMin != ' ') {
            for (int i = 0; i < minChars.length; i++) {
                if (minChars[i] == replaceForMin) {
                    minChars[i] = '1';
                }
            }
        }

        // Step 5: Parse and calculate difference
        int maxVal = Integer.parseInt(new String(maxChars));
        int minVal = Integer.parseInt(new String(minChars));

        return maxVal - minVal;
    }

    public static void main(String[] args) {
        int nums = 123456;
        System.out.println(minMaxDifference(nums));  // Output: 820000
    }
}
