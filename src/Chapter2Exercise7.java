// Write nested for loops to produce the following output:
//     1
//    2
//   3
//  4
// 5

public class Chapter2Exercise7
{
    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 6; i > 1; i--)
        {
            for(int j = 2; j < i; j++)
            {
                System.out.print(" ");
            }
            count++;
            System.out.println(count);
        }
    }
}