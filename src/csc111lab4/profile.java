package csc111lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class profile {
	public static void main(String[]args) {
		File file = new File("quprofile.txt");
		Scanner fileInput = null;
		try {
			
			fileInput = new Scanner(file); 
		} catch (FileNotFoundException e) {
			System.out.println("Unable to load file!"); 
			e.printStackTrace(); 
			System.exit(1);
		}
		String line1 = fileInput.nextLine(); 
		String line2 = fileInput.nextLine(); 
		String line3 = fileInput.nextLine(); 
		String line4 = fileInput.nextLine(); 
		String line5 = fileInput.nextLine(); 
		String c = "";
		String b = "";
		
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		while(x == 0) {
			
			System.out.println("View Profile");
			System.out.println("Edit Profile");
			System.out.println("Save and Quit");
			String a = scan.nextLine();
			if (a.equalsIgnoreCase("View profile")) {
				
				System.out.println(line1);
				System.out.println(line2);
				System.out.println(line3);
				System.out.println(line4);
				System.out.println(line5);
				
				
			}
			else if (a.equalsIgnoreCase("edit profile")) {
				System.out.println("what would you like to edit?");
				System.out.println("first name");
				System.out.println("last name");
				System.out.println("email");
				System.out.println("major");
				System.out.println("date of birth");
				b = scan.nextLine();
				if(b.equalsIgnoreCase("first name")) {
					System.out.println("what would you like change?");
					c = scan.nextLine();
					line1 = c; 
				}
				else if(b.equalsIgnoreCase("laast name")) {
					System.out.println("what would you like change?");
					c = scan.nextLine();
					line2 = c;
				}
				else if(b.equalsIgnoreCase("email")) {
					System.out.println("what would you like change?");
					c = scan.nextLine();
					line3 = c;
				}
				else if(b.equalsIgnoreCase("major")) {
					System.out.println("what would you like change?");
					c = scan.nextLine();
					line4 = c;
				}
				else if(b.equalsIgnoreCase("date of birth")) {
					System.out.println("what would you like change?");
					c = scan.nextLine();
					line5 = c;
				}
				else {
					System.out.println("your choice is invalid");
				}
				
				
				
			}
			else if (a.equalsIgnoreCase("save and quit")) {
				x +=1;
				try {
					PrintWriter printWriter = new PrintWriter(file);
					printWriter.write(line1);
					printWriter.write("\n" + line2);
					printWriter.write("\n" + line3);
					printWriter.write("\n" + line4);
					printWriter.write("\n" + line5);
						
					printWriter.close();
					}
					
				catch (IOException e) {
					e.printStackTrace();
				}
				
				
			}
			else {
				System.out.println("your choice is invalid");
			}
				
				
		}
		
	}

}

/*
 * package csc111lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class profile {
	public static void main(String[]args) {
		File file = new File("quprofile.txt");
		Scanner fileInput = null;
		try {
			
			fileInput = new Scanner(file); 
		} catch (FileNotFoundException e) {
			System.out.println("Unable to load file!"); 
			e.printStackTrace(); 
			System.exit(1);
		}
		String line1 = fileInput.nextLine(); 
		String line2 = fileInput.nextLine(); 
		String line3 = fileInput.nextLine(); 
		String line4 = fileInput.nextLine(); 
		String line5 = fileInput.nextLine(); 
		String c = "";
		String b = "";
		
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		while(x == 0) {
			
			System.out.println("View Profile");
			System.out.println("Edit Profile");
			System.out.println("Save and Quit");
			String a = scan.nextLine();
			if (a.equalsIgnoreCase("View profile")) {
				
				System.out.println(line1);
				System.out.println(line2);
				System.out.println(line3);
				System.out.println(line4);
				System.out.println(line5);
				
				
			}
			else if (a.equalsIgnoreCase("edit profile")) {
				System.out.println("what would you like to edit?");
				System.out.println("first name");
				System.out.println("last name");
				System.out.println("email");
				System.out.println("major");
				System.out.println("date of birth");
				b = scan.nextLine();
				System.out.println("what would you like change?");
				c = scan.nextLine();
				
				
				
			}
			else if (a.equalsIgnoreCase("save and quit")) {
				x +=1;
				try {
					PrintWriter printWriter = new PrintWriter(file);
					if(b.equalsIgnoreCase("first name")) {
						
						printWriter.write("\n" + c);
						printWriter.write("\n" + line2);
						printWriter.write("\n" + line3);
						printWriter.write("\n" + line4);
						printWriter.write("\n" + line5);
						
						printWriter.close();
						
					}
					else if (b.equalsIgnoreCase("last name")) {
						printWriter.write(line1);
						printWriter.write("\n" + c);
						printWriter.write("\n" + line3);
						printWriter.write("\n" + line4);
						printWriter.write("\n" + line5);
						
						printWriter.close();
					}
					else if (b.equalsIgnoreCase("email")) {
						printWriter.write(line1);
						printWriter.write("\n" + line2);
						printWriter.write("\n" + c);
						printWriter.write("\n" + line4);
						printWriter.write("\n" + line5);
						printWriter.close();
					}
					else if (b.equalsIgnoreCase("major")) {
						printWriter.write(line1);
						printWriter.write("\n" + line2);
						printWriter.write("\n" + line3);
						printWriter.write("\n" + c);
						printWriter.write("\n" + line5);
						printWriter.close();
					}
					else if (b.equalsIgnoreCase("date of birth")) {
						printWriter.write(line1);
						printWriter.write("\n" + line2);
						printWriter.write("\n" + line3);
						printWriter.write("\n" + line4);
						printWriter.write("\n" + c);
						printWriter.close();
					}
					
					
					//printWriter.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			}
			else {
				System.out.println("your choice is invalid");
			}
				
				
		}
		
	}

}



 */
