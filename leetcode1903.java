

public class leetcode1903 {
    public static String largestOddNumber(String num) {

        // if(Long.parseLong(num) % 2!=0){
        //     return num;
        // }

        // List<String> list = new ArrayList<>();
        // for(int i = 0;i<num.length();i++){
        //     for(int j = i+1;j<num.length();j++){
        //         list.add(num.substring(i, j));
        //     }
        // }

        // Collections.sort(list,(s1,s2) ->{
        //     return Integer.parseInt(s1)-Integer.parseInt(s2);
        // });
        // System.out.println(list);

        // for(int i = list.size()-1;i>=0;i-- ){
        //     if(Long.parseLong(list.get(i)) % 2 !=0){
        //         return list.get(i);
        //     }
        // }

        // return "";

        char[] word =num.toCharArray();
        int l = 0,r = word.length-1;
        if(word.length == 1){
            if(Integer.parseInt(String.valueOf(word[0])) %2!=0){
                return String.valueOf(word[0]);
            }
            else{
                return "";
            }
        }
        while(l!=r && r>0){
            if(Integer.parseInt(String.valueOf(word[r])) % 2 ==0){

                r--;
            }

            String s ="";
            for(int i = l;i<=r;i++){
                s+=word[i];
            }

            if(Long.parseLong(s) %2 !=0){
                return s;
            }
            r--;
        }
        return "";
        
    }

    public static void main(String[]args){
        String num = "4206";
        System.out.println(largestOddNumber(num));
    }
}
