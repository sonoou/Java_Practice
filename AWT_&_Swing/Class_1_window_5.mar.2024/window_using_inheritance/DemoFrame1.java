import java.awt.*;

class DemoFrame1 extends Frame{
	DemoFrame1(String s,int i,int j){
		super(s);
		setSize(i,j);
		setVisible(true);
	}
	public static void main(String... s){
		new DemoFrame1("First Frame",400,400);
		new DemoFrame1("Second Frame",200,200);
	}
}
