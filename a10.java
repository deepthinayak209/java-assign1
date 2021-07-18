//	Perform method overloading by creating shape class for calculating area of any four shapes.

class shapes{
	double area;
	void area(float a, float b){
		area = a * b;
		System.out.println("Area of rectangle is : "+area);
	}
	void area(float r){
		area=3.142 * r * r;
		System.out.println("Area of circle is : "+area);
	}
	void area(int a){
		area = a * a;
		System.out.println("Area of square is : "+area);
	}
	void area(float a, float b, float h){
		area = ((a + b)/2)*h;
		System.out.println("Area of trapezium is : "+area);
	}
	
}
class ex10 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		shapes s = new shapes();
		s.area(5);
		s.area(6f);
		s.area(6.4f, 5f);
		s.area(6.5f,7.0f,5.0f);
	}

}


// Area of square is : 25.0
// Area of circle is : 113.112
// Area of rectangle is : 32.0
// Area of trapezium is : 33.75