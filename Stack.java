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
		System.out.println("inserted"+data);
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
		create(5);
		push(5);
		push(10);
		push(15);
		push(20);
		push(25);
		push(30);
		printStack();
		peek();
		pop();
		push(30);
		printStack();
	}
}