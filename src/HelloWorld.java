import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		System.out.println("Please enter your name:");
		Scanner sc = new Scanner(System.in);
		HelloUser new_user = new HelloUser(sc.nextLine());
		new_user.GreetUser();
		
	}

}
