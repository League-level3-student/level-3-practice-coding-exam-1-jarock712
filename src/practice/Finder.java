package practice;

import java.util.ArrayList;

public class Finder {

	public Object lastIndexOf(ArrayList<String> a, String s) {
		// TODO Auto-generated method stub
		int last = -1;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).toLowerCase().equals(s.toLowerCase())) {
				last = i;
				System.out.println(last);
			}
		}
		if (last == -1) {
			return -1;
		}
		return last;
	}

}
