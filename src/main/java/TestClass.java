import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class TestClass {
    public static int sum(int [] nums) throws Exception{
        //IntSummaryStatistics summary = Arrays.stream(nums).collect(Collectors.summarizingInt(Integer::intValue));
        int sum = Arrays.stream(nums).reduce((i,v) -> i+v).getAsInt();
        if(sum < 0)
            throw new Exception("Invalid sum");
        return sum;
    }

    public static void main(String[] args) {
        try{
            System.out.println(sum(new int[]{1,-2,-3}));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(areaOfCircle(2.3));
        System.out.println(startsWithUpperCase("Friends"));
    }

    public static double areaOfCircle(double radius){
        double area = Math.PI * (radius * radius);
        return area;
    }

    //given a string write a function to check if it begins with upper case

    public static boolean startsWithUpperCase(String str){
        if(str == null || str.length() == 0)
            return false;
        char ch = str.charAt(0);
        if(Character.isLetter(ch) && ch >= 'A' && ch <= 'Z'){
            return true;
        }
        return false;
    }
}
