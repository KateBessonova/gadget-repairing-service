package com.solvd.gadgetrepairservice.people;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool2 {
    public static void main(String[] args) {
        int numThreads = 5;
        Thread[] threads = new Thread[numThreads];

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        List<String> connectionNames = connectionPool.getConnectionsNames();
        System.out.println("Connection names: " + connectionNames);

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Customer(connectionPool));
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ConnectionPool {
        public static ConnectionPool instance;
        public BlockingQueue<Connection> connectionPool;

        private ConnectionPool() {
            connectionPool = new LinkedBlockingQueue<>();
            // Initialize the connection pool with connections
            for (int i = 0; i < 10; i++) {
                connectionPool.add(new Connection("Connection " + (i + 1)));
            }
        }

        public static synchronized ConnectionPool getInstance() {
            if (instance == null) {
                instance = new ConnectionPool();
            }
            return instance;
        }

        public Connection getConnection() throws InterruptedException {
            return connectionPool.take();
        }

        public void releaseConnection(Connection connection) throws InterruptedException {
            connectionPool.put(connection);
        }

        public List<String> getConnectionsNames() {
            List<String> names = new ArrayList<>();
            for (Connection connection : connectionPool) {
                names.add(connection.getName());
            }
            return names;
        }
    }

    static class Connection {
        private String name;

        public Connection(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}