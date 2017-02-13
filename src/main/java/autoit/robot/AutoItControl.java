package autoit.robot;

import java.awt.Point;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import autoit.test.CaptureControlTest;

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
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public Long getInstance() {
		return instance;
	}
	public void setInstance(Long instance) {
		this.instance = instance;
	}
	public String getClassNameNN() {
		return classNameNN;
	}
	public void setClassNameNN(String classNameNN) {
		this.classNameNN = classNameNN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdvancedMode() {
		return advancedMode;
	}
	public void setAdvancedMode(String advancedMode) {
		this.advancedMode = advancedMode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
		
}