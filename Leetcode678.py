class Solution:

    def checkValid(self, str, idx, count,dp):

        if count<0:
            return False

        if idx>=len(str):
            if(count==0):
                return True

            else:
                return False

        if   dp[idx][count] is not None:
            return dp[idx][count]

        if str[idx]=="(":
             dp[idx][count]=self.checkValid(str,idx+1,count+1,dp)
             return dp[idx][count]

        elif str[idx]==")": 
             dp[idx][count]=self.checkValid(str, idx+1,count-1,dp) 
             return dp[idx][count]

        else:
            dp[idx][count]=self.checkValid( str,idx+1,count+1,dp) or self.checkValid(str, idx+1,count-1,dp) or self.checkValid(str, idx+1,count,dp) 

            return dp[idx][count] 


    def checkValidString(self, s: str) -> bool:


        dp=[[None]*len(s) for _ in s]

        return self.checkValid(s,0,0,dp)

        
        