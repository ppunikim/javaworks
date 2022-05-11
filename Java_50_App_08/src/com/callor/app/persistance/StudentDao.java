package com.callor.app.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.dbconfig.DBContract;
import com.callor.app.model.StudentVO;

public class StudentDao {
	
	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}//end 기본 생성자
	
	public List<StudentVO> selectAll() throws SQLException{
		PreparedStatement pStr = null;
		String sql = DBContract.ST_SELECT;
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		return getResult(rSet);
		
	}//end selectAll
	
	private List<StudentVO> getResult(ResultSet rSet) throws SQLException {
		
		List<StudentVO> stList = new ArrayList<>();
		while(rSet.next()) {
			StudentVO stVO = StudentVO.builder()
									  .stNum(rSet.getString(DBContract.ST_COL.ST_NUM))
									  .stName(rSet.getString(DBContract.ST_COL.ST_NAME))
									  .stDept(rSet.getString(DBContract.ST_COL.ST_DEPT))
									  .stGrade(rSet.getInt(DBContract.ST_COL.ST_GRADE))
									  .stAddr(rSet.getString(DBContract.ST_COL.ST_ADDR))
									  .stTel(rSet.getString(DBContract.ST_COL.ST_TEL))
									  .build();
			stList.add(stVO);
		}
		return stList;
	}
	
	
}//end class
