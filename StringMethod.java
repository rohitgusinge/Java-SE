//Program to check username and domain from Mail id, if the mail id of g-mail domain then it will print "true" rest "false"
import java.lang.*;
import java.util.*;
class StringMethod
{
		public static void main(String ars[])
		{
			Scanner sc=new Scanner(System.in);
			String gid;
			System.out.println("Enter your Mail id: "); //Accept Mail id from User
			gid=sc.nextLine();


			//String str="rohit@gmail.com";
			int i=gid.indexOf("@");         //befor @ it has username
			String uname=gid.substring(0,i);
			String domain=gid.substring(i+1,gid.length());

			System.out.println("Username :"+uname);
			System.out.println("Domain :"+domain);

			System.out.println(domain.startsWith("gmail"));  //To check domain is gmail or not
		}
}