// Create a class Dog with instance variables name, breed, age and color. 
// Define a parameterized constructor to initialize the instance variables.
 // Names of Parameters of the constructor must be same as the names of instance variables.
  // Maintain separate methods to return the breed, age, name and color of a Dog.

class a4{
 String name;
 String breed;
 String colour;
 int age;
 public a4(String name,String breed,String colour,int age)
 {
 this.name=name;
 this.breed=breed;
 this.colour=colour;
 this.age=age;
 }
 void getname(){
 System.out.println("Name: " +name);
 }
 void getbree(){
 System.out.println("Breed: " +breed);
 }
 
 void getage(){
 System.out.println("Age: " +age);
 }
 
 void getcolour(){
 System.out.println("Colour: " +colour);
 }
 public static void main(String[] args) {
 a4 dog=new a4("blacky","rottweiler","black",2);
 dog.getname();
 dog.getbree();
 dog.getage();
 dog.getcolour();

 }
}



// Name: blacky
// Breed: rottweiler
// Age: 2
// Colour: black