package altemetriks.riot;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        System.out.println(solutionOne(4));
    }
    public static int solutionOne(int num){
        int factOfNum = findFact(num);
        int count = 0;
        while(factOfNum > 0){
            int temp = factOfNum % 10;
            if(temp == 0)
                count+=1;
            factOfNum /= 10;
        }
        return count;
    }

    private static int findFact(int num) {
        if(num <= 0 || num == 1)
            return 1;
        //n! = n * [(n-1)!]
        return num * findFact(num-1);
    }
}
