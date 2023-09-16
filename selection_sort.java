package ARRAY;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 4, 6, 5 };
		sorting(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

	public static void sorting(int[] array) {

		for (int turn = 1; turn < array.length; turn++) {

			for (int i = 0; i < array.length; i++) {
				int min = i;// index
				for (int j = i + 1; j < array.length; j++) {
					if (array[min] > array[j]) {
						min = j;
					}

				}
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;

			}
		}
	}
}
