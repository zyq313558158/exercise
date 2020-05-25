package com.zyq.eurekaserver;

import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.aggregation.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class MongoTemplateTest {
    public static void main(String[] args) {
       //demo();
       getChecksdemo();
        //getCheckNumDemo();
    }

    private static void getCheckNumDemo() {
        MongoClientOptions.Builder mongoBuilder = new MongoClientOptions.Builder();
        mongoBuilder.maxWaitTime(1000*60*3);
        mongoBuilder.connectTimeout(60*1000*3);    //与数据库建立连接的timeout设置为1分钟
        mongoBuilder.minConnectionsPerHost(1);
        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://localhost:27017/sanyi_db",mongoBuilder);
        SimpleMongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClientURI);
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);

        MatchOperation matchOperation = Aggregation.match(Criteria.where("accountId").is("2c8080815cd3a74a015cd3ae86850001"));
        try {
            mongoDbFactory.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getChecksdemo() {
        MongoClientOptions.Builder mongoBuilder = new MongoClientOptions.Builder();
        mongoBuilder.maxWaitTime(1000*60*3);
        mongoBuilder.connectTimeout(60*1000*3);    //与数据库建立连接的timeout设置为1分钟
        mongoBuilder.minConnectionsPerHost(1);
        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://localhost:27017/sanyi_db",mongoBuilder);
        SimpleMongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClientURI);
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);

        MatchOperation matchOperation = Aggregation.match(Criteria.where("accountId").is("2c8080815cd3a74a015cd3ae86850001"));
        //MatchOperation matchOperation2 = Aggregation.match(Criteria.where("checks.checkState").is(1));
        UnwindOperation checksOperation = Aggregation.unwind("checks");
        //GroupOperation groupOperation = Aggregation.group("checks.checkState");
        // .push("storeId").as("storeId")
          //      .push("checkState").as("checkState").push("checkTime").as("checkTime");
        ProjectionOperation projectionOperation = Aggregation.project().and("checks.storeId").as("storeId").
                and("checks.checkState").as("checkState").and("checks.checkTime").as("checkTime");
        Aggregation aggregation = Aggregation.newAggregation(matchOperation,checksOperation,projectionOperation);
        //AggregationResults<StoreCheck> storeCheckList=  mongoTemplate.aggregate(aggregation,"auditStoreChecks", StoreCheck.class);

        //System.out.println(storeCheckList.getMappedResults());
        //System.out.println(storeCheckList.getMappedResults().size());
        try {
            mongoDbFactory.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void demo() {
        MongoClientOptions.Builder mongoBuilder = new MongoClientOptions.Builder();
        mongoBuilder.maxWaitTime(1000*60*3);
        mongoBuilder.connectTimeout(60*1000*3);    //与数据库建立连接的timeout设置为1分钟
        mongoBuilder.minConnectionsPerHost(1);
        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://localhost:27017/sanyi_db",mongoBuilder);
        SimpleMongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClientURI);
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);
        System.out.println(mongoTemplate.count(new Query(),"auditStoreChecks"));
        try {
            mongoDbFactory.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
