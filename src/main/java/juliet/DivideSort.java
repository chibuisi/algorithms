package juliet;

public class DivideSort {
    public static String divideSort(String s){
        int start = 0;
        int end = s.length();

        if(s.length() == 0 || s.length() == 1)
            return s;

        int mid = start + (end - start) / 2;

        String left = divideSort(s.substring(0, mid));
        String right = divideSort(s.substring(mid));

        StringBuilder result = new StringBuilder();
        return merge(left, right, result);
    }

    private static String merge(String left, String right, StringBuilder result) {

        if(left.isEmpty() && right.isEmpty()) return result.toString();
        if(left.isEmpty()) {
            result.append(right);
            return result.toString();
        }
        if(right.isEmpty()) {
            result.append(left);
            return result.toString();
        }
        if(left.charAt(0) <= right.charAt(0)) {
            result.append(left.charAt(0));
            return merge(left.substring(1), right, result);
        } else {
            result.append(right.charAt(0));
            return merge(left, right.substring(1), result);
        }
    }

    public static void main(String[] args) {
        System.out.println(divideSort("holla"));
    }
}
