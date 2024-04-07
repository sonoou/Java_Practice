public class MyLinkedList{
	public static void main(String[] args){
		LinkList theList = new LinkList();

		// theList.insertFirst(22);
		// theList.insertLast(66);
		// theList.insertLast(44);
		// theList.insertLast(100);
		// theList.insertLast(88);
		// theList.insertLast(88);
		// theList.insertLast(9);
		// theList.insertLast(8);

		// System.out.println("Before sort");
		// System.out.println(theList+"\n");

		// System.out.println("After sort");
		// theList.sort();
		// System.out.println(theList+"\n");

		// System.out.println("Before reverse:");
		// System.out.println(theList+"\n");

		// System.out.println("After reverse:");
		// theList.reverse();
		// System.out.println(theList+"\n");

		// System.out.println("After last delete: "+theList.deleteLast().iData);
		// System.out.println(theList+"\n");
		// // System.out.println(theList.deleteFirst());
		// System.out.println(theList.deleteFirst().iData); // +
		// System.out.println(theList);
		// while(!theList.isEmpty()){
		// 	Link aLink = theList.deleteFirst();
		// 	// System.out.print("Deleted "+aLink);
		// 	System.out.print("Deleted "+aLink.iData); // +
		// 	System.out.println();
		// }
		// System.out.println(theList);
		while(true){
			System.out.println("\nWhat do you want");
			System.out.println("  1. Insert");
			System.out.println("  2. Delete");
			System.out.println("  3. Reverse");
			System.out.println("  4. Sort");
			System.out.println("  5. Print list");
			System.out.println("  6. Exit");
			System.out.print("Enter your choice: ");
			int choice = new java.util.Scanner(System.in).nextInt();
			switch(choice){
				case 1: while(true){
							System.out.print("\nEnter the value: ");
							int value = new java.util.Scanner(System.in).nextInt();
							if(theList.isEmpty()){
								theList.insertFirst(value);
							}
							else{
								theList.insertLast(value);
							}
							//System.out.println(theList);
							int q;
							while(true){
								System.out.print("Want to insert more(Yes 1/ No 0): ");
								q = new java.util.Scanner(System.in).nextInt();
								if(q==1 || q==0){
									break;
								}
								else{
									System.out.println("Oops! wrong choice.");
									continue;
								}
							}
							if(q!=1){
								break;
							}
						}
						break;
				case 2: while(true){
							System.out.print("\nDelete(First 1/Last 0): ");
							int value = new java.util.Scanner(System.in).nextInt();
							if(theList.isEmpty()){
								System.out.println("LinkedList is empty: "+theList+" Please insert some values then delete.");
							}
							else if(value == 1){
								System.out.println("Delete successfully: "+theList.deleteFirst().iData);
							}
							else if(value == 0){
								System.out.println("Delete successfully: "+theList.deleteLast().iData);
							}
							else{
								System.out.println("Oops! Wrong choice");
							}
							//System.out.println(theList);
							int q;
							while(true){
								System.out.print("Want to delete more(Yes 1/ No 0): ");
								q = new java.util.Scanner(System.in).nextInt();
								if(q==1 || q==0){
									break;
								}
								else{
									System.out.println("Oops! wrong choice.");
									continue;
								}
							}
							if(q!=1){
								break;
							}
						}
						break;
				case 3: if(theList.isEmpty()){
							System.out.println("LinkedList is empty: "+theList+" Please insert some values then reverse.");
						}
						else{
							theList.reverse();
							System.out.println("Reversed successfully");
						}
						//System.out.println(theList);
						break;
				case 4: if(theList.isEmpty()){
							System.out.println("LinkedList is empty: "+theList+" Please insert some values then sort.");
						}
						else{
							theList.sort();
							System.out.println("Sorted successfully");
						}
						//System.out.println(theList);
						break;
				case 5: if(theList.isEmpty()){
							System.out.println("LinkedList is empty: "+theList+" Please insert some values then print.");
						}
						else{
							System.out.println(theList);
						}
						//System.out.println(theList);
						break;
				case 6: System.exit(0);
						break;
				default : System.out.println("Other options are not available");
			}
		}
	}
}
