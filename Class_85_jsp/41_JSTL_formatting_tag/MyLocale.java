package my;

import java.util.ListResourceBundle;

public class MyLocale extends ListResourceBundle{
	public Object[][] getContents(){
		return data;
	}
	static final Object[][] data = {
																	{"count.one","One1"},
																	{"count.two","Two2"},
																	{"count.three","Three3"}
																 };
}
