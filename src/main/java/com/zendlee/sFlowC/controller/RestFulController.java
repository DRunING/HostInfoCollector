package com.zendlee.sFlowC.controller;

import com.zendlee.sFlowC.dao.mongo.SFlowDao;
import com.zendlee.sFlowC.repository.SFlowHead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "sFlow/")
public class RestFulController {

    @Autowired
    private SFlowDao sFlowDao;
    @RequestMapping(value = "get/{id}")
    public String getsFlowById(@PathVariable String id){
        SFlowHead sFlowHead = new SFlowHead();
        sFlowHead = sFlowDao.findSFlowHeadById(id);
        return null;
    }
}
