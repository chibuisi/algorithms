package riotgames;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeap(2022));
    }
    public static boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
