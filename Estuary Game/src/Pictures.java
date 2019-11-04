
public enum Pictures {

    SCUBA("scuba"), TURTLE("turtle"), BASS("bass"), CRAB("crab"), BAG("bag"), JELLY("jelly"), OYSTER("oyster"), MUSSEL("mussel");

	private String name = null;
	
	private Pictures(String s){
		name = s;
	}
	
	public String getName() {
		return name;
	}
};
