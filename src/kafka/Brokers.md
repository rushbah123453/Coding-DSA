
1. A cluster consists of number of brokers
2. Each Broker can contain topic partitions
3. Clusters can have 100+ brokers
4. Each broker have ID
5. If you are connected to any one of the broker, 
you are connected to whole cluster

Lets consider you have 

3 brokers
2 Topic : A, B
Topic A: 3 partition
Topic B: 2 partition

Broker 101 can contain Topic A-Partition-1, Topic B-Partition-2
Broker 102 can contain Topic A-Partition-2, Topic B-Partition-1
Broker 103 can contain Topic A-Partition-3


