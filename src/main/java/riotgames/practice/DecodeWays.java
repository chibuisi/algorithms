package riotgames.practice;

public class DecodeWays {
    public static void main(String[] args) {

    }
    public static int decode(String str1, String str2){
        int [][] ways = new int [str1.length()][str2.length()];
        for(int i = 0; i < ways.length; i++){
            for(int j = 0; j < ways[0].length; j++){
                ways[0][j] = j;
            }
            ways[i][0] = i;
        }
        for(int i = 1; i < ways.length; i++){
            for(int j = 1; j < ways[0].length; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    ways[i][j] = ways[i-1][j];
                }
                else{
                    ways[i][j] = Math.max(ways[i-1][j], Math.max(ways[i-1][j-1],ways[i][j-1]));
                }
            }
        }
        return ways[ways.length-1][ways[0].length-1];
    }
}
