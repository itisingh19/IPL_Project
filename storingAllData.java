//package com.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

//import com.beans.Data;
//import com.fragmaData.problems.problem1.Problem1;


public class storingAllData{
    public void fileReading() {
        int c = 0;
        String flcsv = "matches.csv";
        String line = "";
        String Splitby = ",";
        BufferedReader buffer = null;
        try{
            buffer = new BufferedReader(new FileReader(flcsv));
            while((line = buffer.readLine())!= null){
                if(c>1){
                    String[] lst = line.split(Splitby);
                    this.allData(lst);
                }
                c++;
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
    
    public void allData(String[] info){
        //Data data = new Data();
        ArrayList<String> matchId = new ArrayList<>();
        ArrayList<String> teamsPlayed = new ArrayList<>();
        ArrayList<String> season = new ArrayList<>();
        ArrayList<String> winner = new ArrayList<>();
        //ArrayList<String> matchId = new ArrayList<>();
        LinkedHashMap<String, String> seasonAndWinner = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> seasonAndCountTeamsPlayed = new LinkedHashMap<String, String>();
        LinkedHashMap<String, String> seasonAndTeamsPlayed = new LinkedHashMap<String, String>();
        
        //int info[0] = Integer.parseInt(info[0]);
        //int info[1] = Integer.parseInt(info[1]);

        ((Object) matchId).put(info[0]);
        ((Object) season).put(info[1]);
        //info.city(info[2]);
        //info.date(info[3]);
        info.team1(info[4]);
        info.team2(info[5]);
        //info.tossWinner(info[6];
        //info.tossDecision(info[7]));
        //info.result(info[8]);
        info.winner(info[9]);
        


    }

}