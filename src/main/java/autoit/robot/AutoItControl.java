package autoit.robot;

import java.awt.Point;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoItControl extends AutoItExecute{

	private final Logger log = LoggerFactory.getLogger(AutoItControl.class);
	
	private String clase;
	private Long instance;
	private String classNameNN;
	private String name;
	private String advancedMode;
	private Long id;
	private Point point;
	private String text;

	
	
	/**
	 * 
	 * @param clase Nombre de la clase
	 * @param id ObjectID
	 * @return String
	 */
	public String getControlText(String clase, Long id) {
		String cmdName = "getControlText";
		String param = null;
		if (id != null){
			param = clase.concat(" ").concat(String.valueOf(id));
		}
		String text = super.execute(cmdName, param);
		return text;
	}
	
	public void setControlText(String clase, Long id, String txt) {
		String cmdName = "setControlText";
		String param = null;
		if (id != null){
			param = clase.concat(" ").concat(String.valueOf(id)).concat(" ").concat(txt);
		}
		super.execute(cmdName, param);		
	}	
	/**
	 * 
	 * @param clase Nombre de la clase
	 * @param classNameNN
	 * @return String
	 */
	public void setControlText(String clase, String classNameNN, String txt) {
		String cmdName = "setControlText";
		String param = null;
		if (classNameNN != null){
			param = clase.concat(" ").concat(String.valueOf(classNameNN).concat(" ").concat(txt));
		}
		//path = path.concat("tmp\\au3\\");
		super.execute(cmdName, param);
	}	
	
	/**
	 * 
	 * @param clase Nombre de la clase
	 * @param classNameNN
	 * @return String
	 */
	public String getControlText(String clase, String classNameNN) {
		String cmdName = "getControlText";
		String param = null;
		if (classNameNN != null){
			param = clase.concat(" ").concat(String.valueOf(classNameNN));
		}
		String text = super.execute(cmdName, param);
		return text;
	}	
		
}