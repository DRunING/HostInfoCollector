package com.zendlee.sFlowC.dao.mongo;

import com.zendlee.sFlowC.repository.SFlowHead;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final static Logger log = LoggerFactory.getLogger(SFlowDao.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveSflowHead(SFlowHead sFlowHead){
        mongoTemplate.save(sFlowHead);
        log.info("save a sFlow head");
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
