import java.util.Scanner;

public class binarysearch 
{
    public static void main(String[] args) {
        
        int i,j,mid,elem;

        Scanner sc=new Scanner(System.in);

        int[] A={1,2,3,4,5,6,7,8,9,10};
        

        System.out.println(" THE ELEMENTS:-");

        for(i=0;i<10;i++)
        {
            // A[i]=sc.nextInt();
            System.out.print(A[i] +"  ");

        }

        System.out.println("\nENTER THE ELEMENT FOR SEARCHING:-");
        elem=sc.nextInt();

        i=0;
        j=10-1;
        int flag=0;

        while (i<=j) 
        {
            mid=i+(j-i)/2;

            if(A[mid]==elem)
            {
                System.out.println("YOUR ELEMENT "+elem+" FOUND AT "+(mid+1)+" POSITION..\nELEMENT FOUND...");
                flag=1;
                break;
            }
            else if(elem<A[mid])
            {
                j=mid-1;

            }else
            {
                i=mid+1;
            }
            
        }
            if(flag==0)
            System.out.println("PLEASE ENTER THE ELEMENT IN THE LIST");

        sc.close();
    }
    
}
