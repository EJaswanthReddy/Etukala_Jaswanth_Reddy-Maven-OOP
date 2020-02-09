package application;
import sweet.*;
import task.*;
public class application
{
	private static final int START = 20;
	private static final int END = 45;

	// Creating objects
	private static final kajubharfi kajubharfi1 = new kajubharfi("kajubharfi1", 10, 8);
	private static final kajubharfi kajubharfi2 = new kajubharfi("kajubharfi2", 15, 13);
	private static final kajubharfi kajubharfi3 = new kajubharfi("kajubharfi3", 24, 22);
	private static final kalakan kalakan1 = new kalakan("kalakan1", 10, 45);
	private static final kalakan kalakan2 = new kalakan("kalakan2", 20, 47);
	private static final rasgulla rasgulla1 = new rasgulla("rasgulla1", 20, 15);
	private static final rasgulla rasgulla2 = new rasgulla("rasgulla2", 27, 22);

	// Creating container
	private static final  task GIFT = new task();

	public static task getGift() {
		return GIFT;
	}



	public static void createGift() {
		getGift().add(kajubharfi1, 7);
		getGift().add(kajubharfi2, 8);
		getGift().add(kajubharfi3, 4);
		getGift().add(kalakan1, 6);
		getGift().add(kalakan2, 5);
		getGift().add(rasgulla1, 3);
		getGift().add(kajubharfi3, 2);
		getGift().add(rasgulla2, 8);
		getGift().add(rasgulla2, 4);
		getGift().add(kajubharfi1, 12);
		getGift().add(kajubharfi2, 17);
		getGift().add(kajubharfi3, 14);
		getGift().add(kalakan1, 1);
		getGift().add(kalakan2, 1);
		getGift().add(rasgulla1, 3);
		getGift().add(rasgulla2, 1);
	}
    public static void main( String[] args )
    {
    	createGift();
		System.out.println("displaying all the sweets with properties:");
		getGift().getAllCandy();
		System.out.println();
		System.out.println("sorting sweets based on sugarvalues");
		getGift().sortBySugarValue(getGift().getList());
		getGift().getAllCandy();
		System.out.println();
		System.out.println("total weight ");
		System.out.println(getGift().calculateTotalWeight() + " gm");
		System.out.println();
		System.out
				.println("All sweets with selected range of sugar value(from "
						+ START + "% to " + END + "%) :");
		for (total sweet : getGift().receiveBySugarValue(START, END)) {
			System.out.print(sweet.printAllValues());
		}
	}
}