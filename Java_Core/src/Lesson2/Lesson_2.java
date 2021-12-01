package Lesson2;

import java.util.Arrays;

public class Lesson_2 {

	public static void main(String[] args) {
		
      byte a = 1;
	  short b = 2;
      int c = 3;
	  long d = 4;
	  float e = 5.1f;
	  double i = 6.1;
	  char f = 'f';
	  String t = "hello";
	  boolean w = true;
		  
	  System.out.println("Мінімальне значення = " + (Byte)a + ", Максимальне значення = " + (Double)i );
	  System.out.println();
		  
		int[] number = new int[10];
		for (int z = 0; z < number.length; z++) {
		     number[z] = (int) (Math.random() * 10) + 1;
		  }
		    int small = number[0];
		    int big = number[0];

		  for (int z = 0; z < number.length; z++) {
		      if (number[z] < small) {
		          small = number[z];
		      }else if (number[z] > big) {
		              big = number[z];
      }
	  }
		  
		  System.out.println("Найменше число масиву - " + small);
		  System.out.println("Найбільше число масиву - " + big);
		  System.out.println();
		  System.out.println(" Варіант відповіді №2:");
		  System.out.println("Мінімальне значення: " + Arrays.stream(number).min());
		  System.out.println("Максимальне значення: " + Arrays.stream(number).max());
	}
}
