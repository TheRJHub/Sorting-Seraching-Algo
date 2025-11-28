package Mock;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
    }
}
public class Q3 {
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void display() {
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Q3 list=new Q3();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("org:");
        list.display();

        list.insert(100);
        list.insert(200);
        System.out.println("after insert 2nodes:");
        list.display();
    }
}
