package nonprimitivecasting;
// this explains about child class extends father class for up casting
public class childclass extends Fatherclass   {
	public static void Chinese() {
		System.out.println("famouus chinise food is Peking Roasted Duck1234");
}
	public void Thai() {
		System.out.println("Typical thai food is Som Tum123");
	}
	public static void Vintagefashion() {
		System.out.println("old style of clothing123");
	} 
	public  void Casualfashion() {
		System.out.println("comfertable123");
	}
	//two methods created within child class of its own
	public static void Herohfdelux() {
		System.out.println("price low");
	}
	public static void french() {
		System.out.println("Traditional french food is Crepes Suzatte123");
	}
	
	public void RoyalEnfield() {
		System.out.println("price high");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fatherclass obj = new childclass();
Chinese();  //override static method  from father Class
Vintagefashion();// override static method from mother class
Herohfdelux();  // **static method from child class can be call in up casting**
obj.Thai();    // non static method override from father class 
obj.Casualfashion(); // non static method override from

// down casting
childclass obj1= (childclass)obj;
french();//static method from Father class
Chicfashion();//static method from mother class
obj1.RoyalEnfield();// non static method from child class
}
}


