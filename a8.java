//Create a base class Bicycle with public instance variables gear and speed. 
//Initialize the instance variables using a parameterized constructor.
// Maintain a method applyBreak() to slowdown the bicycle speed by the argument passed as a parameter. 
//A method speedUp() must increase the speed of a bicycle by the argument passed as a parameter.
// Whenever the bicycle gains its speed gear should increase automatically and when the bicycle 
// slows down, gear should decrement automatically. 

class Bicycle{
	public 
		int gear;
		int speed;
	Bicycle(int gear, int speed){
		this.gear=gear;
		this.speed=speed;
	}
	void applyBreak(int speed){
		this.speed -= speed;
		this.gear--;
	}
	void speedUp(int speed){
		this.speed += speed;
		this.gear++;
	}
	void display(){
		System.out.println("Speed is : "+speed);
		System.out.println("Gear  is : "+gear);		
	}
}
class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle b = new Bicycle(3,45);
		b.display();
		b.speedUp(50);
		b.display();
		b.applyBreak(15);
		b.display();
	}

}


// Speed is : 45
// Gear  is : 3
// Speed is : 95
// Gear  is : 4
// Speed is : 80
// Gear  is : 3