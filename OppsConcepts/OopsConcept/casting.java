package OopsConcept;
	// Parent class
	class Parent {
	    String name = "GeeksforGeeks";
	    int id = 10;

	    void method(){
	        System.out.println("Method from Parent");
	    }
	}
	 
	// Child class
	class Child extends Parent {
	    int id=1;
	
	    @Override 
	    void method()
	    {
	        System.out.println("Method from Child");
	    }
	}
	
	public class casting {
	 
	// Demo class to see the difference between upcasting and downcasting
	    public static void main(String[] args)
	    {
	        // Upcasting
	        Parent p = new Child();
	        
	        System.out.println(p.name);
	        System.out.println(p.id);
	        //parent class method is overriden method hence this will be executed
	        p.method();
	 
	        // Trying to Downcasting Implicitly
	        // Child c = new Parent(); - > compile time error
	 
	        // Downcasting Explicitly
	        Child c = (Child)p;
	       // Child c = new Child();
	 
	        System.out.println(c.name);
	        System.out.println(c.id);
	        c.method();

	    }
	
}
