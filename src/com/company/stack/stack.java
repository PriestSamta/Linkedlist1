package com.company.stack;

import java.util.ArrayList;

public class stack<T> {
    private ArrayList<T> data;

    public  stack(){
       this.data=data;
    }
    public void push(T val){
        data.add(val);
    }
    public T pop(){
        if(data.isEmpty()){
            System.out.println("Stack is Undeflow");
            return  null;
        }
        return data.remove(data.size()-1);
    }
    public boolean empyt(){
        return data.isEmpty();
    }
    public int size(){
        return data.size();
    }
    public T peak(){
        if(data.isEmpty()){
            System.out.println("Stack is Underflow");
            return null;
        }
        return data.get(data.size()-1);
    }
}
