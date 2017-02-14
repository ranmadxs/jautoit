package autoit.robot;


public class JAutoIt extends AutoItExecute{
	
	private AutoItControl control = null;
	private static JAutoIt self = null;	
	
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
	
	public JAutoIt() {
		super();
	}	
	
}
