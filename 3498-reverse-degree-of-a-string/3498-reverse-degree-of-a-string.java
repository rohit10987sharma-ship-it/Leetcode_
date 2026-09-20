class Solution {
    public int reverseDegree(String s) 
    {
        char m ='m';
           int l=0,t=0;
         for(int i=0;i<s.length();i++)
         {  
            char c= s.charAt(i);
              if(c=='a')
               l=26;
                 if(c=='b')
               l=25;
                 if(c=='c')
               l=24;
                 if(c=='d')
               l=23;  
               if(c=='e')
               l=22; 
                if(c=='f')
               l=21; 
                if(c=='g')
               l=20;
                 if(c=='h')
               l=19;
                 if(c=='i')
               l=18;
                 if(c=='j')
               l=17;
                 if(c=='k')
               l=16;
                 if(c=='l')
               l=15;
                 if(c=='m')
               l=14;
                 if(c=='n')
               l=13;
                 if(c=='o')
               l=12;
                 if(c=='p')
               l=11;
                 if(c=='q')
               l=10;
                 if(c=='r')
               l=9;
                if(c=='s')
               l=8;
                if(c=='t')
               l=7;
                if(c=='u')
               l=6;
                if(c=='v')
               l=5;
                if(c=='w')
               l=4;
                if(c=='x')
               l=3;
                if(c=='y')
               l=2;
                if(c=='z')
               l=1;
               

               


             t=(i+1)*l+t;
         } return t;
    }
}