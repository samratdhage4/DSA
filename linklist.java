class node
{
    int x;
    node next;
    node(int x)
    {
        this.x=x;
        next=null;
    }
}





public class linklist 
{
      node head;


    void insert(int x)
    {

        node n1=new node( x);

        if(head==null)
        {
            head=n1;
        }else
        {
            node n=head;

            while (n.next!=null) 
            {
                n=n.next;
                
            }
            n.next=n1;

        }
    }



    void in_beg(int x)
    {
        node n1=new node(x);

        n1.next=head;
        head=n1;

    }

    void in_end(int x)
    {
        node n1=new node(x);

        if(head==null)
        {
            head=n1;

        }

        else
        {
            node h=head;   

            while (h.next!=null) 
            {
                h=h.next;
                
            }

            h.next=n1;
        }
    }



    void insert_At_Index(int x,int index)
    {
        node n1=new node(x);

        node h=head;

        int y=0;

        while(y!=index)
        {
            y++;
            h=h.next;
            
        }

        n1.next=h.next;
        h.next=n1;


    }


    void display()
    {
        if(head==null)
        {
            System.out.print("LIST IS EMPTY...");

        }
        else
        {

            node n1=head;
            while (n1!=null) 
            {

                System.out.print(n1.x+" -> ");
                n1=n1.next;
                
            }
        }
    }



    public static void main(String args[])
    {
            linklist a=new linklist();

            a.insert(0);
            a.insert(10);
            a.insert(20);


            a.insert_At_Index(23, 1);

            a.display();


    }
    




}