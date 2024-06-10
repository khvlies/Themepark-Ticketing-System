public class Ticket
{
    protected String id;
    protected String rides;
    protected String date;
    protected int qty;
    protected char type;
    protected Customer cust;
    
    //default constructor
    public Ticket()
    {
        id = null;
        rides = null;
        date = null;
        qty = 0;
        cust = new Customer();
    }
    
    //normal constructor
    public Ticket(String i, String r, String d, int q, char t, Customer c)
    {
        id = i;
        rides = r;
        date = d;
        qty = q;
        type = t;
        cust = c;
    }
    
    //mutator
    public void setTicket(String i, String r, String d, int q, char t, Customer c)
    {
        id = i;
        rides = r;
        date = d;
        qty = q;
        type = t;
        cust = c;
    }
    
    public void setId(String i)
    {
        id = i;
    }
    public void setRides(String r)
    {
        rides = r;
    }
    public void setDate(String d)
    {
        date = d;
    }
    public void setType(char t)
    {
        type = t;
    }
    public void setCustomer(Customer c)
    {
        cust = c;
    }
    
    //accessor
    public String getId()
    {
        return id;
    }
    public String getRides()
    {
        return rides;
    }
    public String getDate()
    {
        return date;
    }
    public Customer getCust()
    {
        return cust;
    }
    public int getQty()
    {
        return qty;
    }
    public char getType()
    {
        return type;
    }
    
    //toString method
    public String toString()
    {
        return("ID:"+ id +"\nRides:"+ rides +"\nDate:"+ date + "\nType of ticket" + type +"\nCustomer Info:" + cust.toString());
    }
    
    //processor
    public double calculateTypeTicket()
    {
        double total = 0.0;
        if(type == 'E' || type == 'e')
            total = 150*qty;
        else if(type == 'S' || type == 's')
            total = 100*qty;
        return total;
    }
}