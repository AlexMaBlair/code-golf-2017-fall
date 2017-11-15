package questions;

import java.io.*;
import java.util.*;

public class Question2 {

	public static void main(String[] args) throws IOException {
		String t = "a.txt";
		System.out.print(Question2.q2(t));
		
	}

	public static int q2(String t) throws IOException {
		ArrayList<String> q = new ArrayList<String>();
		Scanner s = new Scanner(new File(t));
		while (s.hasNext())
			q.add(s.nextLine());

		String a = q.get(0);
		int y = Integer.parseInt(a.substring(0,1));
		int x = Integer.parseInt(a.substring(2,3));
		int[][] b = new int[y][x];
		
		for (int i = 0; i < y; i++) 
			for (int j = 0; j < x; j++)
				b[y][x] = Integer.parseInt(q.get(i+1).substring(x*2,x*2+1));
			
		int c = 0;
		for (int i = 0; i < Integer.parseInt(q.get(y+2)); i++) 
			for (int j = Integer.parseInt(q.get(y+i+1).substring(0,1)); j < Integer.parseInt(q.get(y+i+1).substring(4,5)); j++) 
				for (int k = Integer.parseInt(q.get(y+i+1).substring(2,3)); k < Integer.parseInt(q.get(y+i+1).substring(6,7)); k++) 
					if (b[j][k] == 1)
						c++;
		return c;
	}
}
