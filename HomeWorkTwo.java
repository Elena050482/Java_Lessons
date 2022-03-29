/**
* Java 1. Homework 2
*
* @ author Elena Zavarzina
* @ version 29.03.2022
*/
class HomeWorkTwo {
    
    public static void main(String[] args) {
	    System.out.println(checkSum(5, 0));	
	    System.out.println(checkSum(5, 7));
	    System.out.println(checkSum(5, 18));
	    
		positiveOrNegative(8);
		
		System.out.println(isNegative(-8));
		System.out.println(isNegative(8));
		
		printStringTimes("Test", 3);
	}
		
	static boolean checkSum(int a, int b) {
		return (10 <= a + b) && (a + b <= 20);
	}
	
	static void positiveOrNegative(int a) {
		System.out.println(a >=0? "Positive" : "Negative");
	}
	
	static boolean isNegative(int a) {
		return a<0;
	}
	
	static void printStringTimes(String word, int times) {
		for (int i = 0; i < times; i++) {
		    System.out.println(word);
        }
    }
} 	
	
	
