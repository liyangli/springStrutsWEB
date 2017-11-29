package com.ylisoftware.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ylisoftware.service.IocService;

/**
 * author:liyangli
 * date: 2017/11/29 下午11:48.
 */
public class IocAction extends ActionSupport{
    private IocService iocService;

    public IocService getIocService() {
        return iocService;
    }

    public void setIocService(IocService iocService) {
        this.iocService = iocService;
    }

    public String execute(){
        System.out.println(iocService.findName());
        return SUCCESS;
    }
}
