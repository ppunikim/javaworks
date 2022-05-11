package com.callor.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.model.StudentVO;

public class StudentDao {
	
	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}//end 기본생성자
	
	public List<StudentVO> selectAll() throws SQLException {
		String sql = "SELECT * FROM tbl_student ";
		PreparedStatement pStr = null;
		
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
		
		while(rSet.next()) {
			
			
			StudentVO stVO = new StudentVO (
					rSet.getString("st_num"),
					rSet.getString("st_name"),
					rSet.getString("st_tel"),
					rSet.getString("st_addr"),
					rSet.getString("st_dept"),
					rSet.getInt("st_grade")
					);  // 순서 맞추고, 없는 코드가 없으면 안된다.
			
			StudentVO stVO1 = new StudentVO ();
					stVO1.setStNum(rSet.getString("st_num"));
					stVO1.setStName(rSet.getString("st_name"));
					stVO1.setStTel(rSet.getString("st_tel"));
					stVO1.setStAddr(rSet.getString("st_addr"));
					stVO1.setStDept(rSet.getString("st_dept"));
					stVO1.setStGrade(rSet.getInt("st_grade"));
					
			StudentVO stVO2 = StudentVO.builder()
										 .stNum(rSet.getString("st_num"))
										 .stName(rSet.getString("st_name"))
										 .stTel(rSet.getString("st_tel"))
										 .build();  // 3개만 골라와도 오류가 나지 않게 만들어 주는 것이다.
										 
			
		}
		
	}
	
	

}//end class
