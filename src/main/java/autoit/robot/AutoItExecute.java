package autoit.robot;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoItExecute {
	
	private final Logger log = LoggerFactory.getLogger(AutoItExecute.class);

	private Boolean compile = Boolean.TRUE;
	private String compileFolder;		
	private String srcFolder;
	
	protected ResourceBundle rb;


	public AutoItExecute() {
		super();
		this.rb = ResourceBundle.getBundle("bot");
		this.compileFolder = rb.getString("autoit.compileFolder");
		this.srcFolder = rb.getString("autoit.srcFolder");
	}
	
	protected String execute(String cmdName, String params) {
		String response = null;
		Process pr = null;
		try {
			//Se obtiene del classpath
			String scriptBase ="";
			String scriptSalida = "";
			
			scriptBase = this.srcFolder.concat(File.separator.concat(cmdName.concat(".au3")));
			
			String carpetaDestinoExe = this.compileFolder;
			File folderDestinoExe = new File(carpetaDestinoExe);
			if (!folderDestinoExe.exists()) {
				folderDestinoExe.mkdirs();
			}
			
	        scriptSalida = carpetaDestinoExe.concat(File.separator.concat(cmdName.concat(".exe")));
	       
			String fullComand = "Aut2exe.exe /in \"" + scriptBase + "\" /out \"" + scriptSalida + "\"".concat(" /console");
			
			log.info(fullComand);
			String command = "cmd /c " + fullComand;
			if(compile){
				// Compila command au3 y lo deja en la ruta \tmp\au3\
				pr = Runtime.getRuntime().exec(command);
				//Thread.sleep(1000);
				int status = pr.waitFor();
				log.info("Compile [" + status + "]");
			}
			if (params == null){
				params = "";
			}			
			
			// Execute exe de la ruta:  \tmp\au3
			//String program = path.concat(cmdName.concat(".exe")).concat("\" ").concat(params);
			String program = "\""+scriptSalida.concat("\" ").concat(params);
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
