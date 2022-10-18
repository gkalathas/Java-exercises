import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int gamesPlayed = 0;
    int gamesWon = 0;
    int gamesLost = 0;
    int gamesTied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+ " is already a member of the team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void matchResult(Team opponent, int ourScore, int theirScore){
        String message;
        if(ourScore>theirScore){
            gamesWon++;
            message = " won to ";
        } else if (ourScore == theirScore) {
            message = " tied to ";
            gamesTied++;
        }else{
            message = " lost to ";
            gamesLost++;
        }
        gamesPlayed++;
        if(opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    public int ranking(){
        return (gamesWon*2) + gamesTied;
    }


    @Override
    public int compareTo(Team<T> team) {
       if(this.ranking() > team.ranking()){
           return -1;
       }else if (this.ranking() < team.ranking()){
           return 1;
       }else{
           return 0;
       }
    }
}
