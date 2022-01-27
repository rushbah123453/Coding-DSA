Topics

1. It is a particular stream of data.
2. It is similar to a table in a database 
3. A topic is identified by name
4. You can have as many as topics as you want //


Important Things about Topics:

1. Topics are split into partitions.
2. Each partition is ordered.
3. Developer can define the number of partitions needed while topic creation.
4. Each message within partition gets incremented ids called offsets
5. Offset only have meaning for a specific partition.
6. Once data is written in partition, it cannot be changed (immutable)
7. Random partition is assigned if not mentioned






