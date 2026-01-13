

public class weeklyContest484 {
    public static  int residuePrefixes(String s) {
       int[] freq = new int[26];
       int repeatedCount = 0;

       for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int f : freq) {
            if (f > 1) {
                repeatedCount++;
            } 
        }
        if(s.length() < 3){
            return s.length()-repeatedCount;
        }
        return s.length()-repeatedCount-1;
    }

    public static void main(String []args){
        String s = "dd";
        System.out.println(residuePrefixes(s));
    }
}
