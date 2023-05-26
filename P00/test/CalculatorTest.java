import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// fail("Not yet implemented");
		// Arrange
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();

		// Act
		int actual = cal.add(a, b);

		// Assert
		int expected = 9999;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		// fail("Not yet implemented");
		// Arrange
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.subtract(a, b);
		
		// Assert
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testMultiple() {
		// fail("Not yet implemented");
		// Arrange
		int a = 2;
		int b = 3;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.multiple(a,b);
		
		// Assert
		int expected = 6;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testDivide() {
		// fail("Not yet implemented");
		// Arrange
		int a = 10;
		int b = 2;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.divide(a,b);
		
		// Assert
		int expected = 5;
		assertEquals(actual, expected);
	}
	
}
