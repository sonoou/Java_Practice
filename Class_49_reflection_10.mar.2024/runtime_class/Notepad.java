class Notepad{
	public static void main(String s[]){
		Runtime rt = Runtime.getRuntime();
		try{
			rt.exec("gnome-tweaks");
			//rt.exec("C:\\Program Files(x86)\\Google\\Chrome\\Application\\chrome.exe");
			//rt.exec("C:\\Windows\\explorer.exe");
			//rt.exec("control.exe");
			//rt.exec("calc.exe");
			//rt.exec("C:\\Program Files(x86)\\Microsoft Office\\Office16\\windword.exe");
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("hello");
	}
}
