//	Write a program to demonstrate the uses of this reference.

class A1{
	int x=100;
	A1(){
		System.out.println("Hello deepthi");
	}
	A1(int x){
		this();
		System.out.println(this.x);
		System.out.println(x);
	}
}
class a12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1(50);
	}

}


// Hello deepthi
// 100
// 50

