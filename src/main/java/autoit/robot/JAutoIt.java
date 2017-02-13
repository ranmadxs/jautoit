package autoit.robot;

public class JAutoIt extends AutoItExecute{

	
	private AutoItControl control = null;
	private static JAutoIt self = null;
	
	/**
	 * 
	 * @param clase Nombre de la clase
	 * @param id ObjectID
	 * @return String
	 */
	public String getControlText(String clase, Long id) {
		String cmdName = "getControlText";
		String path = "\"E:\\trabajos\\autoit\\src\\main\\resources\\autoit\\";
		String param = null;
		if (id != null){
			param = clase.concat(" ").concat(String.valueOf(id));
		}
		String text = super.execute(cmdName, path, param);
		return text;
	}
	public void setControlText(String clase, Long id, String txt) {
		String cmdName = "setControlText";
		String path = "\"E:\\trabajos\\autoit\\src\\main\\resources\\autoit\\";
		String param = null;
		if (id != null){
			param = clase.concat(" ").concat(String.valueOf(id)).concat(" ").concat(txt);
		}
		super.execute(cmdName, path, param);		
	}	
	/**
	 * 
	 * @param clase Nombre de la clase
	 * @param classNameNN
	 * @return String
	 */
	public void setControlText(String clase, String classNameNN, String txt) {
		String cmdName = "setControlText";
		String path = "\"E:\\trabajos\\autoit\\src\\main\\resources\\autoit\\";
		String param = null;
		if (classNameNN != null){
			param = clase.concat(" ").concat(String.valueOf(classNameNN).concat(" ").concat(txt));
		}
		super.execute(cmdName, path, param);
	}	
	
	/**
	 * 
	 * @param clase Nombre de la clase
	 * @param classNameNN
	 * @return String
	 */
	public String getControlText(String clase, String classNameNN) {
		String cmdName = "getControlText";
		String path = "\"E:\\trabajos\\autoit\\src\\main\\resources\\autoit\\";
		String param = null;
		if (classNameNN != null){
			param = clase.concat(" ").concat(String.valueOf(classNameNN));
		}
		String text = super.execute(cmdName, path, param);
		return text;
	}
	
	public static JAutoIt getInstance(){
		if(self == null){
			self = new JAutoIt();
			self.control = new AutoItControl();
		}
		return self;
	}

	public AutoItControl getControl() {
		return control;
	}

	public void setControl(AutoItControl control) {
		this.control = control;
	}
	
	
	
	
}
