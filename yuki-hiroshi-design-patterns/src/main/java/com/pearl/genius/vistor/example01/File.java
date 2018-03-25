package com.pearl.genius.vistor.example01;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class File extends Content {
	private String file;
	private int size;

	public File(String to, String from, String content, String file, int size) {
		super(to, from, content);
		this.file = file;
		this.size = size;
	}

	@Override
	public boolean sender(Sender sender) {
		return sender.send(this);
	}
}