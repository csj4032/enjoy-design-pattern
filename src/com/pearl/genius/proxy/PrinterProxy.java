package com.pearl.genius.proxy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class PrinterProxy implements Printable {

	private String name;
	private Printer real;

	public PrinterProxy() {
		CompletableFuture completableFuture = new CompletableFuture();
	}

	public PrinterProxy(String name) {
		this.name = name;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}

	private synchronized void realize() {
		if (real == null) {
			real = new Printer(name);
		}
	}
}
