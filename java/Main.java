import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(20+4);
		
		int radius = 5;
		int Pi = 3;
		System.out.println(radius*2*Pi);
		System.out.println(radius*radius*Pi);
		
		String x = "1000";
		String y = "50";
		
		int numX = Integer.parseInt(x);
		int numY = Integer.parseInt(y);
		
		System.out.println(numX + numY);
		
		String str1 = "あいうえお";
		if(str1 == "Ruby") {
		System.out.println("str1とRubyは等しいです");
		}
		
		int num2 = 4;
		if(num2 > 5) {
		System.out.println("num2は5よりも大きいです");
		}
		
		System.out.println("映画を予約するシステムです");
		System.out.print("何時の映画を予約しますか？(11時/13時/15時のいずれかで答えて下さい)：");
		Scanner scn = new Scanner(System.in);
		String movieTime = scn.next();
		
		if(movieTime.equals("11時")) {
			System.out.println("すでに上映されているため、予約できません");
		} else if(movieTime.equals("13時")) {
			System.out.println("満席のため、予約できません");
		} else if(movieTime.equals("15時")) {
			System.out.println("予約を完了しました");
		} else {
			System.out.println("11時/13時/15時のいずれかで答えて下さい");
		}
		
	}
}
