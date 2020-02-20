package com.dilip.oops;


public class OverloadingExample {
	public static void main(String[] args) {
		//case -1
		/*Test2 t=new Test2();
		t.m1(10);
		t.m1(10.5f);
		
		t.m1('a');
		t.m1(1l);*/
		//1.m1(10.5) dauble is not there error
		
	/*
	 * byte-short-int -long-float -dabule-
	 * 
	 * char-int -long -float-dauble
	 */
		
	//case-2
		Test3 t1=new Test3();
		t1.m1(new Object());//ojec tversion
		t1.m1("dilip");//string vrsion
		t1.m1(null);//valid for string and object --  first go to child and then parent
	
		
		//case-3 */
		/*Test4 t4=new Test4();
		StringBuffer sf=new StringBuffer();
		t4.m1(sf);
		t4.m1("dilip");
		t4.m4(null) *///The method m4(null) is undefined for the type Test4
		
		/*Test5 t5=new Test5();
		t5.m1(3.4f, 22);
		t5.m1(3, 22f);*/
		
		//t5.m1(10,10); it will no work
		/*Test6 t6=new Test6();
		t6.m1();
		t6.m1(1,0);
		t6.m1(10);*/
	}
}

class Test2 {
	public void m1(int i) {
		System.out.println("int arg method");
	}

	public void m1(float i) {
		System.out.println("float arg method");
	}
}
/*Test3 t1=new Test3();
t1.m1(new Object());
t1.m1("dilip");
t1.m1(null);*/
class Test3{
	public void m1(String s) {
		System.out.println("string arg method");
	}

	public void m1(Object object) {
		System.out.println("object arg method");
	}
}

class Test4{
	public void m1(String s) {
		System.out.println("string arg method");
	}

	public void m1(StringBuffer object) {
		System.out.println("object arg method");
	}
}

class Test5{
	public void m1(int i,float f) {
		System.out.println("string arg method");
	}

	public void m1(float f,int i) {
		System.out.println("object arg method");
	}
}
class Test6{
	public void m1(int i) {
		System.out.println("string arg method");
	}

	public void m1(int ...x) {
		System.out.println("object arg method");
	}
}


