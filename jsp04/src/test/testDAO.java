package test;

import java.util.ArrayList;

public class testDAO {
	public int userChk(String id, String pwd) {
		System.out.println("id: " +id);
		System.out.println("pwd: " +pwd);
		return 0;
	}
	public testDTO getUser(String id) {
		System.out.println("userId : "+id);
		testDTO dto = new testDTO();
		dto.setName("홍길동");dto.setAddr("산골");
		return dto;
	}
	public ArrayList<testDTO> list(){
		ArrayList<testDTO> li = new ArrayList<testDTO>();
		for(int i=0; i<5 ; i++) {
			testDTO dto = new testDTO();
			dto.setName(i+"홍길동");dto.setAddr(i+"산골짜기");
			li.add(dto);
			}
		return li;
	}
	
}
