package model;

import com.google.gson.annotations.SerializedName;

public class Team {
	private String id;
	private String name;
	private String conference;
	private String record;
	@SerializedName("teamLogoUrl")
	private String url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", conference=" + conference + ", record=" + record + ", url="
				+ url + "]";
	}
}
