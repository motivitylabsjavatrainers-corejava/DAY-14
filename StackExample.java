package com.motivity.collection;

import java.util.Stack;

public class StackExample 
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<>();
		st.push(12);
		st.push(23);
		st.push(34);
		st.push(45);
		st.push(56);
		st.push(67);
		st.push(78);
		st.push(89);
		st.push(90);
		st.push(32);
		System.out.println(st);
		System.out.println("+==================================");
		System.out.println("here it followes first in last out");
		System.out.println("pop operation will use to remove an element from stack..");
		System.out.println("to remove last element of stack "+st.pop());
		
		System.out.println("after remove an element : "+st);
		System.out.println("==================================");
		System.out.println("empty method will use to check the stack is empty or not and gives to boolean type value");
		System.out.println("stack is empty : "+st.empty());
		System.out.println("==================================");
		System.out.println("peek method will return last element of stack.....");
		System.out.println("last element of the stack is : "+st.peek());
		System.out.println(st.peek());
		
		
	}

}
