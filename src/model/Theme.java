package model;

public class Theme {
	private int id;
	private int timer;
	private Qcm qcm;
	public Theme(int id, int timer, Qcm qcm) {
		super();
		this.id = id;
		this.timer = timer;
		this.qcm = qcm;
	}
	public Theme() {
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
	public Qcm getQcm() {
		return qcm;
	}
	public void setQcm(Qcm qcm) {
		this.qcm = qcm;
	}
	public Theme(int timer, Qcm qcm) {
		super();
		this.timer = timer;
		this.qcm = qcm;
	}
	
	
}
