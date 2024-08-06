package tt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
		String name = "eat";
		String name2 = "eat1";
		
		if(name2.contains(name)) {
			
		}
		char [] carr = new char[name2.length()];
		carr = name2.toCharArray();
		for(int i=0;i<carr.length;i++) {
			char c = carr[i];
			String t = String.valueOf(c);
			if(name.contains(t)) {
			//if(c==name2.charAt(i)) {
				System.out.println("True");
				
			}
		}

	}
  
}
 class test{
static boolean isjolly(int a[], int n) 
{ 
	// Boolean vector to diffSet set of differences. 
	// The vector is initialized as false. 
	boolean []diffSet = new boolean[n]; 

	// Traverse all array elements 
	for (int i = 0; i < n - 1 ; i++) 
	{ 
		// Find absolute difference 
		// between current two 
		int d = Math.abs(a[i] - a[i + 1]); 

		// If difference is out of range or repeated, 
		// return false. 
		if (d == 0 || d > n - 1 || 
			diffSet[d] == true) 
			return false; 

		// Set presence of d in set. 
		diffSet[d] = true; 
	} 
	return true; 
	
	
	
	
	
} 
 }

