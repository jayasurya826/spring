package com.jaya.webservices.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jaya.webservices.messenger.database.DatabaseClass;
import com.jaya.webservices.model.Message;

public class MessageService
{
	private Map<Long,Message> messages=DatabaseClass.getMessages();
	
	public MessageService()
	{
		messages.put(1L, new Message(1,"hello","jaya"));
		messages.put(2L, new Message(2L,"hello jaya","jaya"));
	}
	
public List<Message> getAllMeaasge()
{
	return new ArrayList<Message>(messages.values());
	}
public Message getMessage(long id)
{
	return messages.get(id);
	}

public Message addMessage(Message message)
{
message.setId(messages.size() + 1);	
messages.put(message.getId(), message);
return message;
}
public Message updateMessage(Message message)
{
	if(message.getId() <=0)
	{
		return null;
	}
	messages.put(message.getId(), message);
	return message;
	}

public Message removeMessage(long id)
{
	return messages.remove(id);
	}

}
