package com.pearl.genius.vistor.example01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image extends Content {

	private final String imageName;
	private final int width;
	private final int heigth;

	public Image(String to, String from, String content, String imageName, int width, int height) {
		super(to, from, content);
		this.imageName = imageName;
		this.width = width;
		this.heigth = height;
	}
}
