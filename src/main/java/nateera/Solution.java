package nateera;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Container a = new Container(null,"aaa");
        Container b = new Container(a,"bbb");
        Container c = new Container(b, "ccc");

        print(c);

    }

    public static void print(Container c){
        Stack<Container> containers = new Stack<>();
        containers.push(c);

        while(c.getParent() != null){
            Container con = c.getParent();
            containers.push(con);
            c = con;
        }


        while(!containers.isEmpty()){
            Container newCon = containers.pop();
            if(newCon != null)
                System.out.println(newCon.getName());
        }

    }
}
