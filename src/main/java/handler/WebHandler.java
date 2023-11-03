package handler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;

import model.Team;

public class WebHandler {

	private Team[] teams;

	public WebHandler(String urlTxt) {
		try {
			// traer JSON de internet a través de la URL en formato String
			String jsonTxt = IOUtils.toString(new URL(urlTxt), Charset.forName("UTF-8"));
			// serializar
			teams = new Gson().fromJson(jsonTxt, Team[].class);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Team[] getTeams() {
		return teams;
	}
}
