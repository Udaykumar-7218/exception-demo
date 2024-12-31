package dec31;

public class exceptiondemo {

	public static void main(String[] args) {
   int n=100,d=0;
   try {
	   System.out.println(n/d);
	   
	   
   }
   catch(Exception a) {
	   System.out.println("error occured...");
		  a.printStackTrace();

	   try {
		   System.out.println("nested try block......");
		   System.out.println(10/0);
	   }catch(Exception e1) {
		   System.out.println("inside error....");
		  e1.printStackTrace();
		   
	   }
   }
   System.out.println("welcome");
   System.out.println("hello");
   System.out.println("hyd");;
	}

}
