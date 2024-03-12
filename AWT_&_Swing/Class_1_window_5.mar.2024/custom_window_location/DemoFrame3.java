import java.awt.*;

class DemoFrame3{
	Frame f;
	Button b;
	Label l;
	TextField tf;
	DemoFrame3(String s){
		f=new Frame(s);
		l=new Label("Enter the no. ");
		l.setBounds(40,40,80,20);
		f.add(l);

		tf=new TextField();
		tf.setBounds(150,40,50,20);
		f.add(tf);

		b=new Button("OK");
		b.setBounds(40,100,50,50);
		f.add(b);

		Toolkit t = f.getToolkit();
		Dimension screenSize = t.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;

		//f.setBounds(((width/2)-(600/2)),((height/2)-(400/2)),600,400);
		f.setBounds(width/2-600/2,height/2-400/2,600,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String... s){
		new DemoFrame3("आ प की इच्छा के अनुसार");
	}
}
