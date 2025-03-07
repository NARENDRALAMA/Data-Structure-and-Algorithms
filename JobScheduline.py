class JobScheduling:
    
    def __init__(self,id,deadline,profit):
        self.id=id
        self.deadline=deadline
        self.profit=profit
        


arr=[JobScheduling(1,5,25),JobScheduling(2,2,65),JobScheduling(3,7,75),JobScheduling(4,3,60),JobScheduling(5,2,70),JobScheduling(6,1,50),JobScheduling(7,4,85),JobScheduling(8,5,68),JobScheduling(9,3,45),]


arr.sort(key=lambda job:job.profit,reverse=True)

max_deadline=7

result=[False]*max_deadline
job_sequence=['']*max_deadline


for job in arr:
    for j in range(min(max_deadline,job.deadline)-1,-1,-1):
        if not result[j]:
            result[j]=True
            job_sequence[j]=job.id
            break


print(job_sequence)
