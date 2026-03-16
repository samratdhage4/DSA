import java.util.Scanner;

class Linearsearch
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int[] A=new int[10];
        int i;

        System.out.println("ENTER THE ARRAY ELEMENTS:-");

        for(i=0;i<10;i++)
        {
            A[i]=sc.nextInt();
        }

  

        System.out.println("ENTER THE SEARCHING ELEMENT:-");
        int elem=sc.nextInt();
        int flag=0;

        for(i=0;i<10;i++)
        {
            if(elem==A[i])
            {
                System.out.println("THE ELEMTN "+elem+" IS FOUND AT "+(i+1)+" POSITION");
             flag=1;
            }


        }


            if(flag==0)
           System.out.println("ENETER THE ELEMENT IN THE LISTS.....");
            

        sc.close();
        
    }
}