package by.htp.city.entity;

public class City {
	
	private String name;
	private House houses[] = new House[0];
	
	public City(String name) {
		super();
		this.name = name;
	}
	
	public void addHouse(House house){
		this.houses = this.addRecord(this.houses, house);
	}
	
	public House[] findHousesByRoomsNumbers(int numberOfRooms) {
		House[] foundedHouses = new House[]{};
		for ( int i = 0; i < houses.length; i++ ) {
			if ( houses[i].getNumberOfRooms() == numberOfRooms ) {
				foundedHouses = this.addRecord(foundedHouses, houses[i]);
			}
		}
		
		return foundedHouses;
	}
	
	public House[] findHousesBySquare(double square) {
		House[] foundedHouses = new House[]{};
		for ( int i = 0; i < houses.length; i++ ) {
			if ( houses[i].getSquare() > square ) {
				foundedHouses = this.addRecord(foundedHouses, houses[i]);
			}
		}
		
		return foundedHouses;
	}
	
	public House[] findHousesByRoomsNamberAndByFloorInterval(int numberOfRooms, 
			int floorFrom, int floorTo) {
		House[] foundedHouses = new House[]{};
		for ( int i = 0; i < houses.length; i++ ) {
			if ( houses[i].getNumberOfRooms() == numberOfRooms 
					&& houses[i].getFloor() >= floorFrom && houses[i].getFloor() <= floorTo) {
				foundedHouses = this.addRecord(foundedHouses, houses[i]);
			}
		}
		
		return foundedHouses;
	}
	
	public void printList() {
		for ( int i = 0; i < houses.length; i++ ) {
			printInformationAboutHouse(houses[i]);
			//houses[i].toString();
		}
	}
	
	private void printInformationAboutHouse(House house) {
		/*System.out.print("Street: " + house.getStreet() + "; Number: " + house.getNumber() + "; " 
				+ "; Floor: " + house.getFloor() + "; Square: " + house.getSquare()
				+ "; RoomsNumber: " + house.getNumberOfRooms() 
				+ "; building type: " + house.getTypeOfBuilding());
				
				System.out.println();
		*/
		
		/* or use toString() */
		System.out.println(house);
	}
	
	private House[] addRecord(House[] coppiedArray, House elem) {
		House[] serv = new House[coppiedArray.length + 1];
		for (int i = 0; i < coppiedArray.length; i++){
			serv[i] = coppiedArray[i];
		}
		serv[coppiedArray.length] = elem;
		
		return serv;
	}
	
	public void printRecords(House[] houses) {
		for ( int i = 0; i < houses.length; i++ ) {
			printInformationAboutHouse(houses[i]);
			//houses[i].toString();
		}
	}

}
