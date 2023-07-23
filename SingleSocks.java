import java.util.Arrays;
import java.util.Scanner;

public class SingleSocks {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of elements in array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int c1=1,c2=0;
        for(i=1;i<n;i++) {
            if(arr[i-1]==arr[i]) c1++;
            else {
                if(c1%2!=0) 
                c2++;
                c1=1;
            }
        }
        if(c1%2!=0) 
            c2++;
        System.out.println("Total no.of Single socks : "+c2);
    }
}
