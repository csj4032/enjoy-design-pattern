package com.holub.tools;

import java.util.NoSuchElementException;

public class Publisher {

	public interface Distributor {
		void deliverTo(Object subscriber);
	}

	private class Node {
		public final Object subscriber;
		public final Node next;

		private Node(Object subscriber, Node next) {
			this.subscriber = subscriber;
			this.next = next;
		}

		public Node remove(Object target) {
			if (target == subscriber) return next;

			if (next == null) throw new NoSuchElementException(target.toString());

			return new Node(subscriber, next.remove(target));
		}
	}
}
