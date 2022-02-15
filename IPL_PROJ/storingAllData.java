package IPL_PROJ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class storingAllData {

    private static ArrayList<String> matchId = new ArrayList<String>();
    private static ArrayList<String> teamsPlayed = new ArrayList<String>();
    private static ArrayList<String> season = new ArrayList<String>();
    private static ArrayList<String> winner = new ArrayList<String>();
    public static int countMatch = 0;
    private static ArrayList<String> matchIdfor2016 = new ArrayList<String>();
    private static LinkedHashMap<String, Integer> extra_runs_by_teams_played_in_2016 = new LinkedHashMap<String, Integer>();
    private static ArrayList<String> teamsPlayedIn2016 = new ArrayList<String>();
    public static List<String> matchIdfor2015 = new ArrayList<String>();
    private static List<String> playersPlayedIn2015 = new ArrayList<String>();
    private static LinkedHashMap<String, Integer> runsBowlerGvaeIn2015 = new LinkedHashMap<String, Integer>();
    private static LinkedHashMap<String, Integer> oversPlayedByEachPlayerIn2015 = new LinkedHashMap<String, Integer>();
    private static LinkedHashMap<String, Integer> moEconomicBowlers = new LinkedHashMap<String, Integer>();
    private static ArrayList<String> tossWinnerDetails = new ArrayList<String>();
    private static LinkedHashMap<String, Integer> noOfTimesEachTeamWonToss = new LinkedHashMap<String, Integer>();

    public static void ReadingFilematches() {
        int count_for_first_line = 0;
        String line = "";
        String Splitby = ",";
        String matchesFile = "matches.csv";
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(matchesFile));
            while ((line = buffer.readLine()) != null) {
                if (count_for_first_line > 1) {
                    String[] lst = line.split(Splitby);
                    allDataMatches(lst);
                }
                count_for_first_line++;
            }
        } catch (Exception e) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException f) {
                    e.getStackTrace();
                }
            }
        }
    }

    public static void ReadingFileDeliveries() {
        int count_for_first_line = 0;
        String line = "";
        String Splitby = ",";
        String deliveriesFile = "deliveries.csv";
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(deliveriesFile));
            while ((line = buffer.readLine()) != null) {
                if (count_for_first_line > 1) {
                    String[] lst = line.split(Splitby);
                    allDataDeliveries(lst);
                }
                count_for_first_line++;
            }
        } catch (Exception e) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException f) {
                    e.getStackTrace();
                }
            }
        }
    }

    public static void allDataMatches(String[] matchesInfo) {

        if (!(matchId.contains(matchesInfo[0]))) {
            matchId.add(matchesInfo[0]);
        }
        String two_zero_one_six = "2016";
        String two_zero_one_five = "2015";
        matchId.add(matchesInfo[0]);
        season.add(matchesInfo[1]);
        tossWinnerDetails.add(matchesInfo[6]);

        if (!(teamsPlayed.contains(matchesInfo[4]))) {
            teamsPlayed.add(matchesInfo[4]);
        }

        if (!(teamsPlayed.contains(matchesInfo[5]))) {
            teamsPlayed.add(matchesInfo[5]);
        }

        if (matchesInfo[1].equals(two_zero_one_six)) {
            matchIdfor2016.add(matchesInfo[0]);
            if (!(teamsPlayedIn2016.contains(matchesInfo[4]))) {
                teamsPlayedIn2016.add(matchesInfo[4]);
            }
        }

        if (matchesInfo[1].equals(two_zero_one_five)) {
            matchIdfor2015.add(matchesInfo[0]);
        }
        winner.add(matchesInfo[10]);

    }

    public static void allDataDeliveries(String[] deliveriesInfo) {

        int extra_runs = Integer.parseInt(deliveriesInfo[16]);
        if (extra_runs_by_teams_played_in_2016.containsKey(deliveriesInfo[2])) {
            int prev_runs = extra_runs_by_teams_played_in_2016.get(deliveriesInfo[2]);
            extra_runs_by_teams_played_in_2016.put(deliveriesInfo[2], prev_runs + extra_runs);

        } else {
            extra_runs_by_teams_played_in_2016.put(deliveriesInfo[2], extra_runs);
        }

        if (matchIdfor2015.contains(deliveriesInfo[0])) {

            if (!(playersPlayedIn2015.contains(deliveriesInfo[8]))) {
                playersPlayedIn2015.add(deliveriesInfo[8]);

            }
            if (runsBowlerGvaeIn2015.containsKey(deliveriesInfo[8])) {
                int prev_runs_gave = runsBowlerGvaeIn2015.get(deliveriesInfo[8]);
                int run_to_be_added = Integer.parseInt(deliveriesInfo[17]) - Integer.parseInt(deliveriesInfo[16]);
                runsBowlerGvaeIn2015.put(deliveriesInfo[8], prev_runs_gave + run_to_be_added);
                int prev_balls = oversPlayedByEachPlayerIn2015.get(deliveriesInfo[8]);
                oversPlayedByEachPlayerIn2015.put(deliveriesInfo[8], prev_balls + 1);
            } else {
                int run_to_be_added = Integer.parseInt(deliveriesInfo[17]) - Integer.parseInt(deliveriesInfo[16]);
                runsBowlerGvaeIn2015.put(deliveriesInfo[8], run_to_be_added);
                oversPlayedByEachPlayerIn2015.put(deliveriesInfo[8], 1 / 6);
            }

        }

    }

    public static void noOfMatchesPlayedINEachSeason(ArrayList<String> list) {
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

    public static void noOfMatchesWonOffAllTeams(ArrayList<String> teams, ArrayList<String> Winners) {
        Set<String> st = new HashSet<String>(teams);
        for (String s : st)
            System.out.println(s + ": " + Collections.frequency(Winners, s));

    }

    public static void gettingTopEconomicalBowlers(LinkedHashMap<String, Integer> runs_bowler_gave,
            LinkedHashMap<String, Integer> balls_bowler_throw) {
        for (Map.Entry<String, Integer> mapEle : balls_bowler_throw.entrySet()) {
            int val = mapEle.getValue();
            balls_bowler_throw.put(mapEle.getKey(), val / 6);
            val = val / 6;
            int total_run_by_bowler = runsBowlerGvaeIn2015.get(mapEle.getKey());
            moEconomicBowlers.put(mapEle.getKey(), total_run_by_bowler / val);

        }

        Integer minKey = Collections.min(moEconomicBowlers.values());
        for (Map.Entry<String, Integer> mapEle : moEconomicBowlers.entrySet()) {
            if ((mapEle.getValue()).equals(minKey)) {
                System.out.println(mapEle.getKey());
            }
        }

    }

    public static void teamThatWonMAximumToss(ArrayList<String> tossWinners) {

        Set<String> st = new HashSet<String>(tossWinners);
        for (String s : st)
            noOfTimesEachTeamWonToss.put(s, Collections.frequency(tossWinners, s));
        String max_toss_winner_team = Collections.max(noOfTimesEachTeamWonToss.keySet());
        System.out.println(max_toss_winner_team);

    }

    public static void main(String[] args) {
        ReadingFilematches();
        ReadingFileDeliveries();
        System.out.println("Number of matches played in each IPL season : ");
        noOfMatchesPlayedINEachSeason(season);
        System.out.println("");
        System.out.println("Number of matches won of all teams : ");
        noOfMatchesWonOffAllTeams(teamsPlayed, winner);
        System.out.println("");
        System.out.println("Extra runs by teams played in 2015 : ");
        System.out.println(extra_runs_by_teams_played_in_2016);
        System.out.println("");
        System.out.println("Most Econimical Bowlers : ");
        gettingTopEconomicalBowlers(runsBowlerGvaeIn2015, oversPlayedByEachPlayerIn2015);
        System.out.println("");
        System.out.println("Make a scenario: Finding Which Team Won Maximum Toss - ");
        teamThatWonMAximumToss(tossWinnerDetails);

    }

}
