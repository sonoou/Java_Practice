package my;

public class MyBean{
	private String name;
	private String pass;

	public void setName(String name){
		this.name = name;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getName(){
		return name;
	}
	public String getPass(){
		return pass;
	}
	public String validate(){
		if(name.equals("appsquadz") && pass.equals("appsquadz")){
			return "valid";
		}
		else{
			return "invalid";
		}
	}
	public int add(int x, int y){
		return x+y;
	}
}
