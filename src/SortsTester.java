import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortsTester {
    private static final Sorts s = new Sorts<>();
    private ArrayList<Integer> a;
    private ArrayList<String> b;
    private ArrayList<Integer> c = new ArrayList<>();

    @Before
    public void init(){
        a = new ArrayList<>(Arrays.asList(79, 32, 56, 7, 23532, 4, 7, 9));
        b = new ArrayList<>(Arrays.asList("Banana", "Apple", "Watermelon", "Pineapple", "Peach",
                "Passionfruit", "Tomatoes"));
        for (int i = 1000;i>=0;i--){
            c.add(i);
        }
    }

    @Test
    public void insertionSort() {
        ArrayList<Integer> sorted_a = new ArrayList<Integer>(Arrays.asList(79, 32, 4, 7, 7, 56,
                23532, 9));
        s.InsertionSort(a, 2, 6);
        assertEquals(sorted_a, a);
        ArrayList<String> sorted_b = new ArrayList<>(Arrays.asList("Apple", "Banana",
                "Passionfruit", "Peach", "Pineapple", "Tomatoes", "Watermelon"));
        s.InsertionSort(b, 0, b.size() - 1);
        assertEquals(sorted_b, b);
        ArrayList<Integer> sorted_c = new ArrayList<>();
        for (int i = 0;i<=1000;i++){
            sorted_c.add(i);
        }
        s.InsertionSort(c, 0, c.size() - 1);
        assertEquals(sorted_c,c);
    }

    @Test
    public void mergeSort() {
        ArrayList<Integer> sorted_a = new ArrayList<Integer>(Arrays.asList(79, 32, 4, 7, 7, 56,
                23532, 9));
        s.MergeSort(a, 2, 6);
        assertEquals(sorted_a, a);
        ArrayList<String> sorted_b = new ArrayList<>(Arrays.asList("Apple", "Banana",
                "Passionfruit", "Peach", "Pineapple", "Tomatoes", "Watermelon"));
        s.MergeSort(b, 0, b.size() - 1);
        assertEquals(sorted_b, b);
        ArrayList<Integer> sorted_c = new ArrayList<>();
        for (int i = 0;i<=1000;i++){
            sorted_c.add(i);
        }
        s.MergeSort(c, 0, c.size() - 1);
        assertEquals(sorted_c,c);
    }

    @Test
    public void quickSort() {
        ArrayList<Integer> sorted_a = new ArrayList<Integer>(Arrays.asList(79, 32, 4, 7, 7, 56,
                23532, 9));
        s.QuickSort(a, 2, 6);
        assertEquals(sorted_a, a);
        ArrayList<String> sorted_b = new ArrayList<>(Arrays.asList("Apple", "Banana",
                "Passionfruit", "Peach", "Pineapple", "Tomatoes", "Watermelon"));
        s.QuickSort(b, 0, b.size() - 1);
        assertEquals(sorted_b, b);
        ArrayList<Integer> sorted_c = new ArrayList<>();
        for (int i = 0;i<=1000;i++){
            sorted_c.add(i);
        }
        s.QuickSort(c, 0, c.size() - 1);
        assertEquals(sorted_c,c);
    }

    @Test
    public void modified_QuickSort() {
        ArrayList<Integer> sorted_a = new ArrayList<Integer>(Arrays.asList(79, 32, 4, 7, 7, 56,
                23532, 9));
        s.Modified_QuickSort(a, 2, 6, 3);
        assertEquals(sorted_a, a);
        ArrayList<String> sorted_b = new ArrayList<>(Arrays.asList("Apple", "Banana",
                "Passionfruit", "Peach", "Pineapple", "Tomatoes", "Watermelon"));
        s.Modified_QuickSort(b, 0, b.size() - 1, 3);
        assertEquals(sorted_b, b);
        ArrayList<Integer> sorted_c = new ArrayList<>();
        for (int i = 0;i<=1000;i++){
            sorted_c.add(i);
        }
        s.Modified_QuickSort(c, 0, c.size() - 1, 10);
        assertEquals(sorted_c,c);
    }

    @Test
    public void cocktailSort() {
        ArrayList<Integer> sorted_a = new ArrayList<Integer>(Arrays.asList(79, 32, 4, 7, 7, 56,
                23532, 9));
        s.cocktailSort(a, 2, 6);
        assertEquals(sorted_a, a);
        ArrayList<String> sorted_b = new ArrayList<>(Arrays.asList("Apple", "Banana",
                "Passionfruit", "Peach", "Pineapple", "Tomatoes", "Watermelon"));
        s.cocktailSort(b, 0, b.size() - 1);
        assertEquals(sorted_b, b);
        ArrayList<Integer> sorted_c = new ArrayList<>();
        for (int i = 0;i<=1000;i++){
            sorted_c.add(i);
        }
        s.cocktailSort(c, 0, c.size() - 1);
        assertEquals(sorted_c,c);
    }
}