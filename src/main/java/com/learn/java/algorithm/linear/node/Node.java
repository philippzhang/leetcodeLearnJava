package com.learn.java.algorithm.linear.node;

/**
 * 结点类Node
 * 表示链表中的一个结点
 * 包括：数据域data + 指针域next
 * @author zhangyangshuo
 */
public class Node<T>  {

    private T data;

    //指向后继结点的引用

    private Node next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node() {
        this(null, null);
    }

    public Node(T data) {
        this(data, null);
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}
