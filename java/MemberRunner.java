public class MemberRunner {
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.lastName = "千葉";
		member1.firstName = "美岬";
		member1.telephone = "2222";

		member1.greet();
		member1.nameGet();

	}
}
