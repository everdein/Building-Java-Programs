// Chapter 2 Exercise 5
// Write nested for loops to produce the following output:
// *
// **
// ***
// ****
// *****

public class Chapter2Exercise5
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 6; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}