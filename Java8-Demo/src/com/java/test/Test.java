package com.java.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

public class Test implements Cloneable{

	public static void main(String args[]) {
		
		Collection myCollection;
		
	String str1 = "asadsd";
	String str2 = "dsf23432";
	String str3 = "bnngfnhn";
	
	String str4 = str1+str2+str3;
	//System.out.println(str4.toString());
	StringBuilder build = new StringBuilder();
	build.append(str1).append(str2).append(str3);
	System.out.println(build);
	int day = 5;
    String dayString;
    myCollection = new ArrayList<>();
    String str = "vcvxcv";
    myCollection.add(str);
    
    // switch statement with int data type
    switch (day) 
    {
        case 1:  dayString = "Monday";
                 break;
        case 2:  dayString = "Tuesday";
                 break;
        case 3:  dayString = "Wednesday";
                 break;
        case 4:  dayString = "Thursday";
                 break;
        case 5:  dayString = "Friday";
                 break;
        case 6:  dayString = "Saturday";
                 break;
        case 7:  dayString = "Sunday";
                 break;
        default: dayString = "Invalid day";
                 break;
    }
    System.out.println(dayString);
	 
	}
}
