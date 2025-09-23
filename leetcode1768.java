class leetcode1768{
    public static  String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int n = word1.length(),m = word2.length();
        int i = 0,j=0;
        while(i<n || j<m){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;
            if(i == n || j == m) break;
            

        }
        if(i!= n){
            int k = i;
            for(int x = k;x<=n-1;x++){
                ans.append(word1.charAt(x));
            }
        }
        if(j!= m){
            int k = j;
            for(int x = k;x<m;x++){
                ans.append(word2.charAt(x));
            }
        }
        return ans.toString();
    }
    public static void main(String[]args){
        String word1 = "ab";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}