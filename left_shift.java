/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class left_shift {
    //left shifting a byte value
    public static void main(String []args)
    {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
        
        // left shifting as a quick way to multiply by 2
        int num = 0xFFFFFFE;
        int as= 678;
        as = as >> 8;
        for(i = 0;i<4;i++)
        {
            num = num << 1;
            System.out.println(num);
            System.out.println(as);
        }
        
        // hexbyte (masking sign extension)
        char hex[] = {
          '0', '1','2','3','4','5','6','7',
          '8','9','a','b','c','d','e','f'
        };
        byte bi = (byte) 0xf1;
        System.out.println("bi = 0x" + hex[(bi >> 4) & 0x0f] + hex[bi & 0x0f]);
        
        
        //unsigned shifting a byte value
        byte c = (byte) (b>>4);
        byte d = (byte) (b>>>4);
        byte e = (byte) ((b & 0xff) >> 4);
        System.out.println(" b = 0x" + hex[(b>>4) & 0x0f] + hex[b & 0x0f]);
        System.out.println(" c = 0x" + hex[(c>>4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" d = 0x" + hex[(d>>4) & 0x0f] + hex[d & 0x0f]);
        System.out.println(" d = 0x" + hex[(e>>4) & 0x0f] + hex[e & 0x0f]);
        
        
        int x = 1;
        int y = 2;
        int z = 3;
        x |= 4;
        y >>= 1;
        z <<= 1;
        a ^= c;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("z =" + z);
        
        //boolean logical operators
        boolean ab = true;
        boolean bc = false;
        boolean cd = ab | bc;
        boolean dc = ab & bc;
        boolean de = ab ^ bc;
        boolean ef = (!ab & bc) | (ab & !bc);
        boolean gh = !ab;
        System.out.println(" ab = " + ab);
        System.out.println(" bc = " + bc);
        System.out.println(" cd = " + cd);
        System.out.println(" dc = " + dc);
        System.out.println(" de = " + de);
        System.out.println(" ef = " + ef);
        System.out.println(" gh = " + gh);
        
        //ternary operator
        int j,k;
        j = 10;
        k = j < 0 ? -j : 1; //get absolute value of j
        System.out.print("Absolute value of ");
        System.out.println(j + " is " + k);
        
        j  = -10;
        k = j < 0 ? -j :1; //get absolute value of j
        System.out.print("absolute value of ");
        System.out.println(j + " is " + k);
        
        //if-else ladder
        int month = 4; // April
        String season;
        if(month == 12 || month ==1 || month ==2)
            season = "Winter";
        else if(month ==3 || month ==4|| month ==5)
        season = "Spring";
         else if(month ==6|| month ==7|| month ==8)
        season = "Spring";
        
         else if(month ==9 || month ==10|| month ==11)
        season = "Spring";
        else
        season = "Bogus Month";
        System.out.println("April is in the " + season + ".");
        
        //switch-case statement
        for(int n = 0;n<6;n++)
            switch(n)
            {
                case 0:
                    System.out.println("n is zero");
                    break;
                 case 1:
                    System.out.println("n is one");
                    break;
                     case 2:
                    System.out.println("n is two");
                    break;
                     case 3:
                    System.out.println("n is three");
                    break;
                     default:
                         System.out.println("n is greater than 3.");
            }
        
        for(int m = 0;m<12;m++)
            switch(m){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("m is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("m is less than 5");
                    break;
                default:
                    System.out.println("m is 10 or more");
            }
        
        //string with switch case
        String str = "three";
        switch(str)
        {
            case "one":
                System.out.println("one");
                 break;
            case "two":
                System.out.println("two");
                 break;
                 case "three":
                System.out.println("three");
                 break;
                 default:
                     System.out.println("no match");
                     break;
        }
        //while loop
        int n = 10;
        while(n>0){
            System.out.println("tick " + n);
            n--;
        }
        int u,w;
        u=100;
        w = 8000;
        while(++u < --w); //no body in this loop
        System.out.println("Midpoint is " + u);
        
        int q  =10;
        //do-while loop
        do{
            System.out.println("tick " + q);
            q--;
            
        }while(q > 0);
        
        //for each loop
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int l : nums){
            System.out.println("Value is: " + l);
            sum += l;
        }
        System.out.println("Summation: " + sum);
        
        //for-each style for on a two-dimensonal array
        int sum1 = 0;
        int nums1[][] = new int [3][5];
        for(int si = 0;si<3;si++)
            for(int ji = 0;ji <5;ji++)
                nums1[si][ji] = (si+1)*(ji+1);
        for(int xi[] : nums1){
            for(int yi : xi){
                System.out.println("Value is: " + yi);
                sum1 += yi;
            }
        }
        System.out.println("Summation: " + sum1);
    } 
}
