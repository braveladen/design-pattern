package com.cetc28.designpattern.detail.structType.composite.树遍历;

import java.util.Iterator;

/**
 * @author ：braveladen
 * @date ：Created in 2019/7/2 15:28
 * @description：节点接口
 * @modified By：
 * @version: $
 */
public interface Node {
    void addNode(Node node);
    Iterator<Node> iterator();
}
