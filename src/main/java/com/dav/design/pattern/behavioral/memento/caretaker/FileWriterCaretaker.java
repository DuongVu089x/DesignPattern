package com.dav.design.pattern.behavioral.memento.caretaker;

import com.dav.design.pattern.behavioral.memento.originator.FileWriterUtil;

public class FileWriterCaretaker {
	private Object obj;

	public void save(FileWriterUtil fileWriter) {
		this.obj = fileWriter.save();
	}

	public void undo(FileWriterUtil fileWriter) {
		fileWriter.undoToLastSave(obj);
	}
}
