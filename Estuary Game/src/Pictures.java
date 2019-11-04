
public enum Pictures {

    BAG("bag"), BOTTLE("bottle"), CRAB("crab"), MUSSEL("mussel"), OYSTER("oyster"), RECYCLEBOX("recyclebox"), SCALLOP("scallop"), SCUBADIVER("scubadiver"), SEAWEEDROCK("seaweedrock"), STRIPEDBASS("stripedbass"), TRASH("trash"), TURTLE("turtle");

	private String name = null;
	
	private Pictures(String s){
		name = s;
	}
	
	public String getName() {
		return name;
	}
};
