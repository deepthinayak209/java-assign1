 // Write a program to demonstrate constructor chaining.

 class ex9
{
    ex9()
    {
        this(5);
        System.out.println("The Default constructor");
    }
  
    ex9(int x)
    {
        this(5, 15);
        System.out.println(x);
    }
  
    ex9(int x, int y)
    {
        System.out.println(x * y);
    }
  
    public static void main(String args[])
    {
    	new ex9();
        //new ex9(10,10);
    }
}


// 75
// 5
// The Default constructor
// 100
