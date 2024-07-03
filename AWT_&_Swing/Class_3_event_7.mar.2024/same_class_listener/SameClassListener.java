import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
//import java.awt.WindowConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowConstants;

class SameClassListener implements ActionListener{
	Frame f;
	Button b, b1;
	TextField tf;
	SameClassListener(String s){
		f = new Frame(s);

		b = new Button("ok");
		b.addActionListener(this);
		b.setBounds(20,100,80,40);
		f.add(b);

		b1 = new Button("cancel");
		b1.setBounds(20,180,80,40);
		b1.addActionListener(this);
		f.add(b1);

		tf = new TextField();
		tf.setBounds(20,40,300,40);
		f.add(tf);

		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		f.setLayout(null);
		f.setSize(400,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("ap");
		if(e.getSource() == b){
			tf.setText("User ne ok button press kiya");
		}
		if(e.getSource() == b1){
			tf.setText("User ne cancel button press kiya");
		}
	}
	public static void main(String args[]){
		new SameClassListener("event demo");
	}
}
