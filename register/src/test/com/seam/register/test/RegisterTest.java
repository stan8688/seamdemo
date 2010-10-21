package com.seam.register.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class RegisterTest extends SeamTest {

	@Test
	public void test_register() throws Exception {
		new FacesRequest("/register.xhtml") {
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{register.register}");
			}
		}.run();
	}
}
