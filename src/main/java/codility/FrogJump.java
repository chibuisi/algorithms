package codility;

public class FrogJump {
    public static void main(String[] args) {

    }
    public static int solutionOne(int X, int Y, int D){
        int count = 0;
        while(X < Y){
            X += D;
            count++;
        }
        return count;
    }
}
