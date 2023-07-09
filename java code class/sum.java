import java.util.Scanner;
class sum{
    public static int calculate(int m , int n)
    {
        int s = 0;
        for(int i = m ; i<=n ;)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                s += i;
                i+= 15;
            }
            else
                i++;

        }

        return s;
    }

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("m: ");
        int num1 = scanner.nextInt();
    
        System.out.print("n: ");
        int num2 = scanner.nextInt();
        
        
        int sum = calculate(num1, num2);

        System.out.println(sum);
    }
}



