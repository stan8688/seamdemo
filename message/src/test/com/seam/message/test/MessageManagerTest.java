package com.seam.message.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class MessageManagerTest extends SeamTest {

	@Test
	public void test_messageManager() throws Exception {
		new FacesRequest("/messageManager.xhtml") {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{messageManager.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{messageManager.messageManager}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{messageManager.value}").equals("seam");
			}
		}.run();
	}
}
