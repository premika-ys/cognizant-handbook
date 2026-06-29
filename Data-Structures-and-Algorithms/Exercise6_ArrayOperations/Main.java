// package Data-Structures-and-Algorithms.Exercise6_ArrayOperations;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int size = 5;

        // Traversal
        System.out.println("Original Array:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insertion
        arr[size] = 60;
        size++;

        System.out.println("\n\nAfter Insertion:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Deletion (Delete 30)
        int deleteValue = 30;
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == deleteValue) {
                index = i;
                break;
            }
        }

        if (index != -1) {

            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            size--;
        }

        System.out.println("\n\nAfter Deletion:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        // Searching
        int search = 40;
        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("\n\n40 Found");
        else
            System.out.println("\n\n40 Not Found");
    }
}
