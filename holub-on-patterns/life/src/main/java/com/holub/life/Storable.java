package com.holub.life;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Storable {

	void load(InputStream in) throws IOException;

	void flush(OutputStream out) throws IOException;
}
