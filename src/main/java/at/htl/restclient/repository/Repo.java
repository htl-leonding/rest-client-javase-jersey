package at.htl.restclient.repository;

import at.htl.restclient.model.Match;
import at.htl.restclient.model.Team;

import java.util.*;

public class Repo {

  private static final Repo INSTANCE = new Repo();

  Set<Team> teams = new HashSet<>();
  List<Match> matches = new LinkedList<>();


  public static Repo getInstance() {
    return INSTANCE;
  }

  private Repo() {
  }

  public void addTeam(Team t) {
    teams.add(t);
  }

  public int countTeams() {
    return teams.size();
  }

  public Set<Team> getAllTeams() {
    return Collections.unmodifiableSet(teams);
  }

  public String toStringTeams() {
    return teams.toString();
  }
}
