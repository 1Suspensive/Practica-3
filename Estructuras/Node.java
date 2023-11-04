package Estructuras;

public class Node {
    private Object data;
    private Node left;
    private Node right;
 
    public Node(){
        data = null;
        left = null;
        right = null;
    }
    
    public Node(Object e){
        this.data = e;
        this.left = null;
        this.right = null;
    }

    public Object getData() {
        return data;
    }

    public Node getRight(){
        return right;
    }
    public Node getLeft(){
        return left;
    }

    public void setLeft(Node n){
        this.left = n;
    }
    
    public void setRight(Node n){
        this.right = n;
    }

    public void setData(Object data) {
        this.data = data;
    }

    
    
    
 
}
