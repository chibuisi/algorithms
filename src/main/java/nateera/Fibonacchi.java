package nateera;

public class Fibonacchi {
    public static void main(String[] args) {
        System.out.println(getFib(6));
    }
    public static int getFib(int num){
        int [] lastTwo = {0,1};
        int counter = 0;
        while (counter < num){
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
//        int v = num;
//        while(v > 0){
//            int n = lastTwo[0] + lastTwo[1];
//            lastTwo[0] = lastTwo[1];
//            lastTwo[1] = n;
//            v--;
//        }
        return num > 1 ? lastTwo[1] : lastTwo[0];
    }
}
