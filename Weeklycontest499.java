

class Weeklycontest499{
    // public static String sortVowels(String s) {
    //     List<Character> vowels = new ArrayList<>();
    //     for(Character ch:s.toCharArray()){
    //         if(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    //             vowels.add(ch);
    //         }
    //     }
    //     Map<Character,Integer> freq = new HashMap<>();
    //     for(char ch : vowels){
    //         freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    //     }
    //     Map<Character, Integer> firstIndex = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    //             firstIndex.putIfAbsent(ch, i);
    //         }
    //     }

    //     vowels.sort((a, b) -> {
    //         int cmp = Integer.compare(freq.get(b), freq.get(a));
    //         if (cmp != 0) return cmp;
    //         return Integer.compare(firstIndex.get(a), firstIndex.get(b));
    //     });
        

    //     StringBuilder sb = new StringBuilder(s);
    //     int j = 0;
    //     for(int i = 0;i<s.length();i++){
    //         char ch = s.charAt(i);
    //         if(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    //             sb.setCharAt(i,vowels.get(j));
    //             j++;
    //         }
    //     }
    //     return sb.toString();


        
    // }

    public static long minOperations(int[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                ans += (long)(nums[i] - nums[i + 1]);
            }
        }
        return ans;
        
    }

    public static void main(String[] args) {
        int nums[] = {3,3,2,1};
        System.out.println(minOperations(nums));
    }
}