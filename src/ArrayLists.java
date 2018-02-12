import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
	public static int getNumber() {
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.println("Enter a number: ");
			if (in.hasNextInt()) {
				input = in.nextInt();
				isInvalid = false;
			} else {
				in.nextLine(); // clear out invalid input
				System.out.println("Invalid Input");
			}
		}
		return input;
	}

	public static ArrayList<Integer> Populate(ArrayList<Integer> arrayList) {
		System.out.println("Enter 10 values to fill the ArrayList");
		for (int i = 0; i < 10; i++) {
			arrayList.add(getNumber());
		}
		return arrayList;
	}

	public static void printList(ArrayList<Integer> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (i != arrayList.size() - 1) {
				System.out.print(arrayList.get(i) + ", ");
			} else {
				System.out.print(arrayList.get(i) + "\n");
			}
		}
	}

	public static void printReverse(ArrayList<Integer> arrayList) {
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			if (i > 0) {
				System.out.print(arrayList.get(i) + ", ");
			} else {
				System.out.print(arrayList.get(i) + "\n");
			}
		}
	}

	public static int findValue(ArrayList<Integer> arrayList) {
		System.out.println("Enter value to be found");
		int value = getNumber();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) == value) {
				return value;
			}
		}
		return -1;
	}

	public static void insertValue(ArrayList<Integer> arrayList) {
		int index = -1;
		System.out.println("Enter index of value to be modified");
		while (index < 0 || index > arrayList.size()) {
			System.out.println("Index must be [0-9]");
			index = getNumber();
		}
		System.out.println("Enter new value");
		int value = getNumber();
		arrayList.set(index, value);
		System.out.println(arrayList.get(index));
	}

	public static int maxValue(ArrayList<Integer> arrayList) {
		int max = arrayList.get(0);
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) > max)
				max = arrayList.get(i);
		}
		return max;
	}

	public static int sum(ArrayList<Integer> arrayList) {
		int sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			sum += arrayList.get(i);
		}
		return sum;
	}

	public static void menu(ArrayList<Integer> arrayList) {
		Boolean boucle = true;

		while (boucle) {
			System.out.println("1. Display Numbers\n" + "2. Display Reversed\n" + "3. Display Sum\n"
					+ "4. Display Average\n" + "5. Display Maximum\n" + "6. Search for a Value\n"
					+ "7. Insert new Value\n" + "8. Reset Values\n" + "9. Quit");
			int option = -1;
			while (option < 1 || option > 9) {
				System.out.println("Input must be [1-9]");
				option = getNumber();
			}

			switch (option) {
			case 1:
				printList(arrayList);
				break;
			case 2:
				printReverse(arrayList);
				break;
			case 3:
				System.out.println(sum(arrayList));
				break;
			case 4:
				System.out.println(sum(arrayList) / arrayList.size());
				break;
			case 5:
				System.out.println(maxValue(arrayList));
				break;
			case 6:
				System.out.println(findValue(arrayList));
				break;
			case 7:
				insertValue(arrayList);
				break;
			case 8:
				System.out.println("Reset");
				break;
			default:
				boucle = false;
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Populate(arrayList);
		System.out.println("Coucou");
		menu(arrayList);
	}

}
