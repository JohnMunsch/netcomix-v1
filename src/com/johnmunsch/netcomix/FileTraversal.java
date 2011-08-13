package com.johnmunsch.netcomix;
import java.io.File;
import java.io.IOException;

/**
 * Subclass this to provide functional implementations for the onDirectory() 
 * and/or onFile() functions. They will then be called as the traverse function
 * works its way down through a hierarchy of files and directories starting from
 * the supplied point.
 */
public class FileTraversal {
	/**
	 * Initiates the traversal of a file (which you would probably seldom call
	 * this with a single file specified) or a directory hierarchy.
	 * 
	 * @param f Either a single file or a directory (which will be drilled down
	 * through and onDirectory() and onFile() functions called as appropriate.
	 * 
	 * @throws IOException
	 */
	public final void traverse(final File f) throws IOException {
		if (f.isDirectory()) {
			onDirectory(f);
			final File[] childs = f.listFiles();
			for (File child : childs) {
				traverse(child);
			}
			return;
		}
		onFile(f);
	}

	public void onDirectory(final File d) {
	}

	public void onFile(final File f) {
	}
}