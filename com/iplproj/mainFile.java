package com.iplproj;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class mainFile {
    
    private static ArrayList<String> matchId ;
    private static ArrayList<String> teamsPlayed ;
    private static ArrayList<String> season ;
    private static ArrayList<String> winner ;
    public static int countMatch = 0 ;
    private static ArrayList<String> matchIdfor2016 ;
    private static LinkedHashMap<String, Integer> extra_runs_by_teams_played_in_2016 ;
    private static ArrayList<String> teamsPlayedIn2016 ;
    public static List<String> matchIdfor2015 ;
    private static List<String> playersPlayedIn2015 ;
    private static LinkedHashMap<String, Integer> runsBowlerGvaeIn2015 ;
    private static LinkedHashMap<String, Integer> oversPlayedByEachPlayerIn2015 ;
    private static LinkedHashMap<String, Integer> moEconomicBowlers ;
    private static ArrayList<String> tossWinnerDetails ;
    private static LinkedHashMap<String, Integer> noOfTimesEachTeamWonToss ;
    
    
    public static ArrayList<String> getMatchId() {
        return matchId;
    }
    public static void setMatchId(ArrayList<String> matchId) {
        mainFile.matchId = matchId;
    }

    public static LinkedHashMap<String, Integer> getNoOfTimesEachTeamWonToss() {
        return noOfTimesEachTeamWonToss;
    }
    public static void setNoOfTimesEachTeamWonToss(LinkedHashMap<String, Integer> noOfTimesEachTeamWonToss) {
        mainFile.noOfTimesEachTeamWonToss = noOfTimesEachTeamWonToss;
    }

    public static ArrayList<String> getTossWinnerDetails() {
        return tossWinnerDetails;
    }
    public static void setTossWinnerDetails() {
        mainFile.tossWinnerDetails = tossWinnerDetails;
    }

    public static LinkedHashMap<String, Integer> getMoEconomicBowlers() {
        return moEconomicBowlers;
    }
    public static void setMoEconomicBowlers(LinkedHashMap<String, Integer> moEconomicBowlers) {
        mainFile.moEconomicBowlers = moEconomicBowlers;
    }

    public static LinkedHashMap<String, Integer> getOversPlayedByEachPlayerIn2015() {
        return oversPlayedByEachPlayerIn2015;
    }
    public static void setOversPlayedByEachPlayerIn2015(LinkedHashMap<String, Integer> oversPlayedByEachPlayerIn2015) {
        mainFile.oversPlayedByEachPlayerIn2015 = oversPlayedByEachPlayerIn2015;
    }

    public static LinkedHashMap<String, Integer> getRunsBowlerGvaeIn2015() {
        return runsBowlerGvaeIn2015;
    }
    public static void setRunsBowlerGvaeIn2015(LinkedHashMap<String, Integer> runsBowlerGvaeIn2015) {
        mainFile.runsBowlerGvaeIn2015 = runsBowlerGvaeIn2015;
    }

    public static List<String> getPlayersPlayedIn2015() {
        return playersPlayedIn2015;
    }
    public static void setPlayersPlayedIn2015(List<String> playersPlayedIn2015) {
        mainFile.playersPlayedIn2015 = playersPlayedIn2015;
    }

    public static ArrayList<String> getTeamsPlayedIn2016() {
        return teamsPlayedIn2016;
    }
    public static void setTeamsPlayedIn2016(ArrayList<String> teamsPlayedIn2016) {
        mainFile.teamsPlayedIn2016 = teamsPlayedIn2016;
    }

    public static LinkedHashMap<String, Integer> getExtra_runs_by_teams_played_in_2016() {
        return extra_runs_by_teams_played_in_2016;
    }
    public static void setExtra_runs_by_teams_played_in_2016(LinkedHashMap<String, Integer> extra_runs_by_teams_played_in_2016) {
        mainFile.extra_runs_by_teams_played_in_2016 = extra_runs_by_teams_played_in_2016;
    }

    public static ArrayList<String> getMatchIdfor2016() {
        return matchIdfor2016;
    }
    public static void setMatchIdfor2016(ArrayList<String> matchIdfor2016) {
        mainFile.matchIdfor2016 = matchIdfor2016;
    }

    public static ArrayList<String> getWinner() {
        return winner;
    }
    public static void setWinner(ArrayList<String> winner) {
        mainFile.winner = winner;
    }

    public static ArrayList<String> getSeason() {
        return season;
    }
    public static void setSeason(ArrayList<String> season) {
        mainFile.season = season;
    }

    public static ArrayList<String> getTeamsPlayed() {
        return teamsPlayed;
    }
    public static void setTeamsPlayed(ArrayList<String> teamsPlayed) {
        mainFile.teamsPlayed = teamsPlayed;
    }
    
    


    
    
    
}
