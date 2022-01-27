
1. Producer writes data to topic
2. Producer already know on whivh partition towrite the data on
3. If we dont send key, then producer will round robin on to any broker 
4. If we mention key, then that key will always be routed to same partition

Producer can choose to ceive acknowledgment writes:

ack=0 : Producer wont wait for achknowledgment
ack=1 : Producer waits for acknowledgment from leader
ack=all : Producer waits for leader+replicas acknowledgment

