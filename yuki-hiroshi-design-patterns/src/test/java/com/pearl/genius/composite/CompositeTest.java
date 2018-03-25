package com.pearl.genius.composite;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void compositeTest() {
		System.out.println("Making root entries");
		Directory rootDir = new Directory("root");
		Directory binDir = new Directory("bin");
		Directory temDir = new Directory("tmp");
		Directory usrDir = new Directory("usr");

		rootDir.add(binDir);
		rootDir.add(temDir);
		rootDir.add(usrDir);

		binDir.add(new File("vi", 1000));
		binDir.add(new File("latex", 2000));

		rootDir.printList();

		System.out.println();

		System.out.println("Making user entries");
		Directory Kim = new Directory("Kim");
		Directory Lee = new Directory("Lee");
		Directory Park = new Directory("Park");

		usrDir.add(Kim);
		usrDir.add(Lee);
		usrDir.add(Park);

		Kim.add(new File("diary.html", 100));
		Kim.add(new File("composite.java", 200));

		Lee.add(new File("memo.txt", 100));

		Park.add(new File("game.doc", 100));
		Park.add(new File("junk.mail", 100));

		rootDir.printList();
	}
}
