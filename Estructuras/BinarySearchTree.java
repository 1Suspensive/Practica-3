package Estructuras;

public class BinarySearchTree extends BinaryTree {

   public BinarySearchTree() {
      super();
   }

   public Node find(int k) {
      return searchTree(k, root);
   }

   public Node searchTree(int k, Node v) {
      BTSEntry u = (BTSEntry) v.getData();
      if (k == u.getKey()) {
         return v;
      } else if (k < u.getKey()) {
         return searchTree(k, v.getLeft());
      } else {
         return searchTree(k, v.getRight());
      }
   }

   public void insert(Object e, int k) {
      BTSEntry O = new BTSEntry(e, k);
      if (isEmpty()) {
         super.addRoot(O);
      } else {
         addEntry(root, O);
      }
   }

   public void addEntry(Node v, BTSEntry O) {
      BTSEntry temp = (BTSEntry) v.getData();
      Node nD = new Node(O);
      if (O.getKey() < temp.getKey()) {
         if (hasLeft(v)) {
            addEntry(left(v), O);
         } else {
            v.setLeft(nD);
         }
      } else {
         if (hasRight(v)) {
            addEntry(right(v), O);
         } else {
            v.setRight(nD);
         }
      }
   }

   public Node Remove(int k) {
      Node v = find(k);
      Node temp = (Node) v.getData();
      if (hasLeft(v) && hasRight(v)) {
         Node w = predecesor(v);
         v.setData(w.getData());
         super.remove(w);
      } else {
         super.remove(v);
      }
      return temp;
   }

   public Node predecesor(Node v) {
      Node temp = v.getLeft();
      return maxNode(temp);
   }

   public Node maxNode(Node temp) {
      if (hasRight(temp)) {
         return maxNode(right(temp));
      } else {
         return temp;
      }
   }

   public void Inorder(BinaryTree T,Node v){
      if (T.hasLeft(v)){
         Inorder(T, T.left(v));
      }
      System.out.println(v.getData());
      if(T.hasRight(v)){
         Inorder(T, T.right(v));
      }
   }
}