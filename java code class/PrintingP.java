
//PRINTING PATTERN 1:
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567
// 12345678
// 123456789
// 12345678910


// class PrintingP
// {
//     public static void main(String []args)
//     {
//         for(int i = 1 ;i<= 10 ; i++)
//         {
//             for(int j = 1 ;j<=i; j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//********************************************************************************************* */

//PRINTING PATTERN 2:

//          *
//         **
//        ***
//       ****
//      *****
//     ******
//    *******
//   ********
//  *********
// **********

// class PrintingP
// {
//     public static void main(String []args)
//     {
//         for(int i = 1 ;i<= 10 ; i++)
//         {
//             for(int j = 10 ;j>i; j--)
//             {
//                 System.out.print(" ");
                
//             }
//             for(int j = 1;j<=i; j++)
//             {
//                 System.out.print("*");
                
//             }
//             System.out.println();
//         }
        
        
//     }
// }


//********************************************************************************************* */

//PRINTING PATTERN 3:


//          1
//         121
//        12321
//       1234321
//      123454321
//     12345654321
//    1234567654321
//   123456787654321
//  12345678987654321
// 12345678910987654321

// class PrintingP
// {
//     public static void main(String []args)
//     {
//         for(int i = 1 ;i<= 10 ; i++)
//         {
//             for(int j = 10 ;j>i; j--)
//             {
//                 System.out.print(" ");
                
//             }
//             for(int j = 1;j<=i; j++)
//             {
//                 System.out.print(j);
                
//             }
//             for(int j = i-1;j>=1; j--)
//             {
//                 System.out.print(j);
                
//             }
//             System.out.println();
//         }
        
        
//     }
// }


//********************************************************************************************* */

//PRINTING PATTERN 4:


//          1
//         12A
//        123BA
//       1234CBA
//      12345DCBA
//     123456EDCBA
//    1234567FEDCBA
//   12345678GFEDCBA
//  123456789HGFEDCBA
// 12345678910IHGFEDCBA

// class PrintingP
// {
//     public static void main(String []args)
//     {
//         int A = 64;
//         for(int i = 1 ;i<= 10 ; i++)
//         {
//             for(int j = 10 ;j>i; j--)
//             {
//                 System.out.print(" ");
                
//             }
//             for(int j = 1;j<=i; j++)
//             {
//                 System.out.print(j);
                
//             }
//             for(int j = i-1;j>=1; j--)
//             {
//                 System.out.print((char)(A+j));
                
//             }
//             System.out.println();
//         }
        
        
//     }
// }


//********************************************************************************************* */

//PRINTING PATTERN 4:


//          1
//         121
//        12321
//       1234321
//      123454321
//     12345654321
//    1234567654321
//   123456787654321
//  12345678987654321
// 1234567891987654321
//  12345678987654321
//   123456787654321
//    1234567654321
//     12345654321
//      123454321
//       1234321
//        12321
//         121
//          1

class PrintingP
{
    public static void main(String []args)
    {
        for(int i = 1 ;i<= 10 ; i++)
        {
            for(int j = 10 ;j>i; j--)
            {
                System.out.print(" ");
                
            }
            for(int j = 1;j<=i; j++)
            {
                if(j>9)
                {
                    int more = j;
                    more /= 10;
                    System.out.print(more);
                }
                else
                {
                    System.out.print(j);
                }
                
            }
            for(int j = i-1;j>=1; j--)
            {
                
                System.out.print(j);
                
            }
            System.out.println();
        }
        //DOWN PART PATTERN...
        for(int i = 1 ;i< 10 ; i++)
        {
            for(int j = 1 ;j<=i; j++)
            {
                System.out.print(" ");
                
            }
            for(int j =1 ; j<=10-i; j++)
            {
                System.out.print(j);
                
            }
            for(int j = 10-1-i;j>=1; j--)
            {
                System.out.print(j);
                
            }
            System.out.println();
        }
        
        
    }
}


//********************************************************************************************* */