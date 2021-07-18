// Write a java program to demonstrate Widening Casting and Narrowing Casting.

class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 10;
	    double mydouble = 10.78;
	    
	    double myDouble = myInt; 
	    System.out.println(myInt);      
	    System.out.println(myDouble);
	    
	    int myint = (int) myDouble; 
	    System.out.println(mydouble);   
	    System.out.println(myint);
	}

}

// 10
// 10.0
// 10.78
// 10

