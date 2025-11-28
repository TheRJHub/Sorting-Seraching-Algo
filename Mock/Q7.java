package Mock;
class BST{
    int data;
    BST left, right;
    BST(int data) {
        this.data = data;
    }
}
public class Q7 {
    BST root;
    void insert(int data) {
        root=insertRec(root, data);
    }
    BST insertRec(BST root,int data){
        if (root==null){
            return new BST(data);
        }
        if (data<root.data){
            root.left=insertRec(root.left,data);
        }
        else if(data>root.data){
            root.right=insertRec(root.right,data);
        }
        return root;
    }
    void inorder(BST root) {
        if(root!=null) {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Q7 bst=new Q7();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("inorder traversl: ");
        bst.inorder(bst.root);
    }
}
