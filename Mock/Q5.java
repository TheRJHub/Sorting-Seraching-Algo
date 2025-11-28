package Mock;
class Node3 {
    int data;
    Node3 prev, next;
    Node3(int data){
        this.data = data;
    }
}
public class Q5 {
    Node3 head;
    void insert(int data){
        Node3 newNode=new Node3(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node3 n=head;
        while (n.next != null){
            n=n.next;
        }
        n.next=newNode;
        newNode.prev=n;
    }

    void delete(int p) {
        if (head==null || p<=0){
            return;
        }
        Node3 n2=head;

        for (int i=1;n2!=null && i<p;i++)
            n2=n2.next;

        if(n2==null){
            return;
        }
        if(n2.prev!=null){
            n2.prev.next=n2.next;
        }
        else{
            head=n2.next;
        }
        if(n2.next!=null){
            n2.next.prev=n2.prev;
        }
    }
    void display() {
        Node3 n2=head;
        while (n2!=null) {
            System.out.print(n2.data+"<->");
            n2=n2.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Q5 l = new Q5();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        System.out.println("org ll:");
        l.display();

        l.delete(2);
        System.out.println("Delete node at pos2:");
        l.display();
    }
}