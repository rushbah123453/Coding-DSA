
1. Consumers read data from topic via topicName
2. Each Consumers can read from 1 or more partition
3. If number of consumers > number of partitions, then you will have few inactive cosumers

1. Kafka stores the offsets at which the consumer group is being reading the offset
2. The offset committed are stored in a topic _consumer_offsets


Consumer can choose when to commit offset:

1. At most once:
    After reading the message, offset is commit
    Message is lost if something goes wrongwhile processing
    
2. At least once:
   After processing message; Comiit the offset
   This can result in duplication of message
   
3. Exactly once:
    Using kafka streams