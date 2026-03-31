

public class BiweeklyContest175 {
    public String reverseByType(String s){
        char word[]  = s.toCharArray();
        StringBuilder l1 = new StringBuilder();
        StringBuilder l2 = new StringBuilder();
        for(Character c : s.toCharArray()){
            if(c >= 'a' && c<='z'){
                l1.append(c);
            }
            else{
                l2.append(c);

            }
        }
        l1.reverse();
        l2.reverse();

        int l = 0,r = 0;
        for(int i = 0;i<word.length;i++){
            if(word[i] >= 'a' && word[i] <='z'){
                word[i] = l1.charAt(l);
                l++;
            }
            else{
                word[i] = l2.charAt(r);
                r++;
            }
        }
        return new String(word);
        

    }
}
