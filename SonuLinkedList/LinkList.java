class LinkList{
	private Link first;
	//private Link mid;  // +
	private Link last; // +
	public LinkList(){
		first = null;
		last = null; // +
	}

	public boolean isEmpty(){
		return (first==null);
	}
	public void insertFirst(int id){
		Link newLink = new Link(id);
		// newLink.next = first;
		first = newLink; // +
		last = newLink;  // +
	}
	public void insertLast(int id){ // added by sonu
		Link lastLink = new Link(id);
		last.next = lastLink;
		last = lastLink;
	}
	public void reverse(){ // added by sonu
		int count = 0;
		Link start = first;
		while(start != null){
			count++;
			start = start.next;
		}
		int count1 = count/2;
		start = first;
		for(int i=1;i<=count1;i++){
			Link end = first;
			for(int j=2;j<=count;j++){
				end = end.next;
				if(j==count){
					break;
				}
			}
			count--;
			int temp = start.iData;
			start.iData = end.iData;
			end.iData = temp;
			start = start.next;
		}
	}
	public void sort(){
		int count=0;
		Link current = first;
		while(current != null){
			count++;
			current  = current.next;
		}
		current = first;
		Link currentNext ;

		for(int i=1;i<=count-1;i++){
			current = first;
			for(int j=1;j<=count-1;j++){
				currentNext = current.next;
				if(current.iData>currentNext.iData){
					int temp = current.iData;
					current.iData = currentNext.iData;
					currentNext.iData = temp;
				}
				current = current.next;
			}
		}
	}
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	public Link deleteLast(){
		Link temp = first;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		temp = first;
		for(int i=1;i<count;i++){
			if(i==count-1){
				Link temp1 = temp.next;
				temp.next = null;
				return temp1;
			}
			temp = temp.next;
		}
		return null;
	}
	public String toString(){
		//String str = " ";
		String str = "{ ";                // +
		Link current = first;
		while(current != null){
			str += current.toString();
			current = current.next;
		}
		str += "}";                       // +
		return str;
	}
}