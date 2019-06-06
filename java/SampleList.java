class SampleList {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("スプライト");
		nameList.add("太郎");
		nameList.add("花子");

		String name = nameList.get(0);
		int size = nameList.size();
		boolean emptyFlg = nameList.isEmpty();
		boolean containFlg = nameList.contain("花");
	}
}
