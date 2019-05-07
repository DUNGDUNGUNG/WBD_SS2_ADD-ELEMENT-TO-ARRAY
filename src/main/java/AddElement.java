import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 4, 6, 7, 8, 0};

        System.out.println("Array element list: ");
        for (int i : arr) {
            System.out.print(  i + "\t");
        }

        System.out.println("\n Enter the location to insert : ");
        int index = scanner.nextInt();

        System.out.println("Enter the number to insert : ");
        int x = scanner.nextInt();

        int i = arr.length - 1;
        while (i > index) {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[index]=x;

        System.out.println("Array element list after insert : ");
        for (int k: arr){
            System.out.print(k + "\t");
        }

    }
}
