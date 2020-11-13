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
	public MemberDTO memberList(String name) {
		MemberDTO d = new MemberDTO();
		try {
			String sql = "select * from members where name=?";
			con = DriverManager.getConnection(url,user,pwd);
			ps = con.prepareStatement(sql);
			ps.setString(1,name);
			rs = ps.executeQuery();
			while(rs.next()){
				
				d.setId(rs.getString("id"));
				d.setPwd(rs.getString("pwd"));
				d.setName(rs.getString("name"));
				d.setAdd(rs.getString("addr"));
				d.setTel(rs.getString("tel"));
				return d;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;

	}public void register(String id,String name, String pw, String add, String tel) {
		String sql ="INSERT INTO members VALUES (?, ? ,? ,? ,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,id);
			ps.setString(2,name);
			ps.setString(3,pw);
			ps.setString(4,add);
			ps.setString(5,tel);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}public String memberChk(String id) {
		String id2 = null;
		try {
			String sql ="select id from members where id = ?";
			con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				id2 = rs.getString("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id2;
		
	}public MemberDTO memberList2(String id) {
		MemberDTO d = new MemberDTO();
		try {
			String sql = "select * from members where id=?";
			con = DriverManager.getConnection(url,user,pwd);
			ps = con.prepareStatement(sql);
			ps.setString(1,id);
			rs = ps.executeQuery();
			while(rs.next()){
				d.setId(rs.getString("id"));
				d.setPwd(rs.getString("pwd"));
				d.setName(rs.getString("name"));
				d.setAdd(rs.getString("addr"));
				d.setTel(rs.getString("tel"));
				return d;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;

	}
	public boolean modifyed(String id,String name,String add,String tel) {
		String sql = "update members set name=?,addr=?,tel=? where id=?";
		try {
			con = DriverManager.getConnection(url,user,pwd);
			ps = con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,add);
			ps.setString(3,tel);
			ps.setString(4,id);
			ps.execute();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean delete(String id) {
		String sql = "delete from members where id=?";
		try {
			con = DriverManager.getConnection(url,user,pwd);
			ps = con.prepareStatement(sql);
			ps.setString(1,id);
			ps.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
