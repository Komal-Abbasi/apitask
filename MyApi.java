/*
 * Copyright (c) Komal Abbasi. All rights reserved.
 * MUET. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * Portions Copyright 14SW07. All Rights Reserved.
 */


import java.io.*;
import java.util.*;

/**
 * Immutable objects which describe certain rules for inserting and deleting, such as those
 * implemented by the basic mathematical operators.
 *
 * <p>The base-independent settings are:
 * <ol>
 * <li>{@code precision}:
 * the number of basic operations for such are
 *
 * @see     fabionicci,prime
 * @author  Komal Abbasi (14SW07)
 * @since 1.5
 */

public final class MyApi{
	/*
	*Fabionicci
	* initializing variables which will be used for storing values
	* initializing methods which will be used for this class
	*/

	public static String fabionicci(int a){
		String s="";
		int n,first=0,second=1,next,i;
		for(i=0;i<a;i++)
		{
			if(i<=1)
			s+=i+"  "
			;
			else
			{next=first+second;
			first=second;
			second=next;

			s+=next+"  ";

		}}

		return s;

}
// PRIME


	public static String prime(int a){
		String ppp="";
	for(int i=2;i<=a;i++){
	for(int j=2;j<=i;j++)
	if(i%j==0)
	if(i==j){
	ppp+=i+"is the prime num\n";
	}
	else
	break;
	}
	return ppp;
}

}