package com.cetc28.designpattern.detail.structType.composite.树遍历;

import java.util.Iterator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 15:52
 * @description：调用类
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        Node root = createTree();
        depthFirstIterate(root);
        System.out.println("---------------------------------");
        breadthFirstIterate(root);
    }
    // Create a tree like this
    //            Root
    //          /  |  \
    //         A   B   C
    //        /         \
    //       D           F
    //      /
    //     E
    //
    static Node createTree() {  
        Node root = new BranchNode("Root");  
        Node a = new BranchNode("A");
        Node b = new LeafNode("B");
        Node c = new BranchNode("C");
        Node d = new BranchNode("D");
        Node e = new LeafNode("E");
        Node f = new LeafNode("F");
  
        a.addNode(d);
        d.addNode(e);
  
        c.addNode(f);
  
        root.addNode(a);
        root.addNode(b);
        root.addNode(c);
        return root;
    }
    static void depthFirstIterate(Node tree) {
        doSomething(tree);
        for (Iterator<Node> it = new DepthFirstIterator(tree.iterator()); it.hasNext();) {
            doSomething(it.next());
        }
    }
    static void breadthFirstIterate(Node tree) {
        doSomething(tree);
        for (Iterator<Node> it = new BreadthFirstIterator(tree.iterator()); it.hasNext();) {
            doSomething(it.next());
        }
    }
    static void doSomething(Node node) {
        System.out.println(node);
    }
}
