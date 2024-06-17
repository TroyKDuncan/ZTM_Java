package PackagesClassesExercises;

class Match {
    public Team team1;
    public Team team2;
    public int score1;
    public int score2;
    public Team winner;
}

class Player {
    public String name;
    public int age;
    public String position;
    public Team team;
}

class Team {
    public String name;
    public String players;
}

class Tournament {
}

public class FootballTournament {
    public static void main(String[] args) {
        Team Spurs = new Team();
        Team Lakers = new Team();
        Player Wemby = new Player();
        Match SpursLakers = new Match();
        Tournament Playoffs = new Tournament();
    }
}