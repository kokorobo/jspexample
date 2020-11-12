package members;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private String url="jdbc:oracle:thin:@192.168.0.46:1521:xe"; 
	private String user="java",pwd="1234";
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			
		}	
	}
	public ArrayList<MemberDTO> memberList() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			String sql = "select * from members";
			con = DriverManager.getConnection(url,user,pwd);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				MemberDTO d = new MemberDTO();
				d.setId(rs.getString("id"));
				d.setPwd(rs.getString("pwd"));
				d.setName(rs.getString("name"));
				d.setAdd(rs.getString("addr"));
				d.setTel(rs.getString("tel"));
				list.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
