package com.jaya.webservices.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jaya.webservices.messenger.service.MessageService;
import com.jaya.webservices.model.Message;


@Path("/messages")
public class MessageResource
{
	
	MessageService ms=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
public List<Message> getMessage()
{
	return ms.getAllMeaasge();
	}
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String test()
	{
		return "test";
	}
}
