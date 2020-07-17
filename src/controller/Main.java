package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;

public class Main{
	
	public static void main(String args[]) throws Exception
	{
		SkillDAO skilldao = new SkillDAO();    
		PlayerDAO playerdao =  new PlayerDAO();
		System.out.println("List of all player and their skill");
		List<Player> list=new ArrayList<Player>();
		list = playerdao.getAllPlayers();
		System.out.println("Id"+"     "+"Name"+"     "+"Country"+"     "+"Skill");
		System.out.println();
		
		for(Player p:list)
		{
			System.out.println(p.getPlayerId()+"     "+p.getName()+"     "+p.getCountry()+"     "+p.getSkill().getSkillName());
			
		}
		
	}
}
