import java.util.ArrayList;

class leetcode3479{
     public static   int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer nums:baskets){
            ans.add(nums);
        }
        int count = 0;
        for (int i = 0; i < fruits.length; i++) {
            boolean placed = false;
                if (fruits[i] <= ans.get(i)) {
                    count++;
                    ans.remove(i);
                    placed = true;
                    break;
                }
            }

        return fruits.length-count;
    }
    public static void main(String[]args){
        int fruits[]= {4,2,5};
        int baskets[] ={3,5,4};
        System.out.println(numOfUnplacedFruits(fruits, baskets));

    } 
}