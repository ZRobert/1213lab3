//Robert Payne
//L02
//5/24/2012
class Television
{
	public static void main(String[] args)
	{
		System.out.println("1:Send money quick!"); //To Mom!
		System.out.println("2:Send money quick!// To Mom!");
		//To Mom! System.out.println("3:Send money quick!");
		System.out.println("4:Send money quick!" //To Mom!);
		
	}
}
/*
Step 2: Compiled without error. Output the two strings on seperate lines.

Step 3: The compiler returned the following error: Television.java:8: package 
system does not exist. The "8" in the error message corresponds to the line
number.

Step 4: The compiler returned the following error: Television.java:8: ';' expected.

Step 5: The compiler returned the following error: Television.java:10: reached end
of file while parsing. It points out a closing brace.

Step 6: The compiler is able to compile the program, but returns with an error when
trying to execute. The error reads: java.lang.NoSuchMethodError: main.
////////////////////////////////////////////////////////////////////////////////////////
Exercise 2
////////////////////////////////////////////////////////////////////////////////////////
Step 1: Instead of printing each system out on a seperate line, it prints them both
on the same line.

Step 2: The output is the same as the original output, being different from the previous
output because that one printed both system.out on the same line.

Step 3: The '\n' inserts a return between the previous character and the proceeding
character. The difference from the other system.out statements with the '\n' at the end
is that these ones are in the middle of the string, showing how you can have a return
without ending your system.out statement and doing another on the next line.
///////////////////////////////////////////////////////////////////////////////////////
Exercise 3
///////////////////////////////////////////////////////////////////////////////////////
Step 1. Three compile errors because of the " " in the middle of the string.
Step 3. The '\i' adds an indent to the string output and the '\"' bypasses the compiler
interperting the qoutations as the start/end of a string.
///////////////////////////////////////////////////////////////////////////////////////
Exercise 4
///////////////////////////////////////////////////////////////////////////////////////
Step 2. The comments should not be inside or just before a statement(on the same line).
But comments can exist after the semicolon.
*/
