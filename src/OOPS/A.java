package OOPS;



class A{
	public static void main(String[] args) {
		C c=new C();
		c.show();
	}
}
class Aa {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A {
    void show() {
        System.out.println("Class C");
    }
}

class D extends B, C{
	void show() {
		System.out.println("Class D");
	}
}

// What if:
// class D extends B, C { }  // ❌ Not allowed

