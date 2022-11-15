
public class DiceGame {

    public static void main(String[] args) {
        Registrar r = new Registrar();
        Player p1 = new Player(r.invitePlayer());
        Player p2 = new Player(r.invitePlayer());
        GameBoard b = new GameBoard(p1, p2);
        new Dealer().dealDiceGame(p1,p2,b,r);
    }
}