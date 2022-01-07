package cvs;

public class Solution {
    public static void main(String[] args) {
//        ArrayList stringArr = new ArrayList();
//        stringArr.add("Chibuisi");
//        stringArr.add("Patrick");
//        //stringArr.remove("Patrick");
//        stringArr.remove("Chibuisi");
//        stringArr.print();
//        System.out.println(stringArr.size());
        KrysArrayList arrayList = new KrysArrayList();
        arrayList.add("Patrick");
        arrayList.add("Chibuisi");
        arrayList.delete("Patrick");
        arrayList.print();
    }
}
