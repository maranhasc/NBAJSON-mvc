package view;

import handler.WebHandler;
import model.Team;

public class Sketch {
	public static void main(String[] args) {
		WebHandler webHandler = new WebHandler("http://www.ies-azarquiel.es/paco/apinba/teams");
		Team[] teams = webHandler.getTeams();
		for (Team team : teams) {
			System.out.println(team);
		}
	}
}
