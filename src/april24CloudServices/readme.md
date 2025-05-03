What is a cloud ?

for storage, other than local
no need to purchase physical hardware, or setup
outsourcing the hardware need


refers to the on demand availability of compute resources
like storage, networking, software

Infrastructure - compute, networking, software

## Cloud computing is the on-demand delivery of IT resources over the Internet with pay-as-you-go pricing. Instead of 
buying, owning, and maintaining physical data centers and servers, you can access technology services, such as 
computing power, storage, and databases, on an as-needed basis from a cloud provider like Amazon Web Services (AWS).

Pros:
no need to maintain the hardware
pay per use

Scaling -- Horizontal scaling / vertical scaling
Redundancy -- multiple copies at different location by backup the data, help to save data

## Latency: how fast data is accessible when anyone try to accesing it. Latency measures in nanoseconds

Cons:

Security
Internet
Downtime

## Types of cloud
           Services  provider (IaaS)
AWS        EC2 
Azure      Azure VM
GCP        Google computing Engine

Digital ocean
IBM cloud
Alibaba cloud
Akamai 

## EC2

## lambda Server

AWS Lambda - serverless server - means you don't care about server(don't need to manage), you can run yous code
compute service where you don't have to manage the server

## Docker ?

manage containers

What is container ?
Docker ?
Container ?
Kubernetes?
Orchestra?

Synchronous v/s Asynchronous ? response immediately 

Async tools -- Rabbit MQ, Kafka, AMQ, IBMMQ, Java M S

AWS - SQS/SNS - Simple Queue Service, Simple Notification Service

KafKa ? Read of it 
Event Drive Architecture https://aws.amazon.com/event-driven-architecture/

Alex xu system design ? must read to understand system design
https://github.com/mukul96/System-Design-AlexXu/blob/master/System%20Design%20Interview%20An%20Insider’s%20Guide%20by%20Alex%20Xu%20(z-lib.org).pdf


Twillo ? handle pushNotification i.e. when order something, it gives notification regarding delivery
Mail Trap ?

## Relational Database services
relational - database in form of tables, columns, and rows

NoSQL , MongoDB, Cassandra, Redis
Dynamo DB - provided by AWS

## CloudWatch

Graphs, metrics of the application

Splunk,
Datadog
DynaTrace
logz.io
Elastic search

Promethous - Graphana ?

Where do you see the logs ?

## Pager Duty

App to give you notification

50% cpu is used, set the alarm
for the next 5 minutes, ring the alarm

Production Supports

Caching ?
Scaling ?

Horizontal Scaling V/s Vertical Scaling


Refer Technical guftgu (Bhupinder rajput)
Docker?
Container is like a virtual machine
Docker is a tool which create this V.M. Docker is actual a company name, and it's name is docker engine.
Hypervisor -- which help to make environment virtual or help to make virtual machine 
Docker is an advance version of virtualization/ to make containerization

Container does not have any operating system (take all the dependency from docker hub)
|
Docker Engine (Compare with hypervisor)
|
O.S
|
Hardware (Our machine)

-- Docker is an open source Centralised platform designed to create, deploy and run application.
-- Docker uses Container on the host O.S to run application. It allows applications use the same linux kernel as a System
   on the host computer, rather creating a whole virtual O.S.
-- We can install docker on any O.S but Docker Engine runs natively on Linux distribution, means docker runs itself on
   linux O.S always under the hood.
-- Docker written in 'GO' language
-- Docker is a tool that performs OS level Virtualization, also knows as Containerization.
-- Before Docker, many user faces the problem that particular code is running  in the developer's system but not in the 
   User's System.
-- Docker was first release in March 2013. It is developed by Solomon Hykes and Sebastian Patil.
-- Docker is a set of Platform as a service that uses O.S level Virtualization whereas VMWare uses hardware level
   virtualization