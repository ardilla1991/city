package by.htp.city.entity;


/*
 * Создать классы, спецификации которых приведены ниже. 
 * Определить конструкторы и методы setТип(), getТип(), toString(). 
 * Определить дополнительно методы в классе, создающем массив объектов. 
 * Задать критерий выбора данных и вывести эти данные на консоль. 
 * В каждом классе, обладающем информацией,должно быть объявлено несколько конструкторов.
 * 
 * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, 
 * Улица, Тип здания, Срок эксплуатации.
 * Создать массив объектов. Вывести:
 * a) список квартир, имеющих заданное число комнат;
 * b) список квартир, имеющих заданное число комнат и расположенных
 * на этаже, который находится в заданном промежутке;
 * c) список квартир, имеющих площадь, превосходящую заданную.
 */

public class House {
	
	private int number;
	private double square;
	private int floor;
	private int numberOfRooms;
	private String street;
	private String typeOfBuilding;
	private int termOfUsing;
	
	
	public House() {
		super();
	}
	
	public House(int number, double square, int floor, 
			int numberOfRooms, String street, 
			String typeOfBuilding, int termOfUsing ) {
		this.setNumber(number);	
		this.setSquare(square);
		this.setFloor(floor);
		this.setNumberOfRooms(numberOfRooms);
		this.setStreet(street);
		this.setTypeOfBuilding(typeOfBuilding);
		this.setTermOfUsing(termOfUsing);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTypeOfBuilding() {
		return typeOfBuilding;
	}

	public void setTypeOfBuilding(String typeOfBuilding) {
		this.typeOfBuilding = typeOfBuilding;
	}

	public int getTermOfUsing() {
		return termOfUsing;
	}

	@Override
	public String toString() {
		return "House [number=" + number + ", square=" + square + ", floor=" + floor + ", numberOfRooms="
				+ numberOfRooms + ", street=" + street + ", typeOfBuilding=" + typeOfBuilding + ", termOfUsing="
				+ termOfUsing + "]";
	}

	public void setTermOfUsing(int termOfUsing) {
		this.termOfUsing = termOfUsing;
	}
	
}
