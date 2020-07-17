package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public Skill getSkillBylD(Long id)  throws Exception  {
		
		ConnectionManager con = new ConnectionManager();
	 
		Statement st=  con.getConnection().createStatement();
		
		ResultSet rs = st.executeQuery("select * from skill1");
		Skill skill = new Skill(id, null);
		
		while(rs.next())
		{
			long id1=rs.getLong(1);
			String name=rs.getString(2);
			
			skill.setSkillId(id1);
			skill.setSkillName(name);
			
		}
	
	return skill;
	}
}
