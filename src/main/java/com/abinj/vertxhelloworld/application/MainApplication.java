package com.abinj.vertxhelloworld.application;

import io.vertx.core.Vertx;

/**
 * Created by abinj on 7/2/17.
 */
public class MainApplication{

    public static void main(String[] args) throws Exception {
        Vertx.vertx().createHttpServer().requestHandler(httpServerRequest -> httpServerRequest.response()
                .end("Hello World!!!")).listen(8080);
    }
}
