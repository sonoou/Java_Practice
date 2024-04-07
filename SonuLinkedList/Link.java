class Link{
	public int iData;
	public Link next = null;
	public Link(int id){
		iData = id;
	}
	public String toString(){
		// return "{ "+iData+" }";
		if(next == null){                  // +
			return iData+" ";              // +
		}                                  // +
		else{                              // +
			return iData+", ";             // +
		}                                  // +
	}
}