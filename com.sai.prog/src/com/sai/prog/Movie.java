package com.sai.prog;
public class Movie {
	public static void main(String[] args) {

		MovieTestDrive mtd = new MovieTestDrive();
		    System.out.println(mtd.title = "Dookudu");
	     	System.out.println(mtd.Description = "Comedy & action");
		    System.out.println(mtd.rating = 4.5f);
		MovieTestDrive mtd2 = new MovieTestDrive();
		    mtd2.title = "Pokiri";
		    mtd2.Description = "action";
		    mtd2.rating = 4.89f;
		MovieTestDrive mtd3 = new MovieTestDrive();
		    mtd3.Description = "svsc";
		    mtd3.Description = "Family";
		    mtd3.rating = 4;
		System.out.println(mtd);
		System.out.println(mtd2);
		System.out.println(mtd3);
		System.out.println("play the movie");
	}
}

class MovieTestDrive {
	String title;
	String Description;
	float rating;
}
