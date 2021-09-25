package com.verusys.gourav.editor;

import java.beans.PropertyEditorSupport;
import java.time.LocalTime;

public class LocalTimeEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		//split date formate(yyyy-MM-dd)
		String timeContent[]=text.split(":");
		int hour=Integer.parseInt(timeContent[0]);
		int minute=Integer.parseInt(timeContent[1]);
		LocalTime lt=LocalTime.of(hour, minute);
		setValue(lt);
	}
}
