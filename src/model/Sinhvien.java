package model;

public class Sinhvien extends Lop{

	private String IDsinhvien;
	private String Hoten;
	private String Hedaotao;
	private String Ngaysinh;
	private String Diachi;
	private String Gioitinh;
	private String Sdt;

	public String getIDsinhvien() {
		return IDsinhvien;
	}

	public void setIDsinhvien(String iDsinhvien) {
		IDsinhvien = iDsinhvien;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public String getHedaotao() {
		return Hedaotao;
	}

	public void setHedaotao(String hedaotao) {
		Hedaotao = hedaotao;
	}

	public String getNgaysinh() {
		return Ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		Ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return Diachi;
	}

	public void setDiachi(String diachi) {
		Diachi = diachi;
	}

	public String getGioitinh() {
		return Gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		Gioitinh = gioitinh;
	}

	public String getSdt() {
		return Sdt;
	}

	public void setSdt(String sdt) {
		Sdt = sdt;
	}

	public Sinhvien(String iDsinhvien, String hoten,String hedaotao, String ngaysinh,
			String diachi, String gioitinh, String sdt) {
		super();
		IDsinhvien = iDsinhvien;
		Hoten = hoten;
		Hedaotao = hedaotao;
		Ngaysinh = ngaysinh;
		Diachi = diachi;
		Gioitinh = gioitinh;
		Sdt = sdt;
	}

	public Sinhvien() {
		super();
		// TODO Auto-generated constructor stub
	}

}
