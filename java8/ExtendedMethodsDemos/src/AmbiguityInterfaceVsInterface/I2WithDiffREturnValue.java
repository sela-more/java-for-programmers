package AmbiguityInterfaceVsInterface;

public interface I2WithDiffREturnValue {
	default public String f2(){
		return ("f2 from I2WithDiffREturnValue");
	}

}
public class Inheriter implements I2, I2WithDiffREturnValue {
	
}