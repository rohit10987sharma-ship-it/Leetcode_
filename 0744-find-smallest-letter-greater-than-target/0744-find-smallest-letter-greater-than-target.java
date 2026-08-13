class Solution {
    public char nextGreatestLetter(char[] letters, char target)
     {   int j= target;
     int i=letters.length;
      i--;
       if(letters[i] == target)
         return (letters[0]);
       if(letters[0]> target)
                  return (letters[0]);
                     if(letters[i]< target)
                  return (letters[0]);
                  
         for( ;i>-1;i--)
         {
              int c=letters[i];
             if(c==j)
               return(letters[i+1]);
              if(c<j)
                 return(letters[i+1]);

         }   
    return 'a'; } 
}