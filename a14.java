//Write method overriding program for calculating the salary of different types of employee
// in a bank class.

class bank1{
	float basic, pf, da, hra, net, gross,it;
	bank1(float basic){
		this.basic = basic;
	}
	void sal(){
		da =(float) ( 0.3 * basic);
		hra = (float)(0.2 * basic);
		pf = (float)(0.5 * basic);
		it = (float)(0.1 * basic);
		gross = basic + da + hra;
		net = gross - pf - it;
		System.out.println("salary is : "+ net);
		
	}
}

class employee extends bank1{
	employee(float basic){
		super(basic);
	}
	void sal(){
		da =(float) ( 0.4 * basic);
		hra = (float)(0.3 * basic);
		pf = (float)(0.4 * basic);
		it = (float)(0.1 * basic);
		gross = basic + da + hra;
		net = gross - pf - it;
		System.out.println("salary is : "+ net);
	}
	
}
 class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee(2000);
		bank1 e1 = new bank1(20000);
		e.sal();
		e1.sal();
	}

}


// salary is : 2400.0
// salary is : 18000.0
