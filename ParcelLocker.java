package paczuszkiWlasciwe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParcelLocker {
	private List<Parcel> parcels = new ArrayList<Parcel>();
	int lockerCapacity = 10;
	
	void addParcel(Parcel p) {
		if (p == null)
			throw new IllegalArgumentException("Nieprawid³owy nr paczki");
		else if(parcels.size() == lockerCapacity)
			throw new IllegalArgumentException("za du¿o paczek");
		else
			parcels.add(p);
	}
	void listParcels(){
		for(Parcel p: parcels) {
			System.out.println(p.getCode());
		}
	}
	void deleteAllParcels() {
		parcels.clear();
	}
	void deleteParcel(String code) {
		Iterator<Parcel> it = parcels.iterator();
		while(it.hasNext()) {
			String itCode = it.next().getCode();
			if(itCode.equals(code)) {
				it.remove();
				break;
			}
			if(!it.hasNext())
				throw new IllegalArgumentException("paczka o podanym kodzie nie istnieje");			
		}
	}
}
