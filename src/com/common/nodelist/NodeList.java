package com.common.nodelist;

/**
 * @Author: nxw
 * @Date: 2020/4/19 19:30
 */
public class NodeList {
    Node header;
    int size;

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    public void add(Object data){
        if (header != null){
            Node node = findThis(header);
            node.next = new Node(data,null);
            System.out.println(header.toString());
        }
        else {
            header = new Node(data,null);
            System.out.println(header.toString());
        }
        size++;
    }
//
//    public void addNew(Object data){
//        if(header.next != null){
//            Node node = findThis(header.next);
//            node.next = new Node(data,null);
//        }
//        else{
//            header.next = new Node(data,null);
//        }
//    }

    private Node findThis(Node node){
        if (node.next != null){
            return findThis(node.next);
        }
        else return node;
    }

    public void show(){
        Node t = header;
        while(t != null){
            System.out.println(t.data);
            t = t.next;
        }
    }

    @Override
    public String toString() {
        return "NodeList{" +
                "header=" + header +
                ", size=" + size +
                '}';
    }
}
