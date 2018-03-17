package com.zendlee.sFlowC.sFlow;


/**
 * @author zenli
 */
public class SFlowMsg {
    private SFlowHeader sFlowHeader;
    private String[] sFlowBody;

    public SFlowMsg(SFlowHeader sFlowHeader, String[] sFlowBody){
        this.sFlowHeader = sFlowHeader;
        this.sFlowBody = sFlowBody;
    }

    public SFlowHeader getsFlowHeader() {
        return sFlowHeader;
    }

    public void setsFlowHeader(SFlowHeader sFlowHeader) {
        this.sFlowHeader = sFlowHeader;
    }

    public String[] getsFlowBody() {
        return sFlowBody;
    }

    public void setsFlowBody(String[] sFlowBody) {
        this.sFlowBody = sFlowBody;
    }
}
