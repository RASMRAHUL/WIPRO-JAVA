import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("enter the size of the array: ");
        int size = scanner.nextInt();
        
        
        int[] arr = new int[size];
        
        
        
        for (int i = 0; i < size; i++) {
            System.out.print("enter element at " + i + " index : " );
            arr[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> evenArray = new ArrayList<>();
        ArrayList<Integer> oddArray = new ArrayList<>();
        for(int i = 0 ;i< size; i++)
        {
            if(i%2 == 0)
                evenArray.add(arr[i]);
            else    
                oddArray.add(arr[i]);
        }

        Collections.sort(evenArray);
        Collections.sort(oddArray);

        
        System.out.print("Sorted even array : ");
        for (int i = 0; i < evenArray.size(); i++) {
            System.out.print(evenArray.get(i) + " ");
        }
        System.out.println();
        System.out.print("Sorted odd array : ");
        for (int i = 0; i < oddArray.size(); i++) {
            System.out.print(oddArray.get(i) + " ");
        }
        System.out.println();

        System.out.println("Output : " + (evenArray.get(evenArray.size()-2) + oddArray.get(oddArray.size()-2) ));
        
        scanner.close();
    }
}
