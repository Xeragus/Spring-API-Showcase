package io.bobz.springbootquickstart.club;

public class Club {
	
	private int id;
	private String name;
	private int year;
	private String manager;
	
	public Club() {

	}
	
	public Club(int id, String name, int year, String manager) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.manager = manager;
	}

	public String getManager() {
		return manager;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFormattedName() {
		return name.toLowerCase().replace(' ', '-');
	}
	
	public int getYear() {
		return year;
	}
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getId() {
		return Integer.toString(id);
	}
	
}
