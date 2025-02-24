class Solution {

    public String longestPalindrome(String s) {


        int n=s.length();

        if(n==1){
            return s;
        }

        int Start=0;
        int maxLength=0;


        for(int i=0;i<n;i++){

            int l=i-1;   
            int r=i+1;

            //Checking for the odd;

            while(l>=0 && r<=n-1){

                    if(s.charAt(l)==s.charAt(r)){

                        int length=r-l+1;

                        if(length>maxLength){
                            Start=l;
                            maxLength=length; 
                        }

                        l--;
                        r++;

                    }else{
                        break;
                    }

                    
            }

                

                //For Even length

                 l=i-1;   
                 r=i;

                while(l>=0 && r<=n-1){

                    if(s.charAt(l)==s.charAt(r)){

                        int length=r-l+1;

                        if(length>maxLength){
                            Start=l;
                            maxLength=length;
                        }

                        l--;
                        r++;

                    }
                    else{
                        break;
                    }
                }

        }

        if(Start==0 && maxLength==0){
            return s.substring(0,1);
        }

        return s.substring(Start,Start+maxLength);
      
    }
}