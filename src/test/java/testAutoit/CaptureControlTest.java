package testAutoit;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import autoit.robot.JAutoIt;


public class CaptureControlTest {

	private final Logger log = LoggerFactory.getLogger(CaptureControlTest.class);
	
	@Test 
	public void testControlById(){
		log.info(">>testControlById");
		JAutoIt autoit = JAutoIt.getInstance();
		//autoit.setControlText("TfConfig", 395034L, "\"Que ñoño pedoooo ó\"");
		autoit.getControl().setControlText("Notepad", "Edit1", "Ñúñólol");		
		autoit.getControl().getControlText("Notepad", 15L);
		//autoit.getControlText("TfConfig", "TEdit1");
	}
}
