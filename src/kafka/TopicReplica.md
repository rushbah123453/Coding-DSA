
Topic Replica:

1. Generally The replication factor is 3
2. If the replication factor is 3 then each topic-Partition is 
replicated 3 times accross different brokers
3. Each Topic Partition will have only 1 leader for a given partiton
ex: Topic-partition-1 will have broker 101 as leader
Topic-partition-2 will have broker 102 as leader

4. Only that Leader can server or receive data for a partiton; 
others are in-sync replicas 


