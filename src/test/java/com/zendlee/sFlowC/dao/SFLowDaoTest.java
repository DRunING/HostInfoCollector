package com.zendlee.sFlowC.dao;

import com.zendlee.sFlowC.dao.mongo.SFlowDao;
import com.zendlee.sFlowC.repository.mongo.SFlowHead;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zenli
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SFLowDaoTest {
    @Autowired
    private SFlowDao sFlowDao;

    @Test
    public void testSFlowSave(){
        SFlowHead sFlowHead = new SFlowHead();
        sFlowHead.setId("2");
        sFlowHead.setIpAddress(10);
        sFlowHead.setVersion(4);
        sFlowDao.saveSflowHead(sFlowHead);
    }

//    @Test

}
