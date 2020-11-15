package udemy.ds.hashtable.challengetwo;

import udemy.ds.hashtable.challengetwo.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));


        Map<Integer, Employee> employeeMap = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employeeMap.containsKey(employee.getId())){
                remove.add(employee);
            }
            else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        for(Employee employee : remove){
            employees.remove(employee);
        }

//        for(Employee employee : employees){
//            if(!employeeMap.containsKey(employee.getId())){
//                employeeMap.put(employee.getId(), employee);
//            }
//        }
//        employees.clear();
//        employees.addAll(employeeMap.values());
//        employees = new LinkedList<>();
//        for (Employee employee : employeeMap.values()){
//            employees.add(employee);
//        }

        employees.forEach(System.out::println);
        

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
