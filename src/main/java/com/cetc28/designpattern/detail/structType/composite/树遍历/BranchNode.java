package com.cetc28.designpattern.detail.structType.composite.树遍历;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 15:45
 * @description：树形节点
 * 树的非叶节点，里面维护一个节点的列表，表示它的子节点。
 * 树形节点有addNode和iterator方法，分别用于添加子节点和返回遍历器。
 * @modified By：
 * @version: $
 */
public class BranchNode extends AbstractNode {
    private ArrayList<Node> arrayList = new ArrayList<>();
    public BranchNode(String name){
        super(name);
    }

    @Override
    public void addNode(Node node) {
        arrayList.add(node);
    }

    @Override
    public Iterator<Node> iterator() {
        return arrayList.iterator();
    }
}
