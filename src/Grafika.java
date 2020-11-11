//Τζόνισον Κοτόρι icsd11073

//Στην κλάση αυτή φτιάχνω γραφικά δηλαδή το μενού για τις 2 επιλογές του χρήστη
//Την εισαγωγή βιβλίου και την αναζήτηση βιβλίου

//Βιβλιοθήκες
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
//Η κλάση μου κάνει extends το JFrame για να μπορέσω να φτιάξω παράθυρο γραφικών
public class Grafika extends JFrame
{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label;
    private JButton EisagwgiVivliou;
    private JButton AnazhthshVivliou;
    
    //Constructor όπου εδώ μέσα φτιάχνω τα γραφικά
    public Grafika()
    {
        super("Συλλογή Βιβλίων της Βιβλιοθήκης της Σχολής Θετικών Επιστημών");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        GridLayout grid=new GridLayout(1,2);
        panel1=new JPanel(new GridLayout(5,3));
        
        panel2=new JPanel(new FlowLayout());
        
        EisagwgiVivliou=new JButton("Εισαγωγή βιβλίου");
        AnazhthshVivliou=new JButton("Αναζήτηση βιβλίου");
        
        JLabel l1=new JLabel("  ");
        JLabel l2=new JLabel("Επιλέξτε τι θέλετε να κάνετε");
        JLabel l3=new JLabel("  ");
        JLabel l4=new JLabel("  ");
        JLabel l5=new JLabel("  ");
        JLabel l6=new JLabel("  ");
        JLabel l7=new JLabel("  ");
        JLabel l8=new JLabel("  ");
        JLabel l9=new JLabel("  ");
        JLabel l11=new JLabel("  ");
        JLabel l12=new JLabel("  ");
        JLabel l13=new JLabel("  ");
        
        JLabel l10=new JLabel("  ");
       
        panel1.add(l1);
        panel1.add(l2);
        panel1.add(l4);
        panel1.add(l6);
        panel1.add(EisagwgiVivliou);
        panel1.add(l5); 
        panel1.add(l11);
        panel1.add(l12);
        panel1.add(l13);
        panel1.add(l3);
        panel1.add(AnazhthshVivliou);
        panel1.add(l7);
        panel1.add(l8);
        panel1.add(l9);
        panel1.add(l10);
        
        
        
        getContentPane().add(panel1);
        getContentPane().add(panel2);
        
        setLayout(grid);
        
        ImageIcon image = new ImageIcon("vivlia.jpg");
        label=new JLabel(image);
        panel2.add(label);
        add(panel1);
        add(panel2);
        
        setSize(950,350);
        
        //pack();
        setLocationRelativeTo(null);
        
        //Λειτουργία του κουμπιού
        EisagwgiVivliou.addActionListener(new ActionListener()
              {
              
                  public void actionPerformed(ActionEvent e)
                  {
                     
                   //Δημιουργώ αντικείμενο της κλάσης Leitourgies και καλώ τον Constructor 
                   //όπου έχω το παράθυρο με την εισαγωγή βιβλίου
                     Leitourgies a=new Leitourgies();
              
                     
                  }
              }
        );
        
       AnazhthshVivliou.addActionListener(new ActionListener()
              {
              
                  public void actionPerformed(ActionEvent e)
                  {
                     //Δημιουργώ αντικείμενο της κλάσης Leitourgies και καλώ τον 2o Constructor 
                   //όπου έχω το παράθυρο με την Αναζήτηση βιβλίου
                     Leitourgies a=new Leitourgies(1);
              
                     
                  }
              }
        );
    }
    
}
