package ex_snake;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Snake extends JFrame implements ActionListener{

    JButton restart;
    public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        restart=new JButton("Restart");
        restart.addActionListener(this);
        restart.setSize(100, 30);
        restart.setLocation( (600 -restart.getWidth())/ 2, (600 / 2)+70);
        restart.setVisible(false);
        add(restart);
        add(new Board(restart));
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
           
            
        });
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == restart) {
              
             this.dispose();
               JFrame ex = new Snake();
            ex.setVisible(true);
            }
    }
}
