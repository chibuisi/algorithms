package nickwhite;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        for(List<Integer> list : buildTriangle(10  )){
            for(Integer i : list){
                System.out.print(i+", ");
            }
            System.out.println();
        }
    }
    //1
    //11
    //121
    public static List<List<Integer>> buildTriangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i = 1; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prev = triangle.get(i-1);
            for(int j = 1; j < i; j++){
                row.add(prev.get(j) + prev.get(j-1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
