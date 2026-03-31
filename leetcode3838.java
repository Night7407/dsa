public class leetcode3838 {
    public static  String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            int sum = 0;
            for(char cha:word.toCharArray()){
                
                int position=cha-'a';
                sum+=weights[position];
                
            }
            int pos = sum%26;
            sb.append((char)('z'-pos));
            
        }
        return sb.toString();
        
    }

    public static void main(String args[]){
        String words[] = {"abcd","def","xyz"};
        int weights[] = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words, weights));

    }
}
