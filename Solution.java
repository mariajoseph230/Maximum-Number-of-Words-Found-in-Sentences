class Solution {
    public int mostWordsFound(String[] sentences) {
       int max=0;
        int c;
        for(String s :sentences){
           c=s.split(" ").length;
             if(c>max)
            max=c;
        }
       
         return max;
    }
   
}
