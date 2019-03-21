package com.experiment.Utils;

public class SequenceStack {
    final int minSize=20;
    private Object[] stackArray;
    private int top;

    public SequenceStack(){
        top=-1;
        stackArray=new Object[minSize];
    }
    public SequenceStack(int n){
        if(n<minSize) n=minSize;
        top=-1;
        stackArray=new Object[n];
    }

    //入栈
    public void push(Object obj){
        if(top==stackArray.length-1) {
            Object[] p = new Object[top * 2];
            for(int i=0;i<top;i++)
                p[i]=stackArray[i];
                stackArray=p;
        }
        top++;
        stackArray[top]=obj;
    }
    //出栈
    public Object pop(){
        if(top==-1) return null;
        top--;
        return stackArray[top+1];
    }

    public Object peek(){
        if(top==-1) return null;
        return stackArray[top];

    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void clear(){
        top=-1;
    }
}
