//package com.service;
package IPL_PROJ;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;



public class storingAllData{
    public static void ReadingFilematches() {
        int count_for_first_line = 0;
        String line = "";
        String Splitby = ",";
        String matchesFile = "matches.csv";
        BufferedReader buffer = null;
        try{
            buffer = new BufferedReader(new FileReader(matchesFile));
            while((line = buffer.readLine())!= null){
                if(count_for_first_line>1){
                    String[] lst = line.split(Splitby);
                    allDataMatches(lst);
                }
                count_for_first_line++;
            }
        }
        catch(Exception e){
            if(buffer != null){
                try{
                    buffer.close();
                }
                catch(IOException f){
                    e.getStackTrace();
                }
            }
        }
    }
    
    public static ArrayList<String> matchId = new ArrayList<String>();
    public static ArrayList<String> teamsPlayed = new ArrayList<String>();
    public static ArrayList<String> season = new ArrayList<String>();
    public static ArrayList<String> winner = new ArrayList<String>();
    public static int countMatch = 0;
    public static ArrayList<String> matchIdfor2016 = new ArrayList<String>();
    public static LinkedHashMap<String, Integer> seasonAndCountTeamsPlayed = new LinkedHashMap<String, Integer>();

    public static void allDataMatches(String[] matchesInfo){
        
        if(!(matchId.contains(matchesInfo[0]))){
            matchId.add(matchesInfo[0]);
        }
        String two_zero_one_six = "2016";
        matchId.add(matchesInfo[0]);
        season.add(matchesInfo[1]);
        if(!(teamsPlayed.contains(matchesInfo[4]))){
            teamsPlayed.add(matchesInfo[4]);
        }
        if(!(teamsPlayed.contains(matchesInfo[5]))){
            teamsPlayed.add(matchesInfo[5]);
        }
        if(matchesInfo[1].equals(two_zero_one_six)){
            matchIdfor2016.add(matchesInfo[0]);
        }
        winner.add(matchesInfo[10]);
        
        
    }
    
    public static void main(String[] args) {
        ReadingFilematches();
        //ReadingFileDeliveries();
        //System.out.println(winner);
        noOfMatchesPlayedINEachSeason(season);
        System.out.println("  ");
        noOfMatchesWonOffAllTeams(teamsPlayed, winner);
        //System.out.println(matchIdfor2016);
    }

    public static void noOfMatchesPlayedINEachSeason(ArrayList<String> list)
    {
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

    public static void noOfMatchesWonOffAllTeams(ArrayList<String> teams, ArrayList<String> Winners){
        Set<String> st = new HashSet<String>(teams);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(Winners, s));

    }

}
