package task;

import sweet.*;
import java.io.*;
import java.util.*;

public class task {
	private List<total> list = new ArrayList<total>();

	public List<total> getList()
	{
		return list;
	}

	

	public void add(total absCandy, int count)
	{
		for (total candy : getList()) 
		{
			if (candy.getName().equals(absCandy.getName()))
			{
				candy.setCount(candy.getCount() + count);
				return;
			}
		}
		getList().add(absCandy);
		absCandy.setCount(count);
	}

	
	public int calculateTotalWeight() {
		int value = 0;
		for (total candy : getList()) {
			value += candy.getCount() * candy.getWeight();
		}
		return value;
	}

	public void getAllCandy() {
		for (total candy : getList()) {
			System.out.print(candy.printAllValues());
		}
	}

	     
	

	public List<total> receiveBySugarValue(int start, int end) {
		ArrayList<total> list2 = new ArrayList<total>();
		sortBySugarValue(list2);
		for (total candy : getList()) {
			if (start <= candy.getSugarValue() && candy.getSugarValue() < end) {
				list2.add(candy);
			}
		}
		return list2;
	}

	
	public void sortBySugarValue(List<total> list) {
		Collections.sort(list, new CompareBySugarValue());
	}

	static class CompareBySugarValue implements Comparator<total>,
			Serializable {

		private static final long serialVersionUID = -6923839843945617223L;

		public int compare(total o1, total o2) {
			return o1.getSugarValue() - o2.getSugarValue();
		}

	}
}