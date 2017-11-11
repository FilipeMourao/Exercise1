
public class HelloUser {
	String username;
	int age;
	
	public HelloUser(String name) {
		this.username = name;
		
	}

	
	void SetUserAge(int age ) {
		this.age = age;
	}
	void GreetUser() {
		System.out.println("Hello " + username + "!" );
		System.out.println("You have " + age + " years old!");
	}
	

}
