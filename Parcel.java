package paczuszkiWlasciwe;

public abstract class Parcel {
	
	private String code;
	private int weight;
	
	Parcel() {}
	
	Parcel(String code, int weight){
		setCode(code);
		setWeight(weight);
	}
	
	String getCode() {
		return code;
	}
	void setCode(String code) {
		if(!code.matches("^[A-Z]{3}-[\\d]{5}$"))
			throw new IllegalArgumentException("b³êdny kod paczki");
		else
			this.code = code;	
	}
	
	int getWeight() {
		return weight;
	}
	void setWeight(int weight) {
		this.weight = weight;
	}
}
