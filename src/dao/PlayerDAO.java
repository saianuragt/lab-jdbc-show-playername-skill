package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO{
	public List< Player > getAllPlayers() throws Exception {
		
		List<Player> list=new ArrayList<Player>();
		ConnectionManager con = new ConnectionManager();
		Statement st=  con.getConnection().createStatement();
		Skill skill = null;
		ResultSet rs =st.executeQuery("select * from player1");
		while(rs.next())
	    {			
			long playerid = rs.getLong(1);
			
			String playerName = rs.getString(2);
			
			String playerCountry = rs.getString(3);	
			
			long skillid = skill.getSkillId();
			
			String skillName = skill.getSkillName();
			
			skill = new Skill(skillid,skillName);
			
			Player player = new Player(playerid,playerName,playerCountry,skill);
			
			list.add(player);  
	    }
		return list;
		
	}
}
