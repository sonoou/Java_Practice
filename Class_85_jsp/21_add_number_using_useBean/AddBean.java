package my;


public class AddBean{
	private int firstNo;
	private int secondNo;

	public void setFirstNo(int firstNo){
		this.firstNo = firstNo;
	}

	public void setSecondNo(int secondNo){
		this.firstNo = firstNo;
	}

	public int getFirstNo(){
		return firstNo;
	}

	public int getSecondNo(){
		return secondNo;
	}
	
	public int add(){
		return firstNo+secondNo;
	}
}
