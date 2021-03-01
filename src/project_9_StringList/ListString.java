package project_9_StringList;

public class ListString {
	private StringItem head = new StringItem();

	private static class StringItem {
		private final char[] symbols = new char[16];
		private StringItem next;
		private byte count;

	}

	//длина строки
	public int length() {
		int len = 0;
		StringItem currentItem = head;
		while (currentItem.count != 0) {
			len += currentItem.count;
			if (currentItem.next != null)
				currentItem = currentItem.next;
			else break;
		}
		return len;
	}

	//Нахождение нужного StringItem-а. При необходимости (когда index кратен 16)
	// создается новый StringItem.
	private StringItem getItem(int index) {
		StringItem currentItem = head;
		int numberStringItem = index / 16;
		for (int i = 0; i < numberStringItem; i++) {
			if (currentItem.next == null) {
				currentItem.next = new StringItem();
			}
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

		StringItem lastItem = getItem(index);
		int lastPosition = index % 16;
		return lastItem.symbols[lastPosition];
	}

	//замена символа в позиции index на символ ch
	public void setCharAt(int index, char ch) throws OwnIndexOutOfBoundsException {
		checkIndex(index);

		StringItem lastItem = getItem(index);
		int lastPosition = index % 16;
		lastItem.symbols[lastPosition] = ch;
	}

	//взятие подстроки, от start до end, не включая end
	public ListString substring(int start, int end) throws OwnIndexOutOfBoundsException {
		checkIndex(end);

		ListString result = new ListString();
		String ourListString = this.toString();
		result.append(ourListString.substring(start, end));

		return result;
	}

	//добавить в конец символ
	public void append(char ch) {
		StringItem lastItem = getItem(length());
		int lastChar = lastItem.count;
		lastItem.symbols[lastChar] = ch;
		lastItem.count++;
	}

	//добавить в конец строку String
	public void append(String string) {
		char[] ourString = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			this.append(ourString[i]);
		}
	}

	//добавить в конец строку ListString
	public void append(ListString listString) {
		String string = listString.toString();
		this.append(string);
	}

	//вставить в строку в позицию index строку
	public void insert(int index, String string) throws OwnIndexOutOfBoundsException {
		checkIndex(index);

		ListString startListString;
		if (index == 0) { //если вставляем в начало
			startListString = new ListString();
			startListString.append(string);
			startListString.append(this); //добавляем наш прошлый ListString в конец
		} else {
			startListString = this.substring(0, index);
			startListString.append(string);
			startListString.append(this.substring(index, this.length()));
		}

		head = startListString.head; //меняем голову
	}

	//вставить в позицию index строку ListString
	public void insert(int index, ListString string) throws OwnIndexOutOfBoundsException {
		checkIndex(index);

		String listStringButString = string.toString();
		this.insert(index, listStringButString);
	}

	//переопределяем метод toString, чтобы при выводе объектов ListString
	// выводилась строка, которая в нем содержится.
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
