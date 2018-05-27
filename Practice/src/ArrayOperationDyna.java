import java.util.Scanner;

class ArrayOperationDyna {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int ia[] = new int[scn.nextInt()];
		for (int i = 0; i < ia.length; i++) {
			System.out.print("Enter Values of " + (i + 1) + " : ");
			ia[i] = scn.nextInt();
		}
		System.out.println();
		// display all value of this array
		ArrayOper.display(ia);
		// retrieving index value from the array
		System.out.print("Which index value want to retrieve : ");
		ArrayOper.retrive(ia, scn.nextInt());
		System.out.println();
		// replaceing (modifying) index value
		System.out.print("Which index value want to modify, Enter index Number: ");
		int index = scn.nextInt();
		System.out.print("Enter new Value : ");
		int value = scn.nextInt();
		ArrayOper.modify(ia, index, value);
		// removing index element(value)
		System.out.print("Enter index value want to remove : ");
		ia = ArrayOper.remove(ia, scn.nextInt());
		// insert a new element in the array
		System.out.print("Where you want to insert new value : ");
		int index1 = scn.nextInt();
		System.out.print("Enter new Value : ");
		int value1 = scn.nextInt();
		ArrayOper.insert(ia, index1, value1);
		System.out.println();
	}// main method close
}// class close

class ArrayOper {
	static void display(int[] ia) {
		System.out.print("Original value : ");
		System.out.print("[" + ia[0]);
		for (int i = 1; i < ia.length; i++) {
			System.out.print("," + ia[i]);
		}
		System.out.println("]");
		System.out.println();
	}

	static void retrive(int[] ia, int index) {
		System.out.print("Your index Value : " + ia[index] + "\n");
	}

	static void modify(int[] ia, int index, int value) {
		ia[index] = value;
		System.out.print("Modify array value : ");
		System.out.print("[" + ia[0]);
		for (int i = 1; i < ia.length; i++) {
			System.out.print("," + ia[i]);
		}
		System.out.println("]");
		System.out.println();
	}

	static int[] remove(int[] ia, int index) {
		int[] nextArray = new int[ia.length - 1];
		for (int i = 0, j = 0; i < ia.length; i++) {
			if (i != index) {
				nextArray[j] = ia[i];
				j++;
			}
		}
		ia = nextArray;
		System.out.print("Array value after remove : ");
		System.out.print("[" + ia[0]);
		for (int i = 1; i < ia.length; i++) {
			System.out.print("," + ia[i]);
		}
		System.out.println("]");
		System.out.println();
		return ia;
	}

	static void insert(int[] ia, int index, int value) {
		int[] nextArray = new int[ia.length + 1];
		for (int i = 0, j = 0; i < ia.length; i++, j++) {
			if (i != index) {
				nextArray[j] = ia[i];
			} else {
				nextArray[j] = value;
				nextArray[++j] = ia[i];
			}
		}
		// ia=nextArray;
		System.out.print("Array value after insert : ");
		System.out.print("[" + ia[0]);
		for (int i = 1; i < nextArray.length; i++) {
			System.out.print("," + nextArray[i]);
		}
		System.out.println("]");
		System.out.println();

	}// class close
}