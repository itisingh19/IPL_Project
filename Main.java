import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {

    private static ArrayList<String> matchId = new ArrayList<String>();
    private static ArrayList<String> teamsPlayed = new ArrayList<String>();
    private static ArrayList<String> season = new ArrayList<String>();
    private static ArrayList<String> winner = new ArrayList<String>();
    int countMatch = 0;
    private static ArrayList<String> matchIdfor2016 = new ArrayList<String>();
    private static LinkedHashMap<String, Integer> extra_runs_by_teams_played_in_2016 = new LinkedHashMap<String, Integer>();
    private static ArrayList<String> teamsPlayedIn2016 = new ArrayList<String>();
    private static List<String> matchIdfor2015 = new ArrayList<String>();
    private static List<String> playersPlayedIn2015 = new ArrayList<String>();
    private static LinkedHashMap<String, Integer> runsBowlerGvaeIn2015 = new LinkedHashMap<String, Integer>();
    private static LinkedHashMap<String, Integer> oversPlayedByEachPlayerIn2015 = new LinkedHashMap<String, Integer>();
    private static LinkedHashMap<String, Integer> moEconomicBowlers = new LinkedHashMap<String, Integer>();
    private static ArrayList<String> tossWinnerDetails = new ArrayList<String>();
    private static LinkedHashMap<String, Integer> noOfTimesEachTeamWonToss = new LinkedHashMap<String, Integer>();

    public static ArrayList<String> getMatchId() {
        return matchId;
    }

    public static LinkedHashMap<String, Integer> getNoOfTimesEachTeamWonToss() {
        return noOfTimesEachTeamWonToss;
    }

    public static void setNoOfTimesEachTeamWonToss(LinkedHashMap<String, Integer> noOfTimesEachTeamWonToss) {
        Main.noOfTimesEachTeamWonToss = noOfTimesEachTeamWonToss;
    }

    public static ArrayList<String> getTossWinnerDetails() {
        return tossWinnerDetails;
    }

    public static void setTossWinnerDetails(ArrayList<String> tossWinnerDetails) {
        Main.tossWinnerDetails = tossWinnerDetails;
    }

    public static LinkedHashMap<String, Integer> getMoEconomicBowlers() {
        return moEconomicBowlers;
    }

    public static void setMoEconomicBowlers(LinkedHashMap<String, Integer> moEconomicBowlers) {
        Main.moEconomicBowlers = moEconomicBowlers;
    }

    public static LinkedHashMap<String, Integer> getOversPlayedByEachPlayerIn2015() {
        return oversPlayedByEachPlayerIn2015;
    }

    public static void setOversPlayedByEachPlayerIn2015(LinkedHashMap<String, Integer> oversPlayedByEachPlayerIn2015) {
        Main.oversPlayedByEachPlayerIn2015 = oversPlayedByEachPlayerIn2015;
    }

    public static LinkedHashMap<String, Integer> getRunsBowlerGvaeIn2015() {
        return runsBowlerGvaeIn2015;
    }

    public static void setRunsBowlerGvaeIn2015(LinkedHashMap<String, Integer> runsBowlerGvaeIn2015) {
        Main.runsBowlerGvaeIn2015 = runsBowlerGvaeIn2015;
    }

    public static List<String> getPlayersPlayedIn2015() {
        return playersPlayedIn2015;
    }

    public static void setPlayersPlayedIn2015(List<String> playersPlayedIn2015) {
        Main.playersPlayedIn2015 = playersPlayedIn2015;
    }

    public static List<String> getMatchIdfor2015() {
        return matchIdfor2015;
    }

    public static void setMatchIdfor2015(List<String> matchIdfor2015) {
        Main.matchIdfor2015 = matchIdfor2015;
    }

    public static ArrayList<String> getTeamsPlayedIn2016() {
        return teamsPlayedIn2016;
    }

    public static void setTeamsPlayedIn2016(ArrayList<String> teamsPlayedIn2016) {
        Main.teamsPlayedIn2016 = teamsPlayedIn2016;
    }

    public static LinkedHashMap<String, Integer> getExtra_runs_by_teams_played_in_2016() {
        return extra_runs_by_teams_played_in_2016;
    }

    public static void setExtra_runs_by_teams_played_in_2016(LinkedHashMap<String, Integer> extra_runs_by_teams_played_in_2016) {
        Main.extra_runs_by_teams_played_in_2016 = extra_runs_by_teams_played_in_2016;
    }

    public static ArrayList<String> getMatchIdfor2016() {
        return matchIdfor2016;
    }

    public static void setMatchIdfor2016(ArrayList<String> matchIdfor2016) {
        Main.matchIdfor2016 = matchIdfor2016;
    }

    public static ArrayList<String> getWinner() {
        return winner;
    }

    public static void setWinner(ArrayList<String> winner) {
        Main.winner = winner;
    }

    public static ArrayList<String> getSeason() {
        return season;
    }

    public static void setSeason(ArrayList<String> season) {
        Main.season = season;
    }

    public static ArrayList<String> getTeamsPlayed() {
        return teamsPlayed;
    }

    public static void setTeamsPlayed(ArrayList<String> teamsPlayed) {
        Main.teamsPlayed = teamsPlayed;
    }

    public static void setMatchId(ArrayList<String> matchId) {
        Main.matchId = matchId;
    }

}
