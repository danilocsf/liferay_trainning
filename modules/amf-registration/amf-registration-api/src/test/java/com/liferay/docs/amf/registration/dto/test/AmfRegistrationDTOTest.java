package com.liferay.docs.amf.registration.dto.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.liferay.docs.amf.registration.dto.AmfRegistrationDTO;

public class AmfRegistrationDTOTest {
	
	private AmfRegistrationDTO dto;

	@Before
	public void setUp() {
		dto = new AmfRegistrationDTO();
	}
	
	@Test
	public void testGetLastNameInitial() {
		dto.setLastName("Smith");
		Assert.assertEquals("S.", dto.getLastNameInitial());
	}

}
