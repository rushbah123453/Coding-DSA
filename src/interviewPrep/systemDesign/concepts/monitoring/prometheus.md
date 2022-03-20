Prometheus is a monitoring tool:

1. Prometheus Server have 3 parts:
    a) Retrival: It pulls the data from the target nodes whose monitorinb has to be done.
    b) Storage: It stores all the data here in timeseries db
    c) HTTP Server: This can be used to query the data, used by graphana, clients etc

2. Target inventory:
    a) How does prometheus know, whose data to scrap or monitor? it will have inventory on consul
    b) any change in inventory is updated in consul and hence on prometheus
    
3) Short lived jobs: 
    a) Some short lived jobs push the data to prometheus
 
4) Alert: The alerts are send via pagerduty,email,sms etc

Reference: https://www.youtube.com/watch?v=lVYRR_UNT0M

