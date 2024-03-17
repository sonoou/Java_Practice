import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;

public class Calculator{
	Frame f;
	TextField tf;
	Button b;
	String bCap[][]={{"%","CE","C","⌫"}, {"1/x","x^2","√x","÷"}, {"7","8","9","x"}, {"4","5","6","-"}, {"1","2","3","+"}, {"‰","0",".","="} };

	Calculator(String s){
		f=new Frame(s);

		tf=new TextField();
		tf.setBounds(0,0,320,60);
		f.add(tf);

		for(int i=0;i<bCap[i].length;i++){
			for(int j=0;j<bCap.length;j++){
				b=new Button(bCap[j][i]);
				b.setBounds(80*i,60*(j+1),80,60);
				f.add(b);
			}
		}

		f.setBounds(100,100,320,420);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String... s){
		new Calculator("Calcultor");
	}
}
