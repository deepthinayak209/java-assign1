//	Create the following class to perform banking operations.
//Class Name: bank
//Data Members: cust_name,acc_no
//Methods:Deposit(),withdraw(double,double),display(float), Creat_acc()
//Initialize the data members of the given class with default and parameterized constructors. 


import java.util.Scanner;

class bank{
	String cust_name;
	int acc_no;
	float balance;
	bank(){	}
	bank(String cust_name, int acc_no, float balance){
		this.cust_name = cust_name;
		this.acc_no = acc_no;
		this.balance = balance;
	}
	void create_acc(){
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the customer name : ");
		cust_name = in.next();
		System.out.print("Enter the account number : ");
		acc_no = in.nextInt();
		System.out.print("Enter the balance : ");
		balance = in.nextFloat();
	}
	void deposit( float amt){
		balance += amt; 
		System.out.println("After deposit of "+amt+" balance is : "+balance);
	}
	void withdraw(double amt){
		balance -= amt;
		System.out.println("After withdrawal of "+amt+" balance is : "+balance);
	}
	void display(){
		System.out.println();
		System.out.println("Customer Name  : "+cust_name);
		System.out.println("Account Number : "+acc_no);
		System.out.println("Balance		: "+balance);
	}
}
public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b = new bank("deeksha",999111222,54678.5f);
		bank b1 = new bank();
		b.display();
		b.deposit(500f);
		b.withdraw(1000);
		
		b1.create_acc();
		b1.display();
		b1.withdraw(1500);
		b1.deposit(2500f);
	}

}
