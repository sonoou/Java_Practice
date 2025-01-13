<html>
<body>
	<%!	javax.servlet.jsp.JspWriter localOut;
		class BaseClass{
			public void start()throws java.io.IOException{
				localOut.println("Starting...<br>");
			}
		}
		class DerivedClass1 extends BaseClass{
			public void fly()throws java.io.IOException{
				localOut.println("Flying...<br>");
			}
		}
		class DerivedClass2 extends DerivedClass1{
			public void fly()throws java.io.IOException{
				localOut.println("Flying... from derive2<br>");
			}
		}
	%>
	<%
		localOut = out;
		out.println("Creating a DerivedClass2 object...<br>");
		BaseClass p = new DerivedClass2();
		p.start();
		DerivedClass2 p1 = new DerivedClass2();
		p1.fly();
	%>
</body>
</html>
