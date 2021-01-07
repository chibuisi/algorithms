package flexton;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    public static void main(String[] args){
        System.out.println(permute("abc"));
    }
    private static List<String> permute(String str){
        if(str.length() == 0)
            return new ArrayList<>();
        List<String> result = helper(str, "", new ArrayList<>());
        return result;
    }
    private static List<String> helper(String str, String res, List<String> list){
        if(str.isEmpty()
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
            list.add(res);
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            //exclude the i chararcter
            String newString = str.substring(0,i) + str.substring(i+1);
            helper(newString, res+c, list);
        }
        return list;
    }
}
