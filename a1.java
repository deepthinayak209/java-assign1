// Create a class named Lamp with an instance variable isOn and two methods turnOn() 
// and turnoff(). Inside the main class, create two objects led and halogen of the Lamp class. 
// Write the suitable code to turnOn and turnoff the lamps and display True if the Lamp is
 // turned on and False if the lamp is turned off.
class lamp {
 boolean isOn;
 void turnOn() {
 isOn=true;
 System.out.println("Light is on? "+isOn);
 }
 void turnOff() {
 isOn=false;
 System.out.println("Light on? "+isOn);
 }

}
class a1{
 public static void main(String[] args) {
 lamp led=new lamp();
 lamp halogen=new lamp();
 led.turnOn();
 halogen.turnOff();

 }
} 


// Light is on? true
// Light on? false