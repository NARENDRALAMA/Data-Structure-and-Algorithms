#User function Template for python3

#Time Complexity: O(N)+O(NlogN)
#Space Complexity:O(2N)

class Solution:
    
    #Function to find the maximum number of meetings that can
    #be performed in a meeting room.
    def maximumMeetings(self,start,end):
        # code here
        
        count=1
        meetings=[[0,0] for _ in range(len(start))]
        
        
        for i in range(len(meetings)):
            meetings[i]=[start[i],end[i]]
            
        meetings.sort(key=lambda item:item[1])
        
        prev=[meetings[0][0],meetings[0][1]]
        
        for i in range(1,len(meetings)):
            
            if(meetings[i][0]>prev[1]):
                count+=1
                prev=[meetings[i][0],meetings[i][1]]
            
            
        return count
            
            
            
               
            
            

#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys

#Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        start = list(map(int, input().strip().split()))
        end = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.maximumMeetings(start, end))
        print("~")

# } Driver Code Ends