import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class recipes {
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies){
     
        List<String> ans = new ArrayList<>();
        String[] updatedSupplies = Arrays.copyOf(supplies, supplies.length + recipes.length);

        System.arraycopy(recipes, 0, updatedSupplies, supplies.length, recipes.length);

        Arrays.toString(updatedSupplies);

        Set<String> supplySet = new HashSet<>(Arrays.asList(updatedSupplies)); 

        for (int i = 0; i < recipes.length; i++) { 
            boolean canMake = true;
            for (String ingredient : ingredients.get(i)) { 
                if (!supplySet.contains(ingredient)) {
                    canMake = false;
                    break; 
                }
            }
            if (canMake) {
                ans.add(recipes[i]); 
            }
        }
        return ans;
    }
    public static void main(String[]args){
        String [] recipes = {"bread","sandwich","burger"};
        List<List<String>> ingredients = Arrays.asList(
            Arrays.asList("yeast", "flour"), 
            Arrays.asList("bread", "meat"), 
            Arrays.asList("sandwich", "meat", "bread"));
        String supplies[] = {"yeast","flour","meat"};
        System.out.println(findAllRecipes(recipes, ingredients, supplies));
    }
}
