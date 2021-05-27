import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Board extends JPanel implements MouseListener {

    public int[] plansza = {
            1,0,1,0,1,
            1,0,1,0,1,
            1,0,0,0,1,
            1,0,1,0,1,
            1,1,1,1,1,
    };

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
      /*  for(int i = 0; i<; i++){
            plansza[i] = (int)(Math.random()*2);
        }*/
        int ludzikX = 2;
        int ludzikY = 2;

        int x=0;
        int y=0;
        Color kolor;
        for(int i = 0; i<25; i++) {
            if(plansza[i]==1) kolor = Color.blue;
            else kolor = Color.GREEN;
            g.setColor(kolor);
            g.fillRect(x*20,y*20,20, 20);

            if(x==ludzikX && y == ludzikY) {
                System.out.println("ludzik " + x +" " + y);
                g.setColor(Color.red);
                g.fillRect(x * 20, y * 20, 20, 20);
            }
            x++;
            if(x%5 == 0){
            y++;
            x=0;
            }

        }

//            g.fillRect(0,0,400, 400);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
