import java.util.Scanner;

public class bubblesort {
    
    public static void main(String args[])
    {
        int i,j;


        Scanner sc = new Scanner(System.in);


        int[] A = new int[10];


        System.out.println("ENTER THE 10 RANDOM ELEMENTS:-\n");

        for(i=0;i<10;i++)
        {
            A[i]=sc.nextInt();
        }

        System.out.print("\nARRAY BEFORE SORTING:- ");

        for(i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }




        System.out.println("\n.....................BUBBLE SORT..................\n");


        for(i=0;i<10;i++)
        {
            for(j=0;j<10-i-1;j++)
            {

                if(A[j]>A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }





        for(i=0;i<10;i++)
        {
            System.out.println(A[i]+"  ");
        }
        sc.close();
    }
}
