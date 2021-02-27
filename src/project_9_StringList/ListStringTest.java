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
	public void getItem() {
		ListString.StringItem listString1 = listString.getItem(48);

	}
}