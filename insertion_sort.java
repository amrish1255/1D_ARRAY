package ARRAY;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5,4,3,2,1  };
		sorting(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
public static void sorting(int[]array) {
	for(int i=0;i<array.length;i++) {
		insert_elements(array,i);
	}
}
	public static void insert_elements(int[] array,int i) {
		int j = i - 1;
		int item = array[i];
		while (j >= 0 && array[j] > item) {
			array[j + 1] = array[j];
			array[j] = item;
			j--;
		}

	}

}
