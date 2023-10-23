package com.example.ogani.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    
    public MessageResponse(String string) {
		// TODO Auto-generated constructor stub
	}

	private String message;
}
