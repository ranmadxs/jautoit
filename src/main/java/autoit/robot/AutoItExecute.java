package autoit.robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import autoit.test.CaptureControlTest;

public class AutoItExecute {
	
	private final Logger log = LoggerFactory.getLogger(AutoItExecute.class);

	private Boolean compile = Boolean.TRUE;
	
	protected String execute(String cmdName, String path, String params) {
		String response = null;
		Process pr = null;
		try {
			// Execute command
			String script = path.concat(cmdName.concat(".au3")).concat("\" /console");
			String fullComand = "Aut2exe.exe /in " + script;
			log.info(fullComand);
			String command = "cmd /c " + fullComand;
			if(compile){
				pr = Runtime.getRuntime().exec(command);
				Thread.sleep(400);
			}
			if (params == null){
				params = "";
			}			
			
			String program = path.concat(cmdName.concat(".exe")).concat("\" ").concat(params);
			log.info(program);			
			pr = Runtime.getRuntime().exec(program);
			
			BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream(), "Cp1252"));
			String line = null;
			response = "";
			while ((line = input.readLine()) != null)
				response += line;
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info(response);
		return response;
	}

}
