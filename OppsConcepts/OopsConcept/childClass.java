package OopsConcept;

public class childClass extends ParentClass{
	
	int i =20;
	String name = "Anush";
	
	@Override
	public void engine() {
		System.out.println("Engine performance is Improved");
	}
	
	@Override
	public void bodycolor() {
		System.out.println("Body colour is " + colour);
	}
	
	public void Brand() {
		System.out.println("Having Best brand");
	}
	
	@Override
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
		
		super.getName();
	}

	public static void main(String[] args) {

		childClass cc = new childClass();
		ParentClass cp = new childClass();
		
		cc.getName();
		
		System.out.println(cc.i);
		System.out.println(cp.i);
		
		System.out.println(cc.name);
		System.out.println(cp.name);
		
		cc.engine();
		cp.engine();
		
		cc.bodycolor();
		cp.bodycolor();
		
		cc.Brand();
		//cp.Brand();  Not possible as object reference is from parent class
		
		cp.wheels();
		cc.wheels();

	}

}
