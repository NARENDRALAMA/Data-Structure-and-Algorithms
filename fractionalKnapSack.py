class Items:
    
    def __init__(self,profit,weight):
        self.profit=profit
        self.weight=weight
        
    def __repr__(self):  # Added this method for meaningful output
        return f"(Profit: {self.profit}, Weight: {self.weight})"    
        
        

arr=[Items(25,5),Items(75,10),Items(100,12),Items(50,4),Items(45,7),Items(90,9),Items(30,3)]

arr.sort(key=lambda item:item.profit/item.weight,reverse=True)


capacity=37

total_profit=0

remaining_weight=capacity


for item in arr:
    
    if(item.weight<=remaining_weight):
        
        total_profit+=item.profit
        remaining_weight-=item.weight
        
    else:
        
        total_profit+=remaining_weight/item.weight*item.profit
        remaining_weight=0
        
        break
    

print(total_profit)    
        


        
        