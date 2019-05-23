// Chapter 2 Exercise 6
// Write nested for loops to produce the following output:
// 1
// 22
// 333
// 4444
// 55555
// 666666
// 7777777

public class Chapter2Exercise6 {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        for(int i = 1; i < 8; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
