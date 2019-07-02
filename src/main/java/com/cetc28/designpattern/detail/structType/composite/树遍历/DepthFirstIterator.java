package com.cetc28.designpattern.detail.structType.composite.树遍历;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 15:31
 * @description：深度优先遍历
 * 重新写一个深度优化遍历类，实现Iterator接口，通过hasNext、next等方法包装Iterator元素的遍历方法，以实现树内元素的遍历。
 * 深度优先遍历使用Stack实现。
 * @modified By：
 * @version: $
 */
public class DepthFirstIterator implements Iterator {
    private Stack stack = new Stack<>();
    public DepthFirstIterator(Iterator it) {
        stack.push(it);
    }
    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator it = (Iterator)stack.peek();
            if (it.hasNext()) {
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
    }
    @Override
    public Node next() {
        if (hasNext()) {
            Iterator<Node> it = (Iterator<Node>) stack.peek();
            Node next = it.next();
            if (next instanceof BranchNode) {
                stack.push(next.iterator());
            }
            return next;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Can’t remove node, yet");
    }
}
