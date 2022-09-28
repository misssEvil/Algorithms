import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------Lesson 1---------------------------------");

        int [] arr = new int[] {4, 8, -1,5, 2, -3, 0};
        int [] arrS = new int[] {5, 7, -2, 14, 1, 6, 0};

        System.out.println("Unsorted array: " + Arrays.toString(arr));
        System.out.println("Sorted array (bubble, asc)" + Arrays.toString(lesson1.BubbleSortAcs(arr)));
        System.out.println("Sorted array (bubble, desc)" + Arrays.toString(lesson1.BubbleSortDesc(arr)));
        System.out.println();

        System.out.println("Array for simple search: " + Arrays.toString(arr));
        System.out.println("Index of value 4 is " + lesson1.Search(arr, 4));
        System.out.println("Index of value 8 is " + lesson1.Search(arr, 8));
        System.out.println("Index of value 11 is " + lesson1.Search(arr, 11));
        System.out.println("Index of value -1 is " + lesson1.Search(arr, -1));
        System.out.println("Index of value -9 is " + lesson1.Search(arr, -9));
        System.out.println();

        System.out.println("Array for binary search: " + Arrays.toString(lesson1.BubbleSortAcs(arrS)));
        System.out.println("Index of value 0 is " + lesson1.BinarySearch(arrS, 0));
        System.out.println("Index of value -2 is " + lesson1.BinarySearch(arrS, -2));
        System.out.println("Index of value -3 is " + lesson1.BinarySearch(arrS, -3));
        System.out.println("Index of value 7 is " + lesson1.BinarySearch(arrS, 7));
        System.out.println("Index of value 14 is " + lesson1.BinarySearch(arrS, 14));
        System.out.println("Index of value 15 is " + lesson1.BinarySearch(arrS, 15));
    }
}
