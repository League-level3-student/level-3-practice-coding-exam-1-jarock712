package practice;
import java.util.HashMap;
public class FishingContest {
	private HashMap <String, Double> tally;
	private HashMap <String, double[]> catches;
	public FishingContest(HashMap<String, double[]> catches) {
		// TODO Auto-generated constructor stub
		tally = new HashMap <String, Double>();
		this.catches = catches;
		fullTally();
	}
	private void fullTally() {
		// TODO Auto-generated method stub
		for (String hold3: catches.keySet()) {
			double all = 0;
			for (double hold4: catches.get(hold3)) {
				if (hold4 >= 3) {
					all += hold4;
				}
			}
			tally.put(hold3, all);
		}
	}
	public double findBiggestFish(String fish) {
		// TODO Auto-generated method stub
		if (catches.get(fish).length == 0) {
			return 0.0;
		}
		double[] hold = catches.get(fish);
		double hold2 = hold[0];
		for (double hold3: hold) {
			if (hold3 > hold2) {
				hold2 = hold3;
			}
		}
		if (hold2 < 3) {
			return 0.0;
		}
		return hold2;
	}
	public Object findWinner() {
		// TODO Auto-generated method stub
		String top = "";
		double hold3 = 0;
		for (String hold5: catches.keySet()) {
			if (tally.get(hold5) > hold3) {
				hold3 = tally.get(hold5);
				top = hold5;
			}
		}
		return top;
	}

}