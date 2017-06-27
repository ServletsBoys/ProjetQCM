package model;

public class Qcm {
	private int id;
	private int timer;
	private Type_test type_test;
	
	public Qcm(int id, int timer, Type_test type_test) {
		super();
		this.id = id;
		this.timer = timer;
		this.type_test = type_test;
	}
	
	
	public Qcm(int timer, Type_test type_test) {
		super();
		this.timer = timer;
		this.type_test = type_test;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTimer() {
		return timer;
	}
	public void setTimer(int timer) {
		this.timer = timer;
	}
	public Type_test getType_test() {
		return type_test;
	}
	public void setType_test(Type_test type_test) {
		this.type_test = type_test;
	}
	
	
	
}
