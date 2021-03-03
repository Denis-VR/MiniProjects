package project_9_StringList;

public class ListString {
	private StringItem head = new StringItem();

	private static class StringItem {
		private char[] symbols = new char[16];
		private StringItem next;
		private byte count;

	}

	//длина строки
	public int length() {
		int len = 0;
		StringItem currentItem = head;
		ListString newListString = new ListString();
		while (currentItem != null) {
			for (int i = 0; i < 16; i++) {
				if (currentItem.symbols[i] != 0) {
					newListString.append(currentItem.symbols[i]);
					len++;
				}
				else break;
			}
			currentItem = currentItem.next;
		}
		head = newListString.head;
		return len;
	}

	public ListString(String string) {
		StringItem currentItem = head;
		char[] ourString = string.toCharArray();
		int numberItem = ourString.length / 16 + 1;
		for (int item = 0; item < numberItem; item++) {
			for (int countSymbol = 0; countSymbol < 16; countSymbol++) {
				int num = countSymbol + (item * 16);
				if (ourString.length - num != 0) {
					currentItem.symbols[countSymbol] = ourString[num];
					currentItem.count++;
				} else break;
			}
			currentItem.next = new StringItem();
			currentItem = currentItem.next;
		}
	}

	//Конструктор без аргументов
	public ListString() {
	}

	//Находим StringItem по индексу
	public StringItem getItem(int index) {
		this.length(); //метод объединяет строки.
		int numberItem = index / 16 + 1;
		StringItem currentItem = head;
		for (int i = 1; i < numberItem; i++) {
			currentItem = currentItem.next;
		}
		return currentItem;
	}

	//Нахождение нужного StringItem-а.
	private StringItem getLastItem() {
		StringItem currentItem = head;
		while (currentItem.next != null) {
			currentItem = currentItem.next;
		}
		return currentItem;
	}

	//метод проверяет, есть ли в нашем ListString элемент с указанным индексом.
	public void checkIndex(int index) throws OwnIndexOutOfBoundsException {
		if (index > this.length()) throw new OwnIndexOutOfBoundsException();
	}

	//находим символ в строке в позиции index
	public char charAt(int index) throws OwnIndexOutOfBoundsException {
		checkIndex(index);

		StringItem currentItem = getItem(index);
		return currentItem.symbols[index % 16];
	}

	//замена символа в позиции index на символ ch
	public void setCharAt(int index, char ch) throws OwnIndexOutOfBoundsException {
		checkIndex(index);

		StringItem currentItem = getItem(index);
		currentItem.symbols[index % 16] = ch;
	}

	//TODO: test it
	//взятие подстроки, от start до end, не включая end
	public ListString substring(int start, int end) throws OwnIndexOutOfBoundsException {
		checkIndex(end);

		ListString substring = new ListString();
		StringItem currentItem = getItem(start);
		int count = 0;

		for (int i = currentItem.count - 1; i < 16; i++) {
			substring.append(currentItem.symbols[i]);
			count++;
			if (count == end - start) return substring;
		}

		while (count < end - start) {
			currentItem = currentItem.next;
			for (int i = 0; i < 16; i++) {
				substring.append(currentItem.symbols[i]);
				count++;
				if (count == end - start) return substring;
			}
		}

		return substring;
	}

	//добавить в конец символ
	public void append(char ch) {
		StringItem lastItem = getLastItem();
		if(lastItem.count==16) {
			lastItem.next = new StringItem();
			lastItem = lastItem.next;
		}
		lastItem.symbols[lastItem.count] = ch;
		lastItem.count++;
	}

	//добавить в конец строку ListString
	public void append(ListString listString) {
		StringItem lastItem = getLastItem();
		lastItem.next = listString.head;
	}

	//добавить в конец строку
	public void append(String string) {
		ListString listString = new ListString(string);
		this.append(listString);
	}

	//вставить в строку в позицию index строку
	public void insert(int index, String string) throws OwnIndexOutOfBoundsException {
		checkIndex(index);

		ListString listString = new ListString(string);
		listString.insert(index, string);
	}

	//TODO
	//вставить в позицию index ListString
	public void insert(int index, ListString string) throws OwnIndexOutOfBoundsException {
		checkIndex(index);


	}

	@Override
	public String toString() {
		StringBuilder text = new StringBuilder();
		StringItem current = head;
		while (true) {
			for (int i = 0; i < current.count; i++) {
				text.append(current.symbols[i]);
			}
			if (current.next != null) current = current.next;
			else break;
		}
		return text.toString();
	}
}
