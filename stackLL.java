class node
{
    int data;
    node top;
   
    node(int data)
    {
        this.data=data;
        top=null;
    }
}
public class stackLL 
{
    node head;

    void push(int x)
    {
        node n1=new node(x);

        if(head==null)
        {
            head=n1;
        }
        else
        {
            node h=head;
            while(h.top!=null)
            {
                h=h.top;
            }
            h.top=n1;
        }
    }
    
    

    public static void main(String args[])
    {
        

    } 

}