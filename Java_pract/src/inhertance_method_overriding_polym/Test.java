package inhertance_method_overriding_polym;

public class Test {
	
	static public void main(String...strings) {  
		
		
		Bike_child bike = new Bike_child();
		bike.speedometer();
		bike.autostart();
		
		bike.wheels();
		
		bike.dualExhaustSystem();
		
		
		
		Two_wheeler_father parent = new Two_wheeler_father();
		
		parent.dualExhaustSystem();
		parent.wheels();
		
		Two_wheeler_father parent1 = new Bike_child() ;// dynamic(runtime ) polymorphism: when child object is referred by parent class variable/ top casting
		parent1.wheels();
		
		Bike_child child1 = (Bike_child)new Two_wheeler_father(); //When parent object is refered by child class reference variable// down casting
		child1.wheels();
		child1.twostrokeEngine();
	
		Moterbike_Grandparent grandparent = new Moterbike_Grandparent();
		grandparent.kickstart();
		grandparent.taillights();
	
	}
}
