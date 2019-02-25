package Mycollectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ques7 {
    //Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
    public static void main(String[] args) {
        SpecialStack specialStack=new SpecialStack();
        specialStack.setSize(7);
        System.out.println("Stack operation");
        specialStack.push(1);
        specialStack.push(2);
        specialStack.push(7);
        System.out.println("Stack right now:" +specialStack.getData());
        specialStack.push(2);
        specialStack.pop();
        System.out.println("Stack after pop:"+specialStack.getData());
        System.out.println("Is Stack full"+specialStack.isFull());
        System.out.println("Is Stack Empty"+specialStack.isEmpty());
        System.out.println("Stack min element:"+specialStack.getMin());


    }
}

class SpecialStack{
    private List<Integer> stacklist;
    private int top,size;

    public SpecialStack(){
        this.top=-1;
        this.stacklist=new ArrayList<>();

    }
    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }


    public int push(int in){
        stacklist.add(in);
        top++;
        return in;
    }
    public int pop(){
        return stacklist.remove(top--);
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }

    public int getMin(){
        return Collections.min(stacklist);
    }
    public List<Integer> getData(){
        return stacklist;
    }
}