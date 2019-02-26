package com.faridherea.Course3MavenIntro;

import java.util.Scanner;
import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class App 
{
	@SuppressWarnings("restriction")
    public static void main( String[] args ) throws IOException {
        //create webserver service
    	HttpServer server = HttpServer.create(new InetSocketAddress(8001), 0);
    	//set handler to specified path
    	server.createContext("/", new MyStringHandler());
    	server.createContext("/html/", new MyHtmlHandler());
    	server.createContext("/index/", new IndexHandler());
    	//creates a default executor
    	server.setExecutor(null);
    	//start the server
    	server.start();
    	System.out.println("Server Started on Port 8001");
    }
}
