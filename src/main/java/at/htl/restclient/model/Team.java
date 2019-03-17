package at.htl.restclient.model;

import java.util.Objects;

public class Team {

    private int id;
    private String name;
    private String shortName;
    private String iconUrl;

    //region constructors
    public Team() {
    }

    public Team(int id, String name, String shortName, String iconUrl) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.iconUrl = iconUrl;
    }

//endregion

    //region getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return id == team.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + ": " + shortName;
    }
}
