package com.custom;




import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag1 extends TagSupport 
{
	public int doStartTag() throws JspException 
	{
		JspWriter out = pageContext.getOut();
		try {
		out.println("Address of delloite is :<br/>Block C <br/>Divyasree Technopolis<br/>Survey No: 123 &132/2, Yemlur Post<br/>Yemlur, Off Old Airport Road<br/>Karnataka<br/>560037");
		}catch (IOException e) {
			e.printStackTrace();
		}
       		return SKIP_BODY;
	
	}
}