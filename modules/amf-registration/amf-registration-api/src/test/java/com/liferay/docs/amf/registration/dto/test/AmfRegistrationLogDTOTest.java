package com.liferay.docs.amf.registration.dto.test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;
import com.liferay.docs.amf.registration.dto.AmfRegistrationLogDTO;

public class AmfRegistrationLogDTOTest {

	private AmfRegistrationLogDTO dto;

	@Before
	public void setUp() {
		dto = new AmfRegistrationLogDTO();
	}
	
	@Test
	public void testGetFormattedDateTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2018, 4, 10, 10, 20, 0);
		dto.setDateTime(calendar.getTime());
		Assert.assertEquals("2018-05-10 10:20:00", dto.getFormattedDateTime());
	}

}
