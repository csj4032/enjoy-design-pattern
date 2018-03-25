package com.pearl.genius.vistor.example01;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Content  implements SendElement {
	private String to;
	private String from;
	private String content;

	@Override
	public boolean sender(Sender sender) {
		return sender.send(this);
	}
}