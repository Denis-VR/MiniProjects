package project_9_StringList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListStringTest {
	public ListString listString;

	@Before
	public void setUp() throws Exception {
		listString = new ListString();
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
//			char ch = listString.charAt(i);
//			System.out.println("#" + i + " - " + ch);
		}
		assertTrue((char) (57 + 3) == listString.charAt(3));
		assertTrue((char) (57 + 27) == listString.charAt(27));
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
	public void insetrTest() throws OwnIndexOutOfBoundsException {
		for (int i = 0; i < 14; i++) {
			listString.append(String.valueOf(i%10));
		}
		assertTrue(listString.toString().equals("01234567890123"));

		listString.insert(5, "HELLO");
		assertTrue(listString.toString().equals("01234HELLO567890123"));

		ListString end = new ListString();
		end.append("FFF");
		listString.insert(15, end);
		assertTrue(listString.toString().equals("01234HELLO56789FFF0123"));

	}
}