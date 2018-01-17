package AmbiguityInterfaceVsInterface;

public interface I1 {
	
	default public void f1(){
		System.out.println("f1 from I1");
	}

	default public void f2(){
		System.out.println("f2 from I1");
	}


}
