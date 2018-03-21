package com.zendlee.sFlowC.dao.mongo;

import com.zendlee.sFlowC.repository.mongo.SFlowHead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;


/**
 * @author zenli
 */
@Component
public class SFlowDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveSflowHead(SFlowHead sFlowHead){
        mongoTemplate.save(sFlowHead);
    }

    public SFlowHead findSFlowHeadById(String id){
        Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, SFlowHead.class);
    }

    public void deleteSFlowHeadById(String id){
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, SFlowHead.class);
    }



}
