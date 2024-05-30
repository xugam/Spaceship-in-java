import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BigBox {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("HEllo");
        frame.setSize(1000,600);
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        leftButton.setSize(20,20);
        rightButton.setSize(20,20);
        Box box = new Box();
        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Left");
                box.leftPressed();
                frame.add(box,BorderLayout.NORTH);

            }
        });
        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Right");
                box.rightPressed();
                frame.add(box,BorderLayout.NORTH);
            }
        });
        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Down");
                box.downPressed();
                frame.add(box,BorderLayout.NORTH);

            }
        });
        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Up");
                box.upPressed();
                frame.add(box,BorderLayout.NORTH);
            }
        });
        JPanel actionPanel = new JPanel();
        //actionPanel.setPreferredSize(new Dimension(1000,200));
        
        box.setPreferredSize(new Dimension(1000,500));
        frame.add(box,BorderLayout.NORTH);
        actionPanel.add(leftButton);
        actionPanel.add(rightButton);
        actionPanel.add(downButton);
        
        actionPanel.add(upButton);
        frame.add(actionPanel,BorderLayout.SOUTH);
        
        frame.setVisible(true);
     

    }
    
}