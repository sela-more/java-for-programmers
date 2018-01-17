package AmbiguityInterfaceVsInterface;

public interface I3 extends I1 {
	default public void f2(){
		System.out.println("f2 from I3");
	}
}
