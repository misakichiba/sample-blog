class PracticeArray03 {
	public static void main(String[] args) {
	
		int[] numArray = {3, 6, 9};
		System.out.println(numArray.length);
		for(int num : numArray) {
			System.out.println(num);
		}
	
		int sum = 0;
		for(int i : numArray) {
			sum += i;
		}
		System.out.println(sum);
	}
}
