import java.util.Scanner;

public class Java_Subarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum=0,c=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]<0)c+=1;
        }
        for(int i=0;i<n;i++){
            sum=a[i];
            for(int j=i+1;j<n;j++){
                sum+=a[j];
                if(sum<0)c+=1;
            }
            
        }
        System.out.println(c);
    }
}
