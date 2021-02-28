package java_features.other_tasks.test;

public class Insert {
	public static void main(String[] args) {
		int left = 1;
		int right = 19;
		int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

		for (int k = left; ++left <= right; k = ++left) {
			//Очередную пару рядом стоя́щих элементов
			//заносим в пару буферных переменных
			int a1 = a[k], a2 = a[left];
			if (a1 < a2) {
				a2 = a1;
				a1 = a[left];
			}

			//Вставляем больший элемент из пары
			while (a1 < a[--k]) {
				a[k + 2] = a[k];
			}
			a[++k + 1] = a1;

			//Вставляем меньший элемент из пары
			while (a2 < a[--k]) {
				a[k + 1] = a[k];
			}
			a[k + 1] = a2;
		}

//Граничный случай, если в массиве нечётное количество элементов
//Для последнего элемента применяем сортировку простыми вставками
		int last = a[right];
		while (last < a[--right]) {
			a[right + 1] = a[right];
		}
		a[right + 1] = last;
	}
}
