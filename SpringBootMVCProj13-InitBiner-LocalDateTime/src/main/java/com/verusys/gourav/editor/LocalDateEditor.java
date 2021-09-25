package com.verusys.gourav.editor;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;

public class LocalDateEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		//split date formate(yyyy-MM-dd)
		String dateContent[]=text.split("-");
		int year=Integer.parseInt(dateContent[0]);
		int month=Integer.parseInt(dateContent[1]);
		int day=Integer.parseInt(dateContent[2]);
		LocalDate ld=LocalDate.of(year, month, day);
		setValue(ld);
	}
}
