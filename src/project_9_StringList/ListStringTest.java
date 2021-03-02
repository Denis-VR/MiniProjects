package project_9_StringList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListStringTest {
	public ListString listString;

	@Before
	public void setUp() {
		listString = new ListString();
	}

	@Test
	public void listString() {
		listString = new ListString("Hello, it's do amazing!");
		System.out.println(listString);
	}

	@Test
	public void lengthTest() {
		StringBuilder text = new StringBuilder();
		int expect = 7;
		for (int i = 0; i < expect; i++) {
			text.append("k");
		}
		listString = new ListString(text.toString());
		assertEquals(expect, listString.length());

		StringBuilder text2 = new StringBuilder();
		int expect2 = 46;
		for (int i = 0; i < expect2; i++) {
			text2.append("k");
		}
		listString = new ListString(text2.toString());
		assertEquals(expect2, listString.length());
	}

	@Test
	public void whenAppendWithCh() {
		for (int i = 0; i < 7; i++) {
			listString.append('e');
		}
		assertEquals(7, listString.length());
	}

	@Test
	public void whenAppendWitchManyCh() {
		for (int i = 0; i < 48; i++) {
			listString.append('d');
		}
		assertEquals(48, listString.length());
	}

	@Test
	public void testCharAt() throws OwnIndexOutOfBoundsException {
		for (int i = 0; i < 36; i++) {
			listString.append((char) (i + 57));
		}
		char in = (char) (57 + 3);
		assertEquals(in, listString.charAt(3));
		assertEquals((char) (57 + 27), listString.charAt(27));
	}

	@Test
	public void testSetCharAt() throws OwnIndexOutOfBoundsException {
		for (int i = 0; i < 24; i++) {
			listString.append((char) (i + 98));
		}
		listString.setCharAt(0, 'k');
		assertEquals('k', listString.charAt(0));

		listString.setCharAt(16, 'u');
		assertEquals('u', listString.charAt(16));

		listString.setCharAt(17, 's');
		assertEquals('s', listString.charAt(17));
	}

	@Test
	public void appendStringTest() throws OwnIndexOutOfBoundsException {
		for (int i = 0; i < 19; i++) {
			listString.append((char) (i + 79));
		}
		listString.append("What is it?");

		assertEquals('W', listString.charAt(19));
		assertEquals('?', listString.charAt(29));
	}

	@Test
	public void insertTest() throws OwnIndexOutOfBoundsException {
		for (int i = 0; i < 14; i++) {
			listString.append(String.valueOf(i%10));
		}
		assertEquals("01234567890123", listString.toString());

		listString.insert(5, "HELLO");
		assertEquals("01234HELLO567890123", listString.toString());

		ListString end = new ListString();
		end.append("FFF");
		listString.insert(15, end);
		assertEquals("01234HELLO56789FFF0123", listString.toString());
	}

	@Test
	public void newAppend() {
		ListString newListString = new ListString();
		for (int i = 0; i < 18; i++) {
			newListString.append(String.valueOf(i%10));
		}

		String text = "Hello, hello, hello";
		listString.append(text);
		listString.append(newListString);
		assertEquals((text + newListString.toString()), listString.toString());
	}
}