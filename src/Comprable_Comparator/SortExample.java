package Comprable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {

  ArrayList <Integer> marks= new ArrayList<Integer>();
  marks.add(95);
  marks.add(65);
  marks.add(78);
  System.out.println(marks);
  Collections.sort(marks);
  System.out.println(marks);
  

	}

}
