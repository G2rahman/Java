


package Dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;





@Component	
public class Pizza{
	
	
	private String pbrand;
	private int ppie;
	private int pprice;
	
	
	@Autowired
	private Junkfood junkfood;
	
	
	
	
	public Pizza() {
		
	}
	@Autowired
	public Pizza (Junkfood junkfood) {
		this.junkfood=junkfood;
	}
	public void junkfoodinfo() {
		junkfood.display();
	}
	
	public String getpbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public int getPpie() {
		return ppie;
	}

	public void setPpie(int ppie) {
		this.ppie = ppie;
	}

	public int getPprice() {
		return pprice;
	}
	public void setPrice(int pprice) {
		this.pprice=pprice;
	}

	@Autowired
	public void setJunkfood(Junkfood junkfood) {
		this.junkfood = junkfood;
	}
}
