package model;

public class Lop extends Khoa{

	private String IDlop;
	private String Tenlop;
	private String Khoahoc;

	public String getIDlop() {
		return IDlop;
	}

	public void setIDlop(String iDlop) {
		IDlop = iDlop;
	}

	public String getTenlop() {
		return Tenlop;
	}

	public void setTenlop(String tenlop) {
		Tenlop = tenlop;
	}

	public String getKhoahoc() {
		return Khoahoc;
	}

	public void setKhoahoc(String khoahoc) {
		Khoahoc = khoahoc;
	}

	public Lop(String iDlop, String tenlop, String khoahoc) {
		super();
		IDlop = iDlop;
		Tenlop = tenlop;
		Khoahoc = khoahoc;
	}

	public Lop() {
		super();
		// TODO Auto-generated constructor stub
	}

}
