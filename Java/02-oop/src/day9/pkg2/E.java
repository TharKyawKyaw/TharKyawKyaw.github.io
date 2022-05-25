package day9.pkg2;

import day9.pkg1.A;

public class E extends A{
	
	void test() {
//		A obj = new A();
//		obj.empId = 1001;
		E obj = new E();
		obj.empId = 105;	// different but inherits
		obj.name ="Sai Sai";
		
		A obj1 = new A();
		obj1.name = "Su Su";
	}
}
