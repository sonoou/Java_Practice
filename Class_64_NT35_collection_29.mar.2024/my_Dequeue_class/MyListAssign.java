import java.util.Scanner;
class Node{
	Object o;
	Node next;
}

interface MyIterator{
	boolean hasNext();
	Object next();
}

class MyLinkedList implements MyIterator{
	Node first = null;
	Node hn,n;
	public MyIterator myiterator(){
		hn = n = first;
		return this;
	}
	public boolean hasNext(){
		boolean flag = false;
		if(hn != null){
			flag = true;
			hn = hn.next;
		}
		return flag;
	}
	public Object next(){
		Object o;
		o = n.o;
		n = n.next;
		return o;
	}
	public boolean isEmpty(){
		boolean flag = false;
		if(first == null){
			flag = true;
		}
		return flag;
	}
	public void addFirst(Object o){
		Node newNode = new Node();
		newNode.o = o;
		newNode.next = first;
		first = newNode;
	}
	public void addLast(Object o){
		Node newNode = new Node();
		newNode.o = o;
		Node var = first;
		if(first == null){
			System.out.println("Dequeue is already empty. So this element will be considred as first element.");
			first = newNode;
		}
		else{
			while(var.next != null){
				var = var.next;
			}
			var.next = newNode;
		}
	}
	public Object getFirst(){
		Object o = first.o;
		return o;
	}
	public Object getLast(){
		Node var = first;
		while(var.next != null){
			var = var.next;
		}
		Object o = var.o;
		return o;
	}
	public Object removeFirst(){
		Object o = first.o;
		first = first.next;
		return o;
	}
	public Object removeLast(){
		int count = 1;
		Node var = first;
		Object o;

		if(first.next == null){
			System.out.println("inside count if");
			o = first.o;
			first = null;
		}
		else{
			while(var.next != null){
				System.out.println("var: "+var);
				System.out.println("var.next: "+var.next);
				if(var.next.next == null){
					break;
				}
				var = var.next;
			}
			System.out.println("inside count else");
			o = var.o;
			var.next = null;
		}
		return o;
	}
}

public class MyListAssign{
	public static void main(String args[]){
		MyLinkedList list = new MyLinkedList();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while(true){
			System.out.println("\r");
			System.out.println("Operation menu for the DQ");
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int m = sc.nextInt();
			if(m == 1){
				while(true){
					System.out.println("\nMenu/Add");
					System.out.println("1. front-end");
					System.out.println("2. back-end");
					System.out.println("3. back");
					System.out.print("Enter your choice: ");
					int ma = sc.nextInt();
					if(ma == 1){
						System.out.print("Enter element value: ");
						int mav = sc.nextInt();
						list.addFirst(mav);
					}
				    else if(ma == 2){
						System.out.print("Enter element value: ");
						int mav = sc.nextInt();
						list.addLast(mav);
					}
					else if(ma == 3){
						break;
					}
					else{
						System.out.println("Wrong input");
					}
				}
			}
			else if(m == 2){
				while(true){
					System.out.println("\nMenu/Delete");
					System.out.println("1. front-end");
					System.out.println("2. back-end");
					System.out.println("3. back");
					System.out.print("Enter your choice: ");
					int md = sc.nextInt();
					if(md == 1){
						System.out.println(list.isEmpty()?"Dequeue is empty!":list.removeFirst());
					}
				    else if(md == 2){
						System.out.println(list.isEmpty()?"Dequeue is empty!":list.removeLast());
					}
					else if(md == 3){
						break;
					}
					else{
						System.out.println("Wrong input");
					}
				}
			}
			else if(m == 3){
				if(list.isEmpty()){
					System.out.println("Dequeue is empty!");
				}
				else{
					MyIterator i = list.myiterator();
					while(i.hasNext()){
						System.out.println(i.next());
					}
				}
			}
			else if(m == 4){
				break;
			}
			else{
				System.out.println("Wrong input");
			}
		}
	}
}
