


package Dependencyinjection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;






@Component

@Scope(value="prototype")
public class Junkfood {



	private String fbrand;
	private String funit;
	private int fprice;
	
	
	
	
	
	public Junkfood() {
		
	}

	public String getFbrand() {
		return fbrand;
	}
	public void setFbrand(String fbrand) {
		this.fbrand = fbrand;
	}
	public String getFunit() {
		return funit;
	}
	public void setFunit(String funit) {
		this.funit = funit;
	}
	public int getFPrice() {
		return fprice;
	}
	public void setPrice(int fprice) {
		this.fprice = fprice;
	
	}
	public void display() {System.out.println("Junkfood brand:" + fbrand + ", Unit:" + funit +",  Price:" + fprice + "");
}
}
