package by.htp.rom3a6.entity;

public class CheckInput {
	
	public boolean checkNumber(String str) {
		boolean res = false;
		
		if (str.matches("[-]{0,1}\\d"))
			return true;
		
		return res;
	}
}
