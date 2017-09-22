import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class display {
    
    private String label1String = "Válassz felületet!";
    private String button1String = "Gyerekek";
    private String button2String = "Ovónők";
    JFrame frame = new JFrame();
    
    public void display() {
        JLabel label1 = new JLabel(label1String);
        JButton button1 = new JButton(button1String);
        JButton button2 = new JButton(button2String);
        gyerekekFelulet run1 = new gyerekekFelulet();
        ovonokFelulet run2 = new ovonokFelulet();
        
        frame.setSize(1500, 1000);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpg")));
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.add(label1);
        frame.add(button1);
        frame.add(button2);
        
        label1.setVisible(true);
        label1.setFont(new Font("Serif", Font.PLAIN, 30));
        label1.setBounds(650, 0, 10000, 40);
        
        button1.setVisible(true);
        button1.setFont(new Font("Serif", Font.PLAIN, 30));
        button1.setBounds(550, 40, 200, 40);
        
        button2.setVisible(true);
        button2.setFont(new Font("Serif", Font.PLAIN, 30));
        button2.setBounds(760, 40, 200, 40);
        
        button1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                run1.gyerekekFelulet();
            } 
        });
        button2.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                run2.ovonokFelulet();
            } 
        });
    }
}
