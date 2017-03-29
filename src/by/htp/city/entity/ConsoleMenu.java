package by.htp.city.entity;

import java.util.Scanner;

public class ConsoleMenu {
	
	private static String[] menu = new String[5];
	private City object;
	
	public ConsoleMenu(City city) {
		menu[0] = "0. Exit";
		menu[1] = "1. View list";
		menu[2] = "2. Print list with defined rooms count ";
		menu[3] = "3. Print list with defined rooms count and with defined floors interval ";
		menu[4] = "4. Print list with squary > defined";
		this.object = city;
	}
	
	public void index() {
		printMenu();
		
		Scanner inString = new Scanner(System.in);
		CheckInput checkInput = new CheckInput();
		int menuId = this.scanMenuPoint(inString, checkInput);
		
		if ( menuId > 0 && menuId <= menu.length) {
			startAction(menuId);
		} else {
			System.out.println("Buy.");
			inString.close();
		}
	}
	
	private int scanMenuPoint(Scanner inString, CheckInput checkInput) {
		String menuId = inString.nextLine();
		System.out.println("Selected point is " + menuId);
		int menuIdInt = 0;

		menuIdInt = checkInput.checkNumber(menuId) 
				  ? Integer.valueOf(menuId) 
				  : -1;
		
		return menuIdInt;
	}
	
	private void printMenu() {
		System.out.println("Choose a point of menu");
		for ( int i = 0; i < menu.length; i++ ) {
			System.out.println(menu[i]);
		}
	}
	
	private void startAction(int menuId) {
		switch (menuId) {
		case 1:
			object.printList();
			break;
		case 2:
			System.out.print("Enter number of rooms: ");
			int room = getInt();
			object.printRecords(object.findHousesByRoomsNumbers(room));
			break;
		case 3:
			System.out.print("Enter number of rooms: ");
			int room1 = getInt();
			System.out.print("Enter floor from: ");
			int floorFrom = getInt();
			System.out.print("Enter floor to: ");
			int floorTo = getInt();
			object.printRecords(object.findHousesByRoomsNamberAndByFloorInterval(room1, floorFrom, floorTo));
			break;
		case 4:
			System.out.print("Enter square ");
			object.printRecords(object.findHousesBySquare(getDouble()));
			break;
		default:
			break;
		}
		index();
	}
	
	private int getInt() {
		Scanner inInt = new Scanner(System.in);
		int number = inInt.nextInt();
		System.out.println();
		
		return number;
	}
	
	private double getDouble() {
		Scanner inDouble = new Scanner(System.in);
		double number = inDouble.nextDouble();
		System.out.println();
		
		return number;
	}
	
}