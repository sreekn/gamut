package com.gamutkart;

public class App 
{
    public static void main( String[] args )
    {
		int i;
// testing continuous buids in Jenkins for every 5 minuts
//added for trsting github hook
	    for(i=0;i<=40;i++)
		{
			i += 3;
        	System.out.println( "print number: " + i);
   		}
	 }
}
