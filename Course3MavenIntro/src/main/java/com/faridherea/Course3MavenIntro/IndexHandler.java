package com.faridherea.Course3MavenIntro;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
@SuppressWarnings("restriction")

public class IndexHandler implements HttpHandler{
	public void handle(HttpExchange t) throws IOException{
		//set the response as a string containing html code
		String response = "<html>\r\n" + 
				"    <head>\r\n" + 
				"        <title>Automotive - Main page</title>\r\n" + 
				"        <style>\r\n" + 
				"            body {\r\n" + 
				"                margin: 0px;\r\n" + 
				"                padding: 0px;\r\n" + 
				"                text-align: center;\r\n" + 
				"            }\r\n" + 
				"            nav {\r\n" + 
				"                display:inline;\r\n" + 
				"            }\r\n" + 
				"        </style>\r\n" + 
				"    </head>\r\n" + 
				"    <body>\r\n" + 
				"        <nav>\r\n" + 
				"            <a href=\"#\">Home</a>\r\n" + 
				"            <a href=\"#\">List</a>\r\n" + 
				"            <a href=\"#\">Article</a>\r\n" + 
				"            <a href=\"#\">Login</a>\r\n" + 
				"            <a href=\"#\">Register</a>\r\n" + 
				"            <a href=\"#\">Form</a>\r\n" + 
				"            <a href=\"#\">Address</a>\r\n" + 
				"            <a href=\"#\">Contact</a>\r\n" + 
				"        </nav>\r\n" + 
				"        <section>\r\n" + 
				"            \r\n" + 
				"        </section>\r\n" + 
				"    </body>\r\n" + 
				"</html>";
		//set headers and status code
		t.sendResponseHeaders(200, response.length());
		OutputStream os = t.getResponseBody();
		//send response
		os.write(response.getBytes());
		//close request
		os.close();
	}
}