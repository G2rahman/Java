package Dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;








@Component
public class Chips {
	private String cbrand;
	private String cflavor;
	private int cprice;
	
	
	@Autowired	
	private Junkfood junkfood;
	
	
	
	public Chips() {
		
	}

	public String getCbrand() {
		return cbrand;
	}

	public void setCbrand(String cbrand) {
		this.cbrand = cbrand;
	}

	
	public String getCflavor() {
		return cflavor;
	}

	public void setCflavor(String cflavor) {
		this.cflavor = cflavor;
	}

	public int getCprice() {
		return cprice;
	}

	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public Junkfood getJunkfood() {
		return junkfood;
	}
		
	@Autowired
	public void setJunkfood(Junkfood junkfood) {
		this.junkfood=junkfood;
	}
}
