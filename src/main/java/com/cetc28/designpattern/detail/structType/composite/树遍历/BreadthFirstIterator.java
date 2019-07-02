package com.cetc28.designpattern.detail.structType.composite.树遍历;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 16:03
 * @description：广度优先遍历
 * 广度优先遍历采用Queue实现。
 * @modified By：
 * @version: $
 */
public class BreadthFirstIterator implements Iterator {
    private Queue<Iterator<Node>> queue = new LinkedList<Iterator<Node>>();

    public BreadthFirstIterator(Iterator<Node> it) {
        queue.offer(it);
    }

    @Override
    public boolean hasNext() {
        if (queue.isEmpty()) {
            return false;
        } else {
            Iterator<Node> it = queue.peek();
            if (it.hasNext()) {
                return true;
            } else {
                queue.poll();
                return hasNext();
            }
        }
    }

    @Override
    public Node next() {
        if (hasNext()) {
            Iterator<Node> it = queue.peek();
            Node next = it.next();
            if (next instanceof BranchNode) {
                queue.offer(next.iterator());
            }
            return next;
        } else {
            return null;
        }
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Can't remove node, yet");
    }
}
