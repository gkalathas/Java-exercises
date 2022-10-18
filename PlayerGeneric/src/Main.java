public class Main {
    public static void main(String[] args) {
        FootBallPlayer george = new FootBallPlayer("George");
        FootBallPlayer aris = new FootBallPlayer("Aris sketos");

        Team<FootBallPlayer> olympiakos = new Team("Olympiakos");
        Team<FootBallPlayer> panathinaikos = new Team("Panathinaikos");
        olympiakos.addPlayer(george);
        olympiakos.addPlayer(aris);


        League<Team<FootBallPlayer>> footballLeague = new League<>("AFL");
        footballLeague.add(olympiakos);

    }
}