package hackerrank;

public class RepeatedString {
    public static long solve(String s, long n) {
        // Write your code here
        StringBuilder str = new StringBuilder(s);
        while(str.length() < n){
            str.append(s);
        }
        long result = 0;
        String st = str.toString();
        System.out.println(st.indexOf("a"));
//        while(st.indexOf("a") >= 0){
//            int index = st.indexOf("a");
//            if(index >= 0){
//                result += 1;
//                st = st.substring(index+1);
//            }
//        }
        long [] arr = new long[26];
        for(long i = 0; i < n; i++){
            long index = st.indexOf("a");
            if(index >= 0){
                arr[0]++;
            }
            st = st.substring((int) index+1);
        }
        return arr[0];
    }

    public static void main(String[] args) {
        System.out.println(solve("abaca", 10));
    }

}
