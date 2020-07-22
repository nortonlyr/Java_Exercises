package blueJ_ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting(); 
		int output = test.countA("alphabet"); // there are two "a" in the alphabet word
		assertEquals(2, output);
	}

}
