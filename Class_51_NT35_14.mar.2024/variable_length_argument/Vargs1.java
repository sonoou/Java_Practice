class Vargs1{
	static void show(Object... x){
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]+" ");
		}
	}
	public static void main(String s[]){
		int day = 1;
		String month = "april";
		int year = 2024;
		show();//new Object[]{}
		show(day);//new Object[]{new Interger(day)}
		show(day,month);//new Object[]{new Interger(day, month)}
		show(day, month, year);// new Object[]{new Interger(day),month, new Interger(year)}
		Object dateinfo[]={day,month,year};
		show(dateinfo);
		show((Object)dateinfo);//new Object[]{(Object)dateinfo}
		show(new Object[]{dateinfo});
	}
}
