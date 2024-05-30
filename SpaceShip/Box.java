import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Box extends JPanel{
    private  int x;
    private int y;
    private Image spaceShipImage;
    Box() throws IOException{
        super();
        try {
            spaceShipImage = ImageIO.read(new File("./spaceship.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        x = 100;
        y = 100;
    }
    public void leftPressed(){
        x=x-10;
        if(x<0){
            x=x+10;
        }
        repaint();
        
    }
    public void rightPressed(){
        x=x+10;
        if(x>1000){
            x=x-10;
        }
        repaint();
        
    }
    public void upPressed(){
        y=y-10;
        if(y<0){
            y=y+10;
        }
        repaint();
    }
    public void downPressed(){
        y=y+10;
        if(y>500){
            y=y-10;
        }
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawOval(50,40,400,400);
        //g.fillOval(100,100,80,80);
        //g.fillOval(320,100,80,80);
        g.setColor(Color.RED);
        g.drawImage(spaceShipImage,x,y,80,80, this);
        //g.setColor(Color.BLACK);
       // g.fillArc(200,150,100,100,0,180);
       // g.fillRect(100,320,300,10);

    } 
}
