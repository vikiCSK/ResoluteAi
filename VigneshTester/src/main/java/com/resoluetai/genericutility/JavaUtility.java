package com.resoluetai.genericutility;

import java.time.LocalDateTime;

public class JavaUtility {

	public String localDateTime() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
}
