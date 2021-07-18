class calculate
{
	int m1,m2,m3,m4,m5;
    int total;
    float g;
    calculate(int m1 ,int m2, int m3, int m4, int m5)
    {
    	this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    	
     }
     int total(){
        total = this.m1 + this.m2 + this.m3 + this.m4 + this.m5;
        
       System.out.println("Total Marks : " + total);
       return total;
    }
    
    float total(int x)
    {
    	g=x/5;
        System.out.println("average: " + g);
        return g;
        
    }
    void total(float h)
    {
    	if(h > 90)
        {
        	System.out.println("Distinction ");
        }
        else if(h > 70 && h<90)
        {
        	System.out.println("First class");
        }
        else if(h > 50 && h<70)
        {
        	System.out.println("Second class");
        }
        else if(h > 35 && h<50)
        {
        	System.out.println("Third class");
        }
        else
        {
        	System.out.println("fail");
        }
    }
	
}
    
class main
{
	public static void main(String[] args)
	{
    
    	calculate cal = new calculate(200, 90, 90, 90, 10);
        int a = cal.total();
        float b = cal.total(a);
        cal.total(b);
        
  
	}
}
