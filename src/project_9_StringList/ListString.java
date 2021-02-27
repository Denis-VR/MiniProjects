package project_9_StringList;

public class ListString {

	class StringItem {
		private char[] symbols = new char[16];
		StringItem next;
		byte count;

	}

	private StringItem head = new StringItem();

	//длина строки
	public int length() {
		int len = 0;
		StringItem current = head;
		while (current.count != 0) {
			len += current.count;
			if (current.next != null)
				current = current.next;
			else break;
		}
		return len;
	}

	//Нахождение нужного StringItem-а. Этот метод используется в связке с getPosition
	public StringItem getItem(int index) {
		int sum = 0;
		StringItem current = head;
		while (sum < index) {
			sum += current.count;
			if (current.next != null) {
				current = current.next;
			} else break;
		}
		return current;
	}

	//метод находит нужный StringItem и возвращает индекс этого StringItem-а
	public int getPosition(int index) {
		int sum = 0;
		StringItem current = head;
		while (sum < index) {
			sum += current.count;
			current = current.next;
		}
		return index - sum;
	}

	//метод проверяет, есть ли в нашем ListString элемент с указанным индексом.
	public boolean checkIndex(int index) throws OwnIndexOutOfBoundsException {
		if (checkIndex(index)) throw new OwnIndexOutOfBoundsException();

		if (index > length()) return false;
		else return true;
	}

	//TODO: test it
	//символ в строке в позиции index
	public char charAt(int index) throws OwnIndexOutOfBoundsException {
		if (checkIndex(index)) throw new OwnIndexOutOfBoundsException();

		StringItem item = getItem(index);
		int position = getPosition(index);
		return item.symbols[position];
	}

	//TODO: test it
	public void setCharAt(int index, char ch) throws OwnIndexOutOfBoundsException {
		if (checkIndex(index)) throw new OwnIndexOutOfBoundsException();

		StringItem item = getItem(index);
		int position = getPosition(index);
		item.symbols[position] = ch;
	}

	//TODO
	//взятие подстроки, от start до end, не включая end
	public ListString substring(int start, int end) throws OwnIndexOutOfBoundsException {
		if (checkIndex(end)) throw new OwnIndexOutOfBoundsException();

		ListString s = new ListString();
		StringItem item = getItem(start);
		int startPosition = getPosition(start);
		//s.head =

		boolean isEnd = false;
		while (isEnd) {
			//TODO
		}

		return s;
	}

	//добавить в конец символ
	public void append(char ch) {
		StringItem currentItem = getItem(length());

		int i = currentItem.count;

		if (currentItem.count < 16) {
			currentItem.symbols[i] = ch;
			currentItem.count++;
		}
		else {
			currentItem.next = new StringItem();
			currentItem = currentItem.next;
			currentItem.symbols[0] = ch;
			currentItem.count++;
		}

	}

	//TODO
	//добавить в конец строку ListString
	public void append(ListString string) {
		StringItem lastItem = getItem(length());
		lastItem.next = string.head;
	}

	//TODO
	//добавить в конец строку String
	void append(String string) {

	}

	//TODO
	//вставить в строку в позицию index строку ListString
	void insert(int index, ListString string) {
		StringItem lastItem = getItem(length());
		int position = getPosition(index);


	}

	//TODO
	//вставить в строку в позицию index строку
	void insert(int index, String string) {

	}

	//переопределяем метод toString, чтобы при выводе объектов ListString
	// выводилась строка, которая в нем содержиться.
	@Override
	public String toString() {
		String text = "";
		StringItem current = head;
		while(true) {
			for (int i = 0; i < current.count; i++) {
				text += current.symbols[i];
			}
			if(current.next != null) current = current.next;
			else break;
		}

		return text;
	}
}
