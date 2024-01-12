public class NumberGenerator {
	private int startNum;
	private int endNum;

	public NumberGenerator(int a, int b) {
		this.startNum = a;
		this.endNum = b;
	}

	public void generator() {
		Thread curTh = Thread.currentThread();
		String thName = curTh.getName();
		System.out.println("Generating sequence of numbers from " + startNum + " to " + endNum);
		for (int i = startNum; i <= endNum; i++) {
			System.out.println(thName + " i = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}