package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import bean.ThongTin;
import connect.Database;

public class ThongTinDAO {
	
	Database db;
	
	Connection conn;
	
	public ArrayList<ThongTin> getThongTin(int frist, int end){
		 db= new Database();
		 conn=db.moKetNoi();
	ArrayList<ThongTin>	arrayListBN= new ArrayList<ThongTin>();
	 String sql="SELECT * FROM "
	 		+ "( SELECT *, ROW_NUMBER() OVER (ORDER BY id) AS RowNum  FROM thongtin1)"
	 		+ " AS MyDerivedTable WHERE MyDerivedTable.RowNum BETWEEN "+frist+" AND "+end+";";
	 
	 try {
		 PreparedStatement ps = conn.prepareCall(sql);
         ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			ThongTin bn= new ThongTin();
			bn.setId(rs.getInt("id"));
			bn.setTen(rs.getString("ten"));
			bn.setHo(rs.getString("ho"));
			bn.setDiachi(rs.getString("dia chi"));
			bn.setNgaythang(rs.getDate("ngaythang"));
            arrayListBN.add(bn);
        }
		 return arrayListBN;
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	 return null;
	 	
	}
	
	
		
	public ArrayList<ThongTin> getSoHang(){
			 db= new Database();
			 conn=db.moKetNoi();
		ArrayList<ThongTin>	arrayListBN= new ArrayList<ThongTin>();
		 String sql="select COUNT(*) from thongtin1 ";
		 
		 try {
			 PreparedStatement ps = conn.prepareCall(sql);
	         ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ThongTin bn= new ThongTin();
				bn.setId(rs.getInt("id"));
	            arrayListBN.add(bn);
	        }
			 return arrayListBN;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		 return null;
		
	}
//	public int sotrang(ArrayList<BenhNhan> arrayList)
//	{
//		arrayList= new ArrayList<BenhNhan>();
//		int sotrang=arrayList.size()/20;
//		return sotrang;
//	}
	public static void main(String args[])
	
	{
		 System.out.println("loi");
		 ThongTinDAO bnd= new ThongTinDAO();
		  System.out.println("loi"); 
		  ArrayList<ThongTin>arrayList =bnd.getThongTin(1,20);
		  
		  System.out.println(arrayList);
		  
		  for(int i=0;i<arrayList.size();i++) {
		 System.out.println(arrayList.get(i).getDiachi()); }
		 
		
		
	}

}
