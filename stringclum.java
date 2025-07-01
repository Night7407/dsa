public class stringclum {
    public  static int possibleStringCount(String word) {
        int count = 1;
        for(int i = 0;i<word.length()-1;i++){
            if(word.charAt(i) == word.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        String word = "aaaa";
        System.out.println(possibleStringCount(word));
    }
}
