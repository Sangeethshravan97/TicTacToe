package TicTac;

import java.util.Scanner;

public class TTT {

    public static void main(String[] args){
    Scanner read=new Scanner(System.in);   
        System.out.println("---------------------------------WELECOME TO TIC-TAC GAME---------------------------------");
        System.out.println("RULES \nOnly 2 players are allowed\nplayer1 value is 1 \nplayer2 value is 2");
        
        System.out.println("The Square appears as follow..... \nplease do type the number to fill the respective location");

        char[][] matrix=new char[3][3];
    
        
      //  int process=read.nextInt();
           char k='A';

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix[i][j]=k;
                k++;
            }
        } 

        for( int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.print(matrix[i][j]+" ");
               
                
            }
            System.out.println();
        }

        int process=0;
        int player1=1;
        char loc;

        while(process==0)
        {

        
       if(player1==1)
       {
          System.out.println("PLAYER 1 Enter the location you want to choose:");
           loc=read.nextLine().charAt(0);
           player1(loc,matrix);

           for(int i=0;i<3;i++)
           {
              for(int j=0;j<3;j++)
              {
                  System.out.print(matrix[i][j]+" ");
              }
              System.out.println();
           }

       player1=2;        
  

       }
       else
       {
           
          System.out.println("PLAYER 2 Enter the location you want to choose:");
          loc=read.nextLine().charAt(0);
          player2(loc,matrix);

          for(int i=0;i<3;i++)
           {
              for(int j=0;j<3;j++)
              {
                  System.out.print(matrix[i][j]+" ");
              }
              System.out.println();
           }

          player1=1;
           
       }
       
         process=check(matrix);

       
           }

          if(process==1)
          {
              System.out.println("PLAYER 1 is the winner");
          }
          else if(process==2)
          {
              System.out.println("PlAYER 2 is the winner");
          }

            read.close();

    }

    private static int check(char[][] matrix) {
        
        
        int x;
        if(matrix[0][0]=='x'&&matrix[0][1]=='x'&&matrix[0][2]=='x')
        {
             x=1;
        }else if(matrix[1][0]=='x'&&matrix[1][1]=='x'&&matrix[1][2]=='x')
        {
             x=1;
        }
        else if(matrix[2][0]=='x'&&matrix[2][1]=='x'&&matrix[2][2]=='x')
        {
             x=1;
        }
        else if(matrix[0][0]=='o'&&matrix[0][1]=='o'&&matrix[0][2]=='0')
        {
             x=2;
        }else if(matrix[1][0]=='o'&&matrix[1][1]=='o'&&matrix[1][2]=='o')
        {
             x=2;
        }
        else if(matrix[2][0]=='o'&&matrix[2][1]=='o'&&matrix[2][2]=='o')
        {
            x=2;
        }
        else if(matrix[0][0]=='x'&&matrix[1][1]=='x'&&matrix[2][2]=='x')
        {
            x=1;
        }
        else if(matrix[0][2]=='x'&&matrix[1][1]=='x'&&matrix[2][0]=='x')
        {
            x=1;
        }
        else if(matrix[0][0]=='o'&&matrix[1][1]=='o'&&matrix[2][2]=='o')
        {
            x=2;
        }
        else if(matrix[0][2]=='o'&&matrix[1][1]=='o'&&matrix[2][0]=='o')
        {
            x=2;
        }
        else if(matrix[0][0]=='x'&&matrix[1][0]=='x'&&matrix[2][0]=='x')
        {
            x=1;
        }
        else if(matrix[0][1]=='x'&&matrix[1][1]=='x'&&matrix[2][1]=='x')
        {
            x=1;
        }
        else if(matrix[0][2]=='x'&&matrix[1][2]=='x'&&matrix[2][2]=='x')
        {
            x=1;
        }
        else if(matrix[0][0]=='o'&&matrix[1][0]=='o'&&matrix[2][0]=='o')
        {
            x=2;
        }
        else if(matrix[0][1]=='o'&&matrix[1][1]=='o'&&matrix[2][1]=='o')
        {
            x=2;
        }
        else if(matrix[0][2]=='o'&&matrix[1][2]=='o'&&matrix[2][2]=='o')
        {
            x=2;
        }
        else{
            x=0;
        }

        return x;

        
    
    }

    private static char[][] player1(char loc, char[][] matrix)
    {

        if(loc=='A' && matrix[0][0]!='2')
        {
            matrix[0][0]='x';
        }
        else if(loc=='B' && matrix[0][0]!='2' )
        {
            matrix[0][1]='x';
        }
        else if(loc=='C' && matrix[0][0]!='2')
        {
            matrix[0][2]='x';
        }
        else if(loc=='D'&& matrix[0][0]!='2')
        {
            matrix[1][0]='x';
        }
        else if(loc=='E'&& matrix[0][0]!='2')
        {
            matrix[1][1]='x';
        }
        else if(loc=='F'&& matrix[0][0]!='2')
        {
            matrix[1][2]='x';
        }
        else if(loc=='G'&& matrix[0][0]!='2')
        {
            matrix[2][0]='x';
        }
        else if(loc=='H'&& matrix[0][0]!='2')
        {
            matrix[2][1]='x';
        }
        else if(loc=='B'&& matrix[0][0]!='2')
        {
            matrix[2][2]='x';
        }
        else
        {
            System.out.println("ALREADY FILLED BY PLAYER 2");
        }
        


        return matrix;
    }

    private static char[][] player2(char loc, char[][] matrix)
    {

        if(loc=='A'&&matrix[0][0]!=1)
        {
            matrix[0][0]='o';
        }
        else if(loc=='B'&&matrix[0][1]!='1')
        {
            matrix[0][1]='o';
        }
        else if(loc=='C'&&matrix[0][2]!='1')
        {
            matrix[0][2]='o';
        }
        else if(loc=='D'&&matrix[1][0]!='1')
        {
            matrix[1][0]='o';
        }
        else if(loc=='E'&&matrix[1][1]!='1')
        {
            matrix[1][1]='o';
        }
        else if(loc=='F'&&matrix[1][2]!='1')
        {
            matrix[1][2]='o';
        }
        else if(loc=='G'&&matrix[2][0]!='1')
        {
            matrix[2][0]='o';
        }
        else if(loc=='H'&&matrix[2][1]!='1')
        {
            matrix[2][1]='o';
        }
        else if(loc=='B'&&matrix[2][2]!='1')
        {
            matrix[2][2]='o';
        }
        else
        {
            System.out.println("ALREADY FILLED BY PLAYER 1");
        }


        return matrix;
    }




}
