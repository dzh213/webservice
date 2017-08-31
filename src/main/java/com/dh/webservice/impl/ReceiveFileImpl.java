package com.dh.webservice.impl;

import com.dh.webservice.ReceiveFile;

import javax.jws.WebService;

/**
 * Created by donghao on 2017/8/30.
 */

//@WebService(endpointInterface = "com.dh.webservice.ReceiveFile")
public class ReceiveFileImpl implements ReceiveFile {

    @Override
    public String sayHello(String name) {
        System.out.println("被调用了");
        return "dddddd";
    }
}
