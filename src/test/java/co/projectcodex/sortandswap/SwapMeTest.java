package co.projectcodex.sortandswap;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static co.projectcodex.sortandswap.SwapMe.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SwapMeTest {


    @Test
    @Order(1)
    public void swapFirstWithSecondShouldWork() {

        String[] testSetOne = {"pear", "apple", "mango", "banana"};
        String[] testSetTwo = {"blue", "yellow", "orange", "red"};

        String[] testResultsOne = swapFirstWithSecond(testSetOne);

        assertEquals("apple", testResultsOne[0]);
        assertEquals("pear", testResultsOne[1]);

        String[] testResultsTwo = swapFirstWithSecond(testSetTwo);

        assertEquals("yellow", testResultsTwo[0]);
        assertEquals("blue", testResultsTwo[1]);

    }

    @Test()
    @Order(2)
    public void swapFirstWithLastShouldWork() {

        String[] testSetOne = {"pear", "apple", "mango", "banana"};

        String[] testResultsOne = swapFirstWithLast(testSetOne);

        assertEquals("banana", testResultsOne[0]);
        assertEquals("pear", testResultsOne[testResultsOne.length - 1]);

        String[] testSetTwo = {"blue", "yellow", "orange", "red"};

        String[] testResultsTwo = swapFirstWithLast(testSetTwo);

        assertEquals("red", testResultsTwo[0]);
        assertEquals("blue", testResultsTwo[testResultsOne.length - 1]);

    }

    @Test
    @Order(3)
    public void swapNeighboursShouldWork() {

        int [] testSetOne = {5, 19, 7, 17, 6, 1, 3};
        int [] testResultsOne = swapNeighbours(testSetOne);
        assertArrayEquals(new int[] {5,7, 17, 6, 1, 3, 19}, testResultsOne);

        int[] testSetTwo = {89, 3, 21, 7, 12, 8 };
        int [] testResultsTwo = swapNeighbours(testSetTwo);
        assertArrayEquals(new int[] {3, 21, 7, 12, 8, 89}, testResultsTwo);


    }

    @Test
    @Order(4)
    public void sortListShouldWork() {

        int[] testSetOne = {5, 19, 7, 17, 6, 1, 3};
        int[] testResultsOne = sortList(testSetOne);
        assertArrayEquals(new int[]{1, 3, 5, 6, 7, 17, 19}, testResultsOne);

        int[] testSetTwo = {89, 3, 21, 7, 12, 8};
        int[] testResultsTwo = sortList(testSetTwo);
        assertArrayEquals(new int[]{3, 7, 8, 12, 21, 89}, testResultsTwo);


    }

    @Test
    @Order(5)
    public void selectionSortTestShouldWork() {

        int[] testSetOne = {5, 19, 7, 17, 6, 1, 3};
        int[] testResultsOne = selectionSort(testSetOne);
        assertArrayEquals(new int[]{1, 3, 5, 6, 7, 17, 19}, testResultsOne);

        int[] testSetTwo = {89, 3, 21, 7, 12, 8};
        int[] testResultsTwo = selectionSort(testSetTwo);
        assertArrayEquals(new int[]{3, 7, 8, 12, 21, 89}, testResultsTwo);


    }

}
