import java.util.Scanner;

public class CumulativeMultiple {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        try {
        System.out.print("Enter Number of elements in array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array after Cumulative Multiple: ");
        System.out.print(arr[0]+" ");
        for(i=1;i<n;i++) {
            arr[i]=arr[i-1]*arr[i];
            System.out.print(arr[i]+" ");
        }
    }
    catch(Exception e) {
        System.out.println(e.getMessage());
    }
    }
}