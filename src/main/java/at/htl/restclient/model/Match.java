package at.htl.restclient.model;

import java.time.LocalDateTime;

public class Match {

    private int matchId;
    private LocalDateTime matchDatetime;
    private Team team1;
    private Team team2;

    //region constructors
    public Match() {
    }

    public Match(int matchId, LocalDateTime matchDatetime, Team team1, Team team2) {
        this.matchId = matchId;
        this.matchDatetime = matchDatetime;
        this.team1 = team1;
        this.team2 = team2;
    }
    //endregion

    //region getter and setter
    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public LocalDateTime getMatchDatetime() {
        return matchDatetime;
    }

    public void setMatchDatetime(LocalDateTime matchDatetime) {
        this.matchDatetime = matchDatetime;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }
    //endregion


    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", matchDatetime=" + matchDatetime +
                ", team1=" + team1 +
                ", team2=" + team2 +
                '}';
    }
}
