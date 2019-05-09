/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shitalbk
 */
public class One_Dimension_Array {
    public static void main(String args[])
    {
        int threeD[][][] = new int [3][4][5];
        int i,j,k;
        
        for(i = 0;i<3;i++)
            for(j = 0;j<4;j++)
                for(k = 0;k<5;k++)
                    threeD[i][j][k] = i * j * k;
        
        for(i = 0;i<3;i++){
            for(j = 0;j<4;j++){
                for(k = 0;k<5;k++)
                   System.out.print(threeD[i][j][k] + " ");
                System.out.println();
                
            }
            System.out.println();
        }
        
        
        
        
        /*
        int month_days[];
       month_days = new int[12];
       month_days[0] = 31;
       month_days[1] = 23;
       month_days[2] = 56;
       month_days[3] = 12;
       month_days[4] = 76;
       month_days[5] = 87;
       month_days[6] = 76;
       month_days[7] = 98;
       month_days[8] = 88;
       month_days[9] = 23;
       month_days[10] = 78;
       month_days[11] = 45;
       System.out.println("April has " + month_days[3] + "days.");
       
       int month_day[] = {23,21,34,65,76,33,44,55,66,77,88,99};
       System.out.println("April has " + month_day[0] + "days.");
       
       // Average of the values
       double num[] = {10.12,12.11,78.23,87.44,13.0,65.32};
       double result =  0;
       int i;
       for(i = 0;i<=5;i++)
       
           result = result + num[i];
           System.out.println("Average is " + result/6);
           
       
       int twoD[][] = new int[4][5];
       //two dimensional array
       int m,n,o = 0;
       for(m = 0;m<4;m++)
           for(n = 0;n<5;n++)
           {
               twoD[m][n] = o;
               o++;
           }
       for(m =0;m<4;m++){
           for(n = 0;n<5;n++)
           
               System.out.print(twoD[m][n] + " ");
               System.out.println();
           
       }
       
       // Manually allocate differing size second dimensions
       int twoD1[][] = new int [4][];
       twoD1[0] = new int[1];
       twoD1[1] = new int[2];
       twoD1[2] = new int[3];
       twoD1[3] = new int[4];
       
       int a,b,c = 0;
       for(a = 0;a<4;a++)
           for(b =0;b<a+1;b++){
               
               twoD1[a][b] = c;
               c++;
           }
       for(a = 0;a<4;a++)
       {
           for(b = 0;b<a+1;b++)
               System.out.print(twoD1[a][b] + " ");
               System.out.println();
       } 
       //Initializing two-dimensional array
       double z[][] = {
           { 0*0, 1*0, 2*0, 3*0 },
           { 0*1, 1*1, 2*1, 3*1 },
           { 0*2, 1*2, 2*2, 3*2 },
           { 0*3, 1*3, 2*3, 3*3 }
       };
       int p,s;
       for(p=0;p<4; p++){
           for(s=0;s<4;s++)
               System.out.print(z[p][s] + " ");
             System.out.println();
               }    
       */
        
        
    }
}
