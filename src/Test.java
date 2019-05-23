import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        // Declare string name.
        String name = "Matthew";
        // Print string indices.
        for(int i = 0; i < name.length(); i++)
        {
            System.out.println(i + ": " + name.charAt(i));
        }
        // Print name from index 0 to index 4.
        System.out.println(name.substring(0, 4));
        // Create array of size 10.
        int[] array = new int[10];
        // Load array from 0 -9.
        for(int j = 0; j < array.length; j++)
        {
            array[j] = j;
        }
        // Input 22 at index 3.
        array[3] = 22;
        // Print array.
        for(int k = 0; k < array.length; k++)
        {
            System.out.println("Array Index [" + k + "] = " + array[k]);
        }
        // Create array list.
        List<Integer> arrayList = new ArrayList<>();
        // Load array list from 0 - 9.
        for(int l = 0; l < 10; l++)
        {
            // Add l value to array list.
            arrayList.add(l);
            // Print array list values.
            System.out.println(arrayList.get(l));
        }
    }
}
