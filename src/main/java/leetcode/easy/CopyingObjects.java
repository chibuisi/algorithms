package leetcode.easy;

public class CopyingObjects {

    int value = 10;
    Object object = new Object();

    public static void main(String[] args) {
        CopyingObjects ob = new CopyingObjects();
        Email email = new Email(1,"the email message");
        ob.manipulateEmail(email);
        System.out.println(email);
        System.out.println(ob.value);
        System.out.println(ob.object);
//        ob.manipulateValue(ob.value);
//        System.out.println(ob.value);
//        ob.manipulateObject(ob.object);
//        System.out.println(ob.object);
    }
    public void manipulateEmail(Email email){
        email.setId(2);
        email.setText("changed text");
        value = 20;
        object = new Object();
    }
    private void manipulateValue(int value){
        value = 30;
    }
    private void manipulateObject(Object object){
        object = new Object();
    }
}

class Email{
    private int id;
    private String text;

    public Email(int id, String text){
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}