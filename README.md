# mongodatabase



#Definition - What does MongoDB mean?

+ MongoDB is a cross-platform and open-source document-oriented database, a kind of NoSQL database. 
+ As a NoSQL database, MongoDB shuns the relational database’s table-based structure to adapt JSON-like documents that have dynamic schemas which it calls BSON. 
+ This makes data integration for certain types of applications faster and easier. 
+ MongoDB is built for scalability, high availability and performance from a single server deployment to large and complex multi-site infrastructures.

#MongoDB features:

+ Ad hoc queries - supports search by field, regular expression searches, and range queries.
+ Indexing - any field in the BSON document can be indexed.
+ Replication - provides high availability via replica sets which consists of two or more copies of the original data.
+ Load balancing - sharding is the method used to allow MongoDB to scale horizontally, meaning that data will be distributed and split into ranges and then stored in different shards which can be located in different servers. Shard keys are used to determine how the data will be distributed.
+ Aggregation - MapReduce can be applied to enable batch processing of data as well as perform aggregation operations.
+ File storage - MongoDB can be used as file system which makes use of the above functions and acting in a distributed manner through sharding.

#Exercise:
#Mongodb_Database:
Insert data to the database that would give for the following results for these 5 queries:

![screenshot from 2016-11-05 00-36-27](https://cloud.githubusercontent.com/assets/15997793/20024727/fac6e2bc-a2f0-11e6-9bba-5fff9fe7badf.png)

#Final Result:

+ > db.clients.count()
 => 10000
+ > db.clients.find({"birthdate":{"$lt":"1990-01-01"}}).count()
 => 6000
+ > db.clients.find({"birthdate":{"$gt":"1980-01-01"}}).count()
 => 6000
+ > db.clients.find({"name":"Tom"}).count()
 => 100
+ > db.clients.find({"name":{"$regex":"^Tom"}}).count()
 => 200


