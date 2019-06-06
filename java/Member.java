public class Member {
	public String lastName;
	public String firstName;
	public String telephone;

	public void greet() {
		System.out.println("こんにちは");
	}

	public void nameGet() {
		System.out.println(this.lastName + " " + this.firstName);
	}

} 
