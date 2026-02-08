import java.util.stream.IntStream;

/**
 * A simple class to (kind-of) mimic the functionality of Python's built-in range function.
 *
 * @author Jon Mrowczynski
 */
public class Range {
	
	/**
	 * Returns an {@code int} array containing numbers from 0 to {@code stop} exclusive. If {@code stop} is < 0,
	 * then an empty array is returned.
	 *
	 * @param stop the last value in the array.
	 * @return an {@code int} array containing the numbers from 0 to {@code stop} exclusive or an empty array.
	 * @see Range#range(int, int)
	 */
	public static int[] range(final int stop) { return range(0, stop, 1); }
	
	/**
	 * Returns an {@code int} array containing numbers from {@code start} to {@code stop} exclusive in increments of
	 * {@code step} If {@code stop} < {@code start}, or if {@code stop} < {@code start + step} then an empty array is
	 * returned.
	 *
	 * @param start the initial value in the array.
	 * @param stop  the last value in the array.
	 * @param step  the difference between each adjacent elements in the returned array.
	 * @return an {@code int} array containing the numbers from {@code start} to {@code stop} in increments of
	 * {@code step} or an empty array.
	 */
	public static int[] range(final int start, final int stop, final int step) {
		return IntStream.iterate(start, i -> i < stop, i -> i + 1).toArray();
	}
	
	/**
	 * Returns an {@code int} array containing numbers from {@code start} to {@code stop} exclusive. If {@code stop} <
	 * {@code start}, then an empty array is returned.
	 *
	 * @param start the initial value in the array.
	 * @param stop  the last value in the array.
	 * @return an {@code int} array containing the numbers from {@code start} to {@code stop} or an empty array.
	 * @see Range#range(int, int, int)
	 */
	public static int[] range(final int start, final int stop) { return range(start, stop, 1); }
}