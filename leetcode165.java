public class leetcode165 {
    public static int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int n1 = version1.length(), n2 = version2.length();

        while (i < n1 || j < n2) {
            StringBuilder num1_sb = new StringBuilder();
            StringBuilder num2_sb = new StringBuilder();

            while (i < n1 && version1.charAt(i) != '.') {
                num1_sb.append(version1.charAt(i));
                i++;
            }
            while (j < n2 && version2.charAt(j) != '.') {
                num2_sb.append(version2.charAt(j));
                j++;
            }
            i++;
            j++;

            
            int num1 = num1_sb.length() > 0 ? Integer.parseInt(num1_sb.toString()) : 0;
            int num2 = num2_sb.length() > 0 ? Integer.parseInt(num2_sb.toString()) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }

        return 0;

    }
    public static void main(String[]args){
        String version1 = "1.2";
        String version2 = "1.10";
        System.out.println(compareVersion(version1, version2));
    }
}
