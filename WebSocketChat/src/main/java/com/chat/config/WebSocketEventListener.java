package com.chat.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.chat.message.ChatMessage;

import lombok.RequiredArgsConstructor;



@Component
@RequiredArgsConstructor

public class WebSocketEventListener {

	@Autowired
	private SimpMessageSendingOperations messageTemplate;
	
	
	 @EventListener
	    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
	        System.out.println("Received a new web socket connection");
	    }
	
	 
	 
	@EventListener
	public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {

		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());

		
		String username = (String) headerAccessor.getSessionAttributes().get("username");

		if (username != null) {

			System.out.println("User Disconnected:{}" + username);
			
		
			ChatMessage chatMessage = new ChatMessage();
            chatMessage.setType(ChatMessage.MessageType.LEAVE);
            chatMessage.setSender(username);

			
			messageTemplate.convertAndSend("/topic/public",chatMessage);
			
		}
	}

}
