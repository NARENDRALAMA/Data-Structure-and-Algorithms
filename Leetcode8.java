class Solution {


    public int myAtoi(String s) {

        String str=s.trim();
        int n=str.length();

        if(n==0){
            return 0;
        }

        long ans=0;
        int i=0;
        int sign=1;


        if(str.charAt(0)=='-' || str.charAt(0)=='+'){
            sign=(str.charAt(0)=='-') ? -1:1;
            i++;
        }

        while(i<n){

          char current=str.charAt(i);

          if(!Character.isDigit(current)){
            break;
          }

          int curr=str.charAt(i)-'0';


          ans=ans*10+curr;

          if(sign==-1 && -ans<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
          }

           if(sign==1 && ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
          }

          i++;
        }

        return (int)(sign*ans);

    }
}