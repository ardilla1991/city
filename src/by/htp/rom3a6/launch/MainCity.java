package by.htp.rom3a6.launch;

import by.htp.rom3a6.entity.*;

public class MainCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		House house1 = new House(10, 50.5, 2, 3, "Oktyabrskaya", "panelniy", 30);
		House house2 = new House(56, 5.5, 1, 2, "Pushkina", "kirpichniy", 30);
		House house3 = new House(34, 5.5, 3, 1, "Gogolya", "panelniy", 30);
		House house4 = new House(22, 5.5, 5, 3, "Prititskogo", "kirpichniy", 30);
		House house5 = new House(78, 5.5, 2, 2, "Kolvariyskaya", "kirpichniy", 30);
		House house6 = new House(45, 5.5, 5, 1, "Lenina", "panelniy", 30);
		House house7 = new House(33, 5.5, 10, 2, "Kirova", "kirpichniy", 30);
		House house8 = new House(22, 5.5, 8, 3, "Pobedi", "panelniy", 30);
		House house9 = new House(54, 5.5, 9, 2, "Oktyabrskay", "panelniy", 30);
		House house10 = new House(12, 5.5, 4, 3, "Glibki", "panelniy", 30);
		
		City city = new City("Minsk");
		city.addHouse(house1);
		city.addHouse(house2);
		city.addHouse(house3);
		city.addHouse(house4);
		city.addHouse(house5);
		city.addHouse(house6);
		city.addHouse(house7);
		city.addHouse(house8);
		city.addHouse(house9);
		city.addHouse(house10);
		
		ConsoleMenu consoleMenu = new ConsoleMenu(city);
		consoleMenu.index();
		
	}

}
