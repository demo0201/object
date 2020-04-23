package com.common.nodelist;

/**
 * @Author: nxw
 * @Date: 2020/4/19 19:28
 */
public class Node {
    Object data;
    Node next;

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
