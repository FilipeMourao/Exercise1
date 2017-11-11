import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.println("Please enter your name:");
		Scanner sc = new Scanner(System.in);
		HelloUser new_user = new HelloUser(sc.nextLine());
		System.out.println("Please enter your age:");
		Scanner sc1 = new Scanner(System.in);
		new_user.SetUserAge(sc1.nextInt());
		new_user.GreetUser();
		
	}

}
