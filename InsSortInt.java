import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InsSortInt
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();

        try
        {
            File obj = new File("randInts.txt");
            Scanner sc = new Scanner(obj);
            while (sc.hasNextInt())
            {
                nums.add(sc.nextInt());
            }
            sc.close();
            insertionSort(nums);
            System.out.println("Smallest element: " + nums.get(0));
            System.out.println("Biggest element: " + nums.get(nums.size() - 1));

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public static void insertionSort(ArrayList<Integer> list)
    {
        for (int i = 1; i < list.size(); i++)
        {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key)
            {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
