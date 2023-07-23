import java.util.Scanner;

public class MissingNumbers {
     public static void main(String[] args) {
        int n,i,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of elements in array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        int[] res=new int[50];;
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        if(arr[0]!=1) res[k++]=1;
        for(i=1;i<n;i++) {
            if(arr[i]-arr[i-1]!=1) {
                for(int j=arr[i-1]+1;j<arr[i];j++) 
                res[k++]=j;
            }
        }
        System.out.println("Missing Elements :");
        for(i=0;i<k;i++) {
            System.out.print(res[i]+" ");
        }
    }
}
