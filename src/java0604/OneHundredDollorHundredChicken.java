package java0604;

public class OneHundredDollorHundredChicken {
	
	public static void main(String[] args) {
		int MONEY = 100, SUMCHICKENS = 100;
		int maleChicken = 0, femaleChicken = 0, springer = 0;
		for (maleChicken = 0; maleChicken <= SUMCHICKENS; maleChicken++) {
			for (femaleChicken = 0; femaleChicken <= SUMCHICKENS - maleChicken; femaleChicken++) {
				springer = SUMCHICKENS - maleChicken - femaleChicken;
				if ( maleChicken * 5 + femaleChicken * 3 + springer/3 == MONEY && springer%3 == 0) {
					System.out.println("¹«¼¦:" + maleChicken + ", Ä¸¼¦:" + femaleChicken + ", Ð¡¼¦:" + springer);
				}
			}
		}
		
	}
}
