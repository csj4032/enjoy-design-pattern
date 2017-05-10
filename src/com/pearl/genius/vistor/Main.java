package com.pearl.genius.vistor;

public class Main {

	public static void main(String[] args) {
		Directory rootDir = new Directory("root");
		Directory binDir = new Directory("bin");
		Directory tmpDir = new Directory("tmp");

		rootDir.add(binDir);
		rootDir.add(tmpDir);

		binDir.add(new File("vi", 1000));
		binDir.add(new File("scala", 1000));
		binDir.add(new File("java", 1000));

		tmpDir.add(new File("t1.txt", 2000));
		tmpDir.add(new File("t2.txt", 3000));
		tmpDir.add(new File("t3.txt", 4000));

		rootDir.accept(new ListVisitor());
	}
}