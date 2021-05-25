import javax.swing.*;

public class Shared {
    public static JFrame okno = new JFrame("OX");
    public static Board board = new Board();
    public static int[] plansza = new int[9];

    public static void start(){
        okno.setBounds(100,100,400,400);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        okno.add(board);
        okno.setVisible(true);
    }
}
