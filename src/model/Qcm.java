package model;

public class Qcm {
	private int id;
	private int timer;
	private Test test;
	
	public Qcm(int id, int timer, Test test) {
		super();
		this.id = id;
		this.timer = timer;
		this.test = test;
	}
	
	
	public Qcm(int timer, Test test) {
		super();
		this.timer = timer;
		this.test = test;
	}
	
	public Qcm() {
		super();
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
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
	
	
}
