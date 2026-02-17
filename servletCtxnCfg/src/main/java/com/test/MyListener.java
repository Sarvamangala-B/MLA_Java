package com.test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements HttpSessionListener {

    public static ServletContext ctx = null;
    public static int total,current = 0;
    
    
	
	
    public void sessionCreated(HttpSessionEvent se)  { 
         total++;
         current++;
         
         ctx= se.getSession().getServletContext();
         
         ctx.setAttribute("tusers", total);
         ctx.setAttribute("cusers", current);
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         current--;
         ctx.setAttribute("cusers", current);
    }
	
}
