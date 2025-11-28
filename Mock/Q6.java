package Mock;
import java.util.Stack;
public class Q6 {
    public static void display(Stack<Integer> s) {
        System.out.println("all elements: :");
        for (int i=s.size()-1;i>=0;i--) {
            System.out.println(s.get(i));
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack: "+s);

        if (s.isEmpty()){
            System.out.println("it is empty");
        }else{
            System.out.println("not empty");
        }
        System.out.println("pop el: " + s.pop());
        System.out.println("after peek el: " + s.peek());
        display(s);


    }
}
