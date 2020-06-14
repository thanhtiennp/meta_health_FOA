package bean;

import java.sql.Date;

public class ThongTin {
	private int id;
	private String ten;
	private String ho;
	private String diachi;
	private Date 	ngaythang;
	public ThongTin() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public Date getNgaythang() {
		return ngaythang;
	}
	public void setNgaythang(Date ngaythang) {
		this.ngaythang = ngaythang;
	}
}
