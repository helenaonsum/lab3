import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedinPlace2() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {3, 2, 1}, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }
}

  // // Returns a *new* array with all the elements of the input array in reversed
  // // order
  // static int[] reversed(int[] arr) {
  //   int[] newArray = new int[arr.length];
  //   for(int i = 0; i < arr.length; i += 1) {
  //     arr[i] = newArray[arr.length - i - 1];
  //   }
  //   return arr;
  // }
