public class PracticaLab {
    public static void main(String[] args) {

        Player player1= new Player("pepe",0);
        Player player2= new Player("devo",0);
        ScoreBoard newScore= new ScoreBoard(player1,player2);
        playGame(new Tennisgame(player1,player2,ScoreBoard ));
    }

    public static void playGame(Game game){


    }
}
