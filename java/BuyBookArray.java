import java.util.Scanner;

class BuyBookArray {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		String[] bookNameArray = new String[5];
		int[] bookPriceArray = new int[5];		

		for(int i = 0; i < bookNameArray.length; i++) {
			System.out.print("本の名前を入力してください：");
			String bookName = scn.next();
			bookNameArray[i] = bookName;
		}
		
		for(int i = 0; i < bookPriceArray.length; i++) {
			System.out.print(bookNameArray[i]+"の代金を入力してください：");
			int bookPrice = scn.nextInt();
			bookPriceArray[i] = bookPrice;
		}
		
		int bookPriceSum = 0;
		for(int bookPrice : bookPriceArray) {
			bookPriceSum += bookPrice;
		}
		System.out.println("本の合計金額は" + bookPriceSum + "円です");
		
	}
}
