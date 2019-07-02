package com.cetc28.designpattern.detail.structType.composite.树遍历;

import java.util.Iterator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 15:41
 * @description：树的叶节点
 * 叶节点虽然实现了addNode和iterator方法，但其实叶节点是不能加子节点，也不需要遍历的，所以方法内部实现都是空实现。
 * @modified By：
 * @version: $
 */
public class LeafNode extends AbstractNode {
    public LeafNode(String name){
        super(name);
    }

    @Override
    public Iterator<Node> iterator() {
        return new NullIterator<Node>();
    }

    @Override
    public void addNode(Node node) {
        throw new UnsupportedOperationException("Can't add a node to leaf.");
    }

    private class NullIterator<Node> implements Iterator{
        @Override
        public boolean hasNext() {
            return false;
        }
        @Override
        public Object next() {
            return null;
        }
    }
}
