abstract class Bank{
	abstract void getBalance();
}

class A extends Bank{
	int amount;
	A(int amt){
		this.amount = amt;
	}
	void getBalance(){
		System.out.println("Balance in bank A is $: " + amount);
	}
}

class B extends Bank{
	int amount;
	B(int amt){
		this.amount = amt;
	}
	void getBalance(){
		System.out.println("Balance in bank B is $: " + amount);
	}
}

class C extends Bank{
	int amount;
	C(int amt){
		this.amount = amt;
	}
	void getBalance(){
		System.out.println("Balance in bank C is $: " + amount);
	}
}

class Main {
	public static void main(String args[]) {
		A obj1 = new A(100);
		B obj2 = new B(150);
		C obj3 = new C(200);
		obj1.getBalance();
		obj2.getBalance();
		obj3.getBalance();
	}
}