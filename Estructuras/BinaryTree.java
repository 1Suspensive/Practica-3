package Estructuras;

import Estructuras.Cola.QueueList;
import java.lang.Math;

public class BinaryTree {
    protected Node root;
    protected int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public int Size() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Boolean isRoot(Node v) {
        return v == root;
    }

    public Boolean isInternal(Node v) {
        return hasLeft(v) || hasRight(v);
    }

    public Boolean hasLeft(Node v) {
        return v.getLeft() != null;
    }

    public Boolean hasRight(Node v) {
        return v.getRight() != null;
    }

    public Node root() {
        return root;
    }

    public Node left(Node v) {
        return v.getLeft();
    }

    public Node right(Node v) {
        return v.getRight();
    }

    public Node parent(Node v) {
        if (isRoot(v)) {
            return null;
        } else {
            QueueList Q = new QueueList();
            Q.enqueue(root);
            Node temp = root;
            while (!Q.isEmpty() & left((Node) Q.first()) != v & right((Node) Q.first()) != v) {
                temp = (Node) Q.dequeue();
                if (hasLeft(temp)) {
                    Q.enqueue(left(temp));
                }
                if (hasRight(temp)) {
                    Q.enqueue(right(temp));
                }
            }
            return temp;
        }
    }

    public int depth(Node v) {
        if (isRoot(v)) {
            return 0;
        } else {
            return 1 + depth(parent(v));
        }
    }

    public int height(Node v) {
        if (!isInternal(v)) {
            return 0;
        } else {
            int h = 0;
            h = Math.max(height(left(v)), height(right(v)));
            return 1 + h;
        }
    }

    public void addRoot(Object e) {
        root = new Node(e);
        size = 1;
    }

    public void insertLeft(Node v, Object e) {
        Node left = new Node(e);
        v.setLeft(left);
        size++;
    }

    public void inserRitght(Node v, Object e) {
        Node right = new Node(e);
        v.setRight(right);
        size++;
    }

    public void remove(Node v) {
        Node p = parent(v);
        if (hasLeft(v) || hasRight(v)) {
            Node child;
            if (hasLeft(v)) {
                child = left(v);
            } else {
                child = right(v);
            }
            if (left(p) == v) {
                p.setLeft(child);
            } else {
                p.setRight(child);
            }
            v.setLeft(null);
            v.setRight(null);
        } else {
            if (left(p) == v) {
                p.setLeft(null);
            } else {
                p.setRight(null);
            }
        }
        size--;
    }

}