package abadu;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("------Arithmetic opertor");

int a=20,b=10;
System.out.println("a+b="+(a+b));
System.out.println("a-b="+(a-b));
System.out.println("a*b="+(a*b));
System.out.println("a/b="+(a/b));//quotient
System.out.println("a%b="+(a%b));//reminder

  System.out.println("------Assignment operator----");
int c=b;
System.out.println(a+=b); //a=a+b 30
System.out.println(a-=b); //a=a-b 20
	
	System.out.println("-----Relational operator---");
	int v1=20,v2=10;
	System.out.println(v1==v2);//false
	System.out.println(v1>v2);
	System.out.println(v1<=v2);
	
	System.out.println("----logical operator---");
	
//	A		B		A&B		A||B		!A		1B
//	T		T		 T		  T 		 F	     F
//	T		F		 F		  T			 F		 T
//	F		T		 F		  T			 T		 F
//	F		F		 F		  T			 T		 T

		String username="abc";
		String pswd="abc313";
		
		System.out.println(username=="abc"&& pswd=="abc313");
		System.out.println(username=="abc"|| pswd=="abc313");
		System.out.println(!(username=="abc"));
		
		System.out.println("----unary operator----");
		int v3=5;
		System.out.println(v3++);
		System.out.println(v3);
		System.out.println(++v3);
		
		
		System.out.println("----teritary operator---");
		String ans=v1>v2?"v1 is greater":"v2 is greater";
		System.out.println(ans);
}
}
