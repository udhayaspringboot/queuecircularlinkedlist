package com.queue.circular;

import java.util.Scanner;



public class QueueCircularLinkedList {
	
	
	
	class Node{
		
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	
	Node front = null;
	Node rear = null;
	
	void enQueue(int data)
	{
		Node node = new Node(data);
		
		if(front == null)
		{
	   front = node;
	   rear = node;
	   node.next = front;
			
		}
		else
		{
			rear.next = node;
			rear = node;
			node.next = front;
		}
		
	}
	
	void deQueue()
	{
		if(front == null)
		{
			System.out.println("Queue is Empty from deQueue()");
		}
		else
		{
			Node temp = front;
			front = front.next;
			rear.next = front;
			System.out.println("\nelement "+temp.data +"  is deleted ");
		}
	}
	
	void display()
	{
		if(front == null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			Node temp = front;
			System.out.println("Values in queue are : ");
			do
			{
				System.out.print(temp.data +"--> ");
				temp = temp.next;
			}while(temp != front);
		}
	}
	
	void queueFront()
	{
		if(front == null)
		{
			System.out.println("Queue is empty from QueueFront");
		}
		else
		{
			System.out.println("front value in queue is "+front.data);
		}
	}

	public static void main(String[] args) {
		
		QueueCircularLinkedList queCir = new QueueCircularLinkedList();
		queCir.enQueue(6);
		queCir.enQueue(3);
		queCir.display();
		queCir.deQueue();
		queCir.display();
		 int choice=0;  
		 char ch = ' ';
		    Scanner sc = new Scanner(System.in);  
		    
		    System.out.println("*********Queue operations using Circular Linked List*********\n");  
		    System.out.println("\n------------------------------------------------\n");  
		    do
		    {  
		        System.out.println("\nChose one from the below options...\n");  
		        System.out.println("\n1.EnQueue\n2.DeQueue\n3.Show\n4.QueueFront");  
		        System.out.println("\n Enter your choice \n");        
		        choice = sc.nextInt();  
		        switch(choice)  
		        {  
		            case 1:  
		            {   System.out.println("Enter the element to Enqueue");
		                 
		            
		            queCir.enQueue(sc.nextInt()); 
		                break;  
		            }  
		            case 2:  
		            {  
		            	queCir.deQueue();  
		                break;  
		            }  
		            case 3:  
		            {  
		            	queCir.display();
		                break;  
		            }  
		            case 4:  
		            {  
		            	queCir.queueFront();
		                break;  
		            }  
		            default:  
		            {  
		                System.out.println("Please Enter valid choice ");  
		            }  
		        }
		            System.out.println("\nDo you want to continue ? (Y/N)");
					Scanner acb = new Scanner(System.in);
					ch = acb.next().charAt(0);
				
		    }while (ch == 'y' || ch == 'Y');
		        

	}

}
