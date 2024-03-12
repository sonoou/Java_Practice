import java.io.*;

class DataStream1{
	public static void main(String s1[])throws IOException{
/*		FileOutputStream fout=new FileOutputStream("codesquadz.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeBoolean(true);
		dout.writeFloat(3.4f);
		dout.writeDouble(10.9);
		dout.writeByte(10);
		dout.writeShort(11);
		dout.writeInt(10);
		dout.writeLong(10);
		dout.writeChar('S');
		dout.close();
*/
		FileInputStream fin=new FileInputStream("codesquadz.txt");
		DataInputStream din=new DataInputStream(fin);
		System.out.println(din.readBoolean());
		System.out.println(din.readFloat());
		System.out.println(din.readDouble());
		System.out.println(din.readByte());
		System.out.println(din.readShort());
		System.out.println(din.readInt());
		System.out.println(din.readLong());
		System.out.println(din.readChar());
		din.close();

	}
}
