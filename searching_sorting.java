package ARRAY;

public class searching_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 5, 3, 6, 7, 1 };
		sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}

	}

	public static void sort(int[] array) {

		for (int turn = 1; turn < array.length; turn++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

	}
}
