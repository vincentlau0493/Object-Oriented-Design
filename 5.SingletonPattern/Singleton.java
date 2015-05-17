import java.util.*;

public class Singleton {

	public int range;  // 1 ~ range
	private List<Integer> numberList;
	private static Singleton self;
	private static boolean firstThread = false;
	private Singleton(int r) {
		range = r;
		generateList();
	}

	public static Singleton getInstance(int r) {

		if (!firstThread) {
			firstThread = true;
			try {
				Thread.sleep(200); //first thread wait
			} catch (Exception e) {}
		}


		synchronized(Singleton.class) {
			if (self == null || r != self.range) {
				self = new Singleton(r);
				Collections.shuffle(self.getNumberList());
			} 
		}

		return self;
	}

	private void generateList() {

		numberList = new LinkedList<Integer>();
		for (int i=1; i<=range; i++)
			numberList.add(i);
		
	}

	public List<Integer> getNumberList() {
		return self.numberList;
	}

	public int getNumber() {
		return self.numberList.size()>0 ? self.numberList.remove(0) : -1;
	}

}