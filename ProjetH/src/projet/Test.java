package projet;

public class Test {

    public static void main(String[] args) {

        Client c = new Client();
        Hotel h = new Hotel();

        h.reservation(1, c, 1, "simple");
        h.ticket(c);
        h.affichage();
    }
}