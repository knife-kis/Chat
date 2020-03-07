package com.tarnovskiy.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StartServer {
    private static ExecutorService clientsExecutorService;

    public static void main(String[] args) {
        clientsExecutorService = Executors.newCachedThreadPool();
        clientsExecutorService.submit((Runnable) new ServerMain());
        clientsExecutorService.shutdown();

    }
}
