
<%@page import="java.util.ArrayList"%>
<%@page import="bean.ThongTin"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<style type="text/css">
				body {
					background-color: pink;
					
				}

				.wrap {
				  width: 800px;
				}
				.wrap table {
				  table-layout: fixed;
				  width: 100%;
				}
				.wrap table.head {
				  width: calc(100% - 15px);
				}
				.wrap table.head tr td {
				  background: #eee;
				}
				
				table tr  {
				  border: 1px ;
				
				  word-wrap: break-word;
				}
				tr
				{
				width:100px;
				}
				th {
				width:100px;
				background-color:#0B0B61;
				color: white;
				}
				tr:nth-child(even){background-color: #BDBDBD;}
				tr:nth-child(odd){background-color: white;}
				
				.scroll-table {
				  height: 300px;
				  overflow-y: auto;
				}
				input{
					margin-left: 120px;
				}
				table {
					text-align: center;
				}
	
}

</style>

<body>


<script>
  function validateForm() {
      var uname=document.getElementById("uname").value;
      if (uname==""){
          alert("Username is obligatory");
          return false;
      }
  }
</script>

	<div class="wrap">
	
	
<form action="servlet" method="post" onSubmit="return validateForm()">

	<select name="cars" id="cars">
		  <option value="volvo">2014</option>
		  <option value="saab">Saab</option>
		  <option value="mercedes">Mercedes</option>
		  <option value="audi">Audi</option>
	</select>
	<label for="cars">Nam</label>
	
	<select name="cars" id="cars">
		  <option value="volvo">5</option>
		  <option value="saab">Saab</option>
		  <option value="mercedes">Mercedes</option>
		  <option value="audi">Audi</option>
	</select>
	<label for="cars">Thang</label>
	<u>Next</u>
	1/20
	<u>Pre</u>
	

		
		<input type="text" placeholder="Username" id="uname" name="page">
  		<input type="submit" id="check" value="OK">

</form>

	
  <table class="head">
  
    
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Ho</th>
        <th>DiaChi</th>
        <th>DiaChi</th>
        <th>DiaChi</th>
        <th>NgayThang</th>
      </tr>
   
  </table>
  <div class="scroll-table">
    <table>
     
				 <% 
				 ArrayList<ThongTin> arrayList= new ArrayList<ThongTin>();
				
				 arrayList=(ArrayList<ThongTin>) request.getAttribute("thongtin");
				 for(ThongTin tt : arrayList)
				 {	
					 out.print("<tr>");
					   
					   
					    
					    out.print("<td>");
					    out.print(tt.getId());
					    out.print("</td>");
					    
					    out.print("<td>");
					    out.print(tt.getTen());
					    out.print("</td>");
					    
					    out.print("<td>");
					    out.print(tt.getHo());
					    out.print("</td>");
					    
					    out.print("<td>");
					    out.print(tt.getDiachi());
					    out.print("</td>");
					    
					    out.print("<td>");
					    out.print(tt.getDiachi());
					    out.print("</td>");
					    
					    out.print("<td>");
					    out.print(tt.getDiachi());
					    out.print("</td>");
					    
					    out.print("<td>");
					    out.print(tt.getNgaythang());
					    out.print("</td>");
					   
					 out.print("</tr>");
					
				 }
				 %> 
 
  </table>
  </div>
</div> 



</body>
</html>