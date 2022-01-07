package codility;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solutionOne(529));
    }
    public static int solutionOne(int N){
        String binary = "";
        while(N > 0){
            binary = (N % 2 == 0 ? "0" : 1) + binary;
            N = N / 2;
        }
        int largest = 0;
        int count = 0;
        int flag = 0;
        for(int i =0; i < binary.length(); i++){
            char c = binary.charAt(i);
            if (c == '1'){
                flag = 1;
            }
            if(flag == 1 && c == '0'){
                count++;
            }
            if(flag == 1 && c == '1'){
                largest = count > largest ? count : largest;
                count = 0;
            }
        }
        return largest;
    }
}
