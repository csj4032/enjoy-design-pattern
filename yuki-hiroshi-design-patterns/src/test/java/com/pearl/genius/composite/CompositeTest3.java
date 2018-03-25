package com.pearl.genius.composite;

import com.pearl.genius.composite.example03.LetterComposite;
import com.pearl.genius.composite.example03.Messenger;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class CompositeTest3 {

	@Test
	public void compositeTest() {
		log.info("Message from the orcs: ");
		LetterComposite orcMessage = new Messenger().messageFormOrcs();
		orcMessage.print();

		log.info("Message from the elves: ");
		LetterComposite elvesMessage = new Messenger().messageFromElves();
		elvesMessage.print();
	}
}