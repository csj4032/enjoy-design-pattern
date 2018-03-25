package com.pearl.genius.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 그릇과 내용물을 동일시해서 재귀적인 구조를 만들기 위한 디자인 패턴
 *
 * 전체-부분의 관계를 갖는 객체들 사이의 관계를 정의할 때 유용하다.
 * 그리고 클라이언트는 전체와 부분을 구분하지않고 동일한 인터페이스를 사용할 수 있다.
 *
 * 객체들의 관계를 트리 구조로 구성하여 부분-전체 계층을 표현하는 패턴으로,
 * 사용자가 단일 객체와 복합 객체 모두 동일하게 다루도록 한다.
 */

/**
ID	PARENT_ID	NAME
1	NULL		원더배송
2	1			식품
3	1			생활
4	NULL		패션
5	4			여성의류
**/

class Menu {
	public Menu(long id, long parentId, String name) {
		this.id = id;
		this.parentId = parentId;
		this.name = name;
	}

	private long id;
	private long parentId;
	private String name;
}

public class CompositeTest {

	@Test
	public void compositeTest() {

		List<Menu> menus= new ArrayList();
		menus.add(new Menu());
		menus.add(new Menu());
		menus.add(new Menu());
		menus.add(new Menu());
		menus.add(new Menu());

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
