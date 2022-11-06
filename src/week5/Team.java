package week5;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private List<Player> players = new ArrayList<Player>();
	private String teamName;
	
	/*
	 * Constructors
	 */
	public Team (String teamName) {
		this.teamName = teamName;
	}
	
	/*
	 * Public methods
	 */
	public void describe () {
		System.out.println(teamName);
		for (Player player : players) {
			player.describe();
		}
	}
	
	public void addPlayer (Player player) {
		players.add(player);
	}
	
	public void removePlayer(String playerName) {
		for (Player player : players) {
			if (player.getName().equals(playerName)) {
				players.remove(player);
			}
		}
	}

	/*
	 * Getters & Setters
	 */
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
	
}
