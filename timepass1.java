public class timepass1 {
    public static  boolean isequal(String s1){
        StringBuilder s2 = new StringBuilder();
        for(int i = s1.length()-1;i>=0;i--){
            s2.append(s1.charAt(i));
        }
        return s1.equals(s2.toString());
    }
    public static void main(String[] args) {
        String s1 = "racecar";
        System.out.println(isequal(s1));
    }
}
