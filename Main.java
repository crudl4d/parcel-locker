package paczuszkiWlasciwe;

public class Main {
	public static void main(String[] args) {
		try {
			Parcel p = new ParcelA("AAZ-12345", 25);
			Parcel p1 = new ParcelB("ACZ-11545", 50);
			Parcel p2 = new ParcelA("BAZ-13245", 25);
			p1.setWeight(123);
			ParcelLocker pl = new ParcelLocker();
			pl.addParcel(p);
			pl.addParcel(p1);
			pl.addParcel(p2);
			pl.deleteParcel("AAZ-12345");
			pl.listParcels();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
