#Time Complexity: O(n):
#Space Compeexity: O(2n):

class Solution:

    def trap(self, height: List[int]) -> int:

        #iniliseing the max_left and max_right axuliray array to store the max left height and the max right height 
        n=len(height)-1

        max_left=[None]*len(height)
        max_left[0]=height[0]


        max_right=[None]*len(height)
        max_right[n]=height[n]

        i=1
        j=n-1

        while(i<len(height)):

            if(height[i]<max_left[i-1]):
                max_left[i]=max_left[i-1]

            else:
                max_left[i]=height[i]

            i+=1

        while(j>=0):

            if(height[j]<max_right[j+1]):
                max_right[j]=max_right[j+1]

            else:
                max_right[j]=height[j]

            j-=1


        total_water=0

        for i in range(len(height)):

            total_water+=min(max_left[i],max_right[i])-height[i]


        return total_water    











        
