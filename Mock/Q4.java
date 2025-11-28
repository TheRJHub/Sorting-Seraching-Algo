package Mock;
class Node2{
    int e;
    Node2 prev,next;
    Node2(int e){
        this.e=e;
    }
}
public class Q4 {
    Node2 head;
    public void insert(int p,int e){
        Node2 n=new Node2(e);
        if(p==1){
            n.next=head;
            if(head!=null){
                head.prev=n;
            }
            head=n;
            return;
        }
        Node2 temp=head;
        for(int i=1;i<p-1 && temp!=null;i++) {
            temp = temp.next;
        }
        if(temp==null){
            return;
        }
        n.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=n;
        }
        n.prev=temp;
        temp.next=n;
    }
    void display(){
        Node2 temp=head;
        while(temp!=null){
            System.out.print(temp.e+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Q4 l=new Q4();
        l.insert(1,10);
        l.insert(2,20);
        l.insert(3,30);
        System.out.println("org ll:");
        l.display();

        l.insert(2,100);
        l.insert(3,200);
        System.out.println("after inserting:");
        l.display();
    }
}