package udemy.ds;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(isEmpty()){
            tail = node;
        }
        else
            head.setPrevious(node);
        head = node;
        size++;
    }
    public EmployeeNode removeFromBack(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode node = head;
        head = head.getNext();
        node.setNext(null);
        size--;
        return node;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }
    class EmployeeNode{
        private Employee employee;
        private EmployeeNode next;
        private EmployeeNode previous;

        public EmployeeNode(Employee employee) {
            this.employee = employee;
        }

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public EmployeeNode getNext() {
            return next;
        }

        public void setNext(EmployeeNode next) {
            this.next = next;
        }

        public EmployeeNode getPrevious() {
            return previous;
        }

        public void setPrevious(EmployeeNode previous) {
            this.previous = previous;
        }

        @Override
        public String toString() {
            return employee.toString();
        }
    }
    class Employee {
        private String firstname;
        private String lastname;

        public Employee(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    '}';
        }
    }
}
class Application{
    public static void main(String[] args) {
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
    }
}
