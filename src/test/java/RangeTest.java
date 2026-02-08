import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeTest {
	
	/**
	 * Contains all the tests for the {@link Range#range(int)} function.
	 */
	@Nested class SingleParamTests {
		
		/**
		 * Tests that a negative input doesn't throw an {@link Exception} and just returns an empty array.
		 */
		@Test void testNegativeInput() { assertArrayEquals(new int[0], Range.range(-1)); }
		
		/**
		 * Tests that an input of 0 returns an empty array.
		 */
		@Test void testZero() { assertEquals(new int[0], Range.range(0)); }
		
		/**
		 * Tests that a positive input returns an array structured as expected.
		 */
		@Test void testPositiveStop() { assertArrayEquals(new int[]{1, 2, 3}, Range.range(3)); }
	}
	
	/**
	 * Tests the {@link Range#range(int, int)} function.
	 */
	@Nested class TwoParamTests {
		
		/**
		 * Tests that an empty array is returned when start > stop.
		 */
		@Test void testStartGreaterThanStop() {
			final var start = 3;
			assertArrayEquals(new int[0], Range.range(start, start + 1));
		}
		
		/**
		 * Tests that an empty array is returned when stop == start;
		 */
		@Test void testZero() {
			final var startAndStop = 3;
			assertArrayEquals(new int[0], Range.range(startAndStop, startAndStop));
		}
		
		/**
		 * Tests that a positive input returns an array structured as expected.
		 */
		@Test void testPositiveStop() { assertArrayEquals(new int[]{3, 4, 5, 6, 7}, Range.range(3, 7)); }
	}
	
	/**
	 * Tests the {@link Range#range(int, int, int)} function.
	 */
	@Nested class ThreeParamsTests {
		
		/**
		 * Tests that the
		 */
		@Test void testSteppedRange() { assertArrayEquals(new int[]{1, 3, 5, 7}, Range.range(1, 7, 2)); }
	}
}