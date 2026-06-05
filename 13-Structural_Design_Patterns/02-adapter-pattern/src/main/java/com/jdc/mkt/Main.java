package com.jdc.mkt;

public class Main {

	public static void main(String[] args) {
		DcPowerSource dc = new DcPowerSource();
		dc.plugin();
		
		AcPowerSource ac = new Adapter(dc);
		ac.plugin();
	}
}

interface AcPowerSource{
	void plugin();
}
class Adapter implements AcPowerSource{
	private DcPowerSource plug;
	
	public Adapter(DcPowerSource plug) {
		super();
		this.plug = plug;
	}

	@Override
	public void plugin() {
		plug.plugin();
	}	
}

class DcPowerSource{
	void plugin() {
		System.out.println("Plugin in to 5v dc power source.");
	}
}
