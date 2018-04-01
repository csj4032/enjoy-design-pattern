package com.pearl.genius.visitor;

import com.pearl.genius.vistor.Directory;
import com.pearl.genius.vistor.File;
import com.pearl.genius.vistor.ListVisitor;
import org.junit.Test;

/**
 * 처리를 데이터 구조에서 분리하는 일
 * Double Dispatch
 * Receiver Parameter
 * Open-Closed Principle
 */
public class VisitorTest {

	@Test
	public void visitorTest() {
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
