package com.company;

import com.sun.source.tree.BreakTree;

class linkedlist {
    Node head;
    Node tail;
    int size = 0;

    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addlast(int data) {
        Node node = new Node(data, null);
        if (this.head == null) {
            this.tail = this.head = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void print() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public Node getAt(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Invalid Input");
            return null;
        }
        int i = 0;
        Node n = this.head;
        while (i < index) {
            i++;
            n = n.next;
        }
        return n;
    }

    public Node removelast() {
        if (this.size == 0) {
            System.out.println("Invalid Input");
            return null;
        }
        Node node = getAt(size - 2);
        Node res=this.tail;
        node.next=null;
        this.tail=node;
        this.size--;
        return  res;
    }
    public void addFirst(int data){
        Node node =new Node(data,null);
        if(this.head==null){
            this.head=this.tail=node;
        }
        node.next=this.head;
        this.head=node;
        this.size++;
    }
    public Node removefirst(){
        if(this.size==0){
            System.out.println("Invalid Input");
            return  null;
        }
        Node res=this.head;
        this.size--;
        this.head=this.head.next;
        res.next=null;
        return  res;
    }
    public void AddAt(int index,int data) {
        if (index < 0 || index > this.size) {
            System.out.println("Invalid Input");
        } else if (index == 0) addFirst(data);
        else if (index == size - 1) addlast(data);
        else {
            Node prenode = getAt(index - 1);
            Node node = new Node(data, null);
            node.next = prenode.next;
            prenode.next = node;
            this.size++;
    }
    }
    public Node removeAt(int index){
        if(this.size==0){
            System.out.println("Invalid Input");
            return  null;
        }else if(index <0 || index>=this.size){
            System.out.println("Invalid Input");
            return  null;
        }else if(index==0){
            return removefirst();
        }else if(index==this.size-1){
            return removelast();
        }else {
            Node prevNode=getAt(index-1);
            Node res=prevNode.next;
            prevNode.next=prevNode.next.next;
            res.next=null;
            this.size--;
            return  res;
        }
    }
}
