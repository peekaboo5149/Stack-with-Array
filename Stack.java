import java.io.*;
public class Stack
{
	static int[] stack;
	static int topOfStack=-1;
	public static void create(int size)
	{
		stack= new int[size];
	}
	public static void push(int data)
	{
		if(stackIsFull())
		{
			System.out.println("Stack is full");
			return;
		}
		stack[topOfStack+1]=data;
		topOfStack++;
		//System.out.println("inserted"+data);
	}
	public static void pop()
	{
		if(stackIsEmpty())
		{
			System.out.println("Nothing to pop");
			return;
		}
		System.out.println("popped"+stack[topOfStack]);
		topOfStack--;
	}
	public static void peek()
	{
		if(stackIsEmpty())
		{
			System.out.println("Nothing to pop");
			return;
		}
		System.out.println("data at top"+stack[topOfStack]);
	}
	public static boolean stackIsEmpty()
	{
		if(topOfStack==-1)
			return true;
		else
			return false;
	}
	public static boolean stackIsFull()
	{
		if(topOfStack+1==stack.length)
			return true;
		else
			return false;
	}
	public static void printStack()
	{
		for(int i=0;i<=topOfStack;i++)
			System.out.println(stack[i]);
	}
	public static void main(String[] args)
	{
		create(10);
		for(int i=1;i<=10;i++)
			push(i*5);
		printStack();
		peek();
		pop();
		push(30);
		printStack();
	}
}