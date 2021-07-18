// Execute the above program by creating the Lamp objects inside the Lamp class itself

class lamp 
{
 	boolean isOn;
 	void turnOn() 
 	{
 		isOn=true;
 		System.out.println("Light is on? "+isOn);
 	}
 	void turnOff() 
 	{
 		isOn=false;
 		System.out.println("Light on? "+isOn);
 	}
 	public static void main(String[] args) 
 	{
 		lamp led=new lamp();
 		lamp halogen=new lamp();
 		led.turnOn();
		halogen.turnOff();
 	}
} 


// Light is on? true
// Light on? false