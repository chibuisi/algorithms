package msx;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class WebsitePagination {
    public static void main(String[] args) {
        Vector<Vector<String>> items = new Vector<>();
        Vector<String> java = new Vector<>();
        java.add("Java"); java.add("10"); java.add("15");
        Vector<String> c = new Vector<>();
        c.add("C"); c.add("3"); c.add("4");
        Vector<String> python = new Vector<>();
        python.add("Python"); python.add("1"); python.add("8");
        items.add(java); items.add(c); items.add(python);

        System.out.println(items);
        Vector<String> itemsDisplayed = fetchItemsToDisplay(items, 2, 0, 3, 1);

        System.out.println(items);
        System.out.println(itemsDisplayed);
    }
    public static Vector<String> fetchItemsToDisplay(Vector<Vector<String>> items, int sortParameter,
                                                     int sortOrder, int itemPerPage, int pageNumber){
        Vector<String> result = new Vector<>();
        if(sortParameter == 0){
            items.sort(Comparator.comparing(i -> i.get(0)));
        }
        if(sortParameter == 1){
            items.sort(Comparator.comparingInt(i -> Integer.parseInt(i.get(1))));
        }
        if(sortParameter == 2){
            items.sort(Comparator.comparing(i -> Integer.parseInt(i.get(2))));
        }
        if(sortOrder == 1)
            Collections.reverse(items);
        int start = (itemPerPage * pageNumber) - itemPerPage;
        if(start >= itemPerPage && start < items.size())
            result.add(items.get(start).get(0));
        else{
            for(int i = start; i < itemPerPage && i >= 0; i++){
                result.add(items.get(i).get(0));
            }
        }
        return result;
    }
}
