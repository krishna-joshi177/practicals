import java.util.Scanner;


public class floyd{
    public static void main(String[] args) {
        int i, j, k=1;
        Scanner input=new Scanner(System.in);
        System.out.print("enter no of rows - "); 
        int n=input.nextInt();

        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {   System.out.print(k);
                System.out.print(" ");
                k++;
            }
            System.out.println();
        }
        
    }
}