package com.test;

import java.util.Date;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {
	
	public int doStartTag() {
		
		JspWriter out = null;
		
		try {
			out=pageContext.getOut();
			out.println("JSP CUSTOM TAG : "+new Date());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return SKIP_BODY;
	}

}
