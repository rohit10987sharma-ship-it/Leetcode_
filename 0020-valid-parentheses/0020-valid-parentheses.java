class Solution {
    public boolean isValid(String s)
     {
      int i=0, j=0,k=0,l=0,m=0;
       int a [] =new int [s.length()];
      for( ; i<s.length();i++)
      {
          char c =s.charAt(i);

           if(c=='{'){
               a[j]=c;j++;
           }
             if(c=='}')
                 {
                          j--;
                          if(j<0)
                          return false;
                          if(a[j]=='{')
                            {  k++;}
                            else 
                             return false;
                  }
               if(c=='[')
               {
                   a[j]=c; j++;}
             if(c==']')
                    {
                          j--;
                           if(j<0)
                          return false;
                          if(a[j]=='[')
                            {  k++;}
                            else 
                             return false;
                  }
                  if(c=='(')
                  {
                     a[j]=c;j++;
                     }

             if(c==')')
                  {
                          j--;
                           if(j<0)
                          return false;
                          if(a[j]=='(')
                            {  k++;}
                            else 
                             return false;
                  }
      }     
           if (j>0)
             return false;
             return true;
         
            }
}