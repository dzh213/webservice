package com.dh.webservice;

import org.springframework.context.annotation.Scope;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by donghao on 2017/8/30.
 */
@Scope("prototype")
@WebService
public interface ReceiveFile {

    @WebMethod
    String sayHello(@WebParam(name="name")String name);
}
