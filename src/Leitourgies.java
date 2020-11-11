//Τζόνισον Κοτόρι icsd11073

//Στην κλάση αυτή θα φτιάξω Γραφικά δηλαδή τα 2 παράθυρα για την εισαγωγή και την αναζήτηση βιβλίου
//τα οποία θα λειτουργίσουν/ανοίξουν μετά το πάτημα των κουμπιών από την 1η σελίδα που είναι το Menu.
//Δημιουργώ δηλαδή 2 Constructors, 1 για την κάθε λειτουργεία.
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.NullPointerException;

public class Leitourgies extends JFrame
{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JButton button;
    private JButton button2;
    
    //Πρώτος Constructor για την εισαγωγή βιβλίου
    public Leitourgies() 
    {
        super("Εισαγωγή βιβλίου");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        GridLayout grid=new GridLayout(1,1);
        panel1=new JPanel(new GridLayout(6,2));
        JLabel label1=new JLabel("  Τίτλος:");
        JTextField tex1=new JTextField();
        JLabel label2=new JLabel("  ISBN:");
        JTextField tex2=new JTextField();
        JLabel label3=new JLabel("  Συγγραφέας:");
        JTextField tex3=new JTextField();
        JLabel label4=new JLabel("  Έτος έκδοσης:");
        JTextField tex4=new JTextField();
        JLabel label5=new JLabel("  Κατηγορία:");
        JTextField tex5=new JTextField();
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        label3.setFont(new Font("Serif", Font.PLAIN, 20));
        label4.setFont(new Font("Serif", Font.PLAIN, 20));
        label5.setFont(new Font("Serif", Font.PLAIN, 20));
        button =new JButton("Εισαγωγή");
        button.setFont(new Font("Serif", Font.PLAIN, 20));
        tex1.setFont(new Font("Serif", Font.PLAIN, 25));
        tex2.setFont(new Font("Serif", Font.PLAIN, 25));
        tex3.setFont(new Font("Serif", Font.PLAIN, 25));
        tex4.setFont(new Font("Serif", Font.PLAIN, 25));
        tex5.setFont(new Font("Serif", Font.PLAIN, 25));
        panel1.add(label1);
        panel1.add(tex1);
        panel1.add(label2);
        panel1.add(tex2);
        panel1.add(label3);
        panel1.add(tex3);
        panel1.add(label4);
        panel1.add(tex4);
        panel1.add(label5);
        panel1.add(tex5);
        panel1.add(button);
        add(panel1);
        
        setSize(600,400);
        
        //pack();
        setLocationRelativeTo(null);
       
        button.addActionListener(new ActionListener()
              {
              
                  public void actionPerformed(ActionEvent e)
                  {
                     //dispose();
                     ObjectOutputStream out=null;
                     FileOutputStream out2;
                     String str1=tex1.getText();
                     String str2=tex2.getText();
                     String str3=tex3.getText();
                     String str4=tex4.getText();
                     String str5=tex5.getText();
                     File file=new File("Αρχείο αντικειμένων.txt");
                     
                      try {
                          
                          Vivlio a=new Vivlio(str1,str2,str3,str4,str5);
            //Για την δημιουργία του πρώτου αντικειμένου πρέπει να χρησμιποιήσω το κανονικό 'ObjectOutputStream' γιαυτό το λόγω βάζω έναν έλεγχο. 
                          if(file.exists())
                          {
                              HelpObjectOutputStream out3=new HelpObjectOutputStream(new FileOutputStream(file,true));
                              out3.writeObject(a);
                              out3.flush();
                              out3.close();
                          //Δημιουργώ ένα παράθυρο διαλόγου
                          JOptionPane.showMessageDialog(null, "Το βιβλίο καταχωρήθηκε επιτυχώς!", "Πληροφορίες", JOptionPane.INFORMATION_MESSAGE);
                          }
                          else{
                          out2=new FileOutputStream(file);
                          out=new ObjectOutputStream(out2);
                          
                          out.writeObject(a);
                          out.flush();
                          out.close();                         
                          //Δημιουργώ ένα παράθυρο διαλόγου
                          JOptionPane.showMessageDialog(null, "Το βιβλίο καταχωρήθηκε επιτυχώς!", "Πληροφορίες", JOptionPane.INFORMATION_MESSAGE);
                          
                          }
                      } catch (IOException ex) {
                          Logger.getLogger(Leitourgies.class.getName()).log(Level.SEVERE, null, ex);
                      }
              
                     
                  }
              }
        );
       
       
     
        
    }
    
  //2ος Constructor με παράμετρο ένα ακέραιο αριθμό για να διαφέρει από τον πρώτο.
  //Αυτός αφορά την αναζήτηση βιβλίου.
    public Leitourgies(int a)
    {
        super("Αναζήτηση βιβλίου");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
        GridLayout grid=new GridLayout(4,1);
        setLayout(grid);
        
        panel2=new JPanel(new BorderLayout());
        panel3=new JPanel(new GridLayout(1,3));
        panel4=new JPanel(new GridLayout(1,3));
        panel5=new JPanel();
        
        JLabel label1=new JLabel("  Συμπλήρωσε το πεδίο με βάση το οποίο θέλετε να κάνετε την αναζήτηση:");
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        
        
        JLabel label2=new JLabel("  Συγγραφέας:");
        JLabel label3=new JLabel("  Τίτλος:");
        JLabel label4=new JLabel("  Κατηγορία:");
        label2.setFont(new Font("Serif", Font.PLAIN, 25));
        label3.setFont(new Font("Serif", Font.PLAIN, 25));
        label4.setFont(new Font("Serif", Font.PLAIN, 25));
        
        JTextField text1=new JTextField();
        JTextField text2=new JTextField();
        JTextField text3=new JTextField();
        text1.setFont(new Font("Serif", Font.PLAIN, 25));
        text2.setFont(new Font("Serif", Font.PLAIN, 25));
        text3.setFont(new Font("Serif", Font.PLAIN, 25));
       
        
        button2=new JButton("Αναζήτηση");
        button2.setFont(new Font("Serif", Font.PLAIN, 20));
       
        panel2.add(label1, BorderLayout.CENTER);
        panel3.add(label2);
        panel3.add(label3);
        panel3.add(label4);
        panel4.add(text1);
        panel4.add(text2);
        panel4.add(text3);
        
        panel5.add(button2, BorderLayout.CENTER);
        
        
        
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        
        setSize(800,400);
        //pack();
        setLocationRelativeTo(null);
        
        button2.addActionListener(new ActionListener()
              {
              
                  public void actionPerformed(ActionEvent e)
                  {
                      //dispose();
                          ObjectInputStream in=null;
                          FileInputStream in1;
                          String suggrafeas=text1.getText();
                          String titlos=text2.getText();
                          String kathgoria=text3.getText();
                          Vivlio a;
                          int count=0;
                      
                      try {
                          
                          
                          
                          in1=new FileInputStream("Αρχείο αντικειμένων.txt");
                          if(in1.available()!=0)
                          in=new ObjectInputStream(in1);
                                                  
                          
                          while(in!=null && in1.available()!=0){
                              
                          
                             
                            a=(Vivlio)in.readObject();
                             
                              
                              if( a.getTitlos().equalsIgnoreCase(titlos) || a.getSuggrafeas().equalsIgnoreCase(suggrafeas)|| a.getKathgoria().equalsIgnoreCase(kathgoria))
                              {   JOptionPane.showMessageDialog(null, a.toString(), "Πληροφορίες", JOptionPane.INFORMATION_MESSAGE);
                                  count++;  
                              }
                          }
                          if(count==0){
                              JOptionPane.showMessageDialog(null, "Δεν βρέθηκε το βιβλίο", "Πληροφορίες", JOptionPane.INFORMATION_MESSAGE);}
                          in.close();
                      } catch (IOException ex) {
                          Logger.getLogger(Leitourgies.class.getName()).log(Level.SEVERE, null, ex);
                      } catch (ClassNotFoundException ex) {
                          Logger.getLogger(Leitourgies.class.getName()).log(Level.SEVERE, null, ex);
                      }
                                
                        
                         
                         
                          
                      
                     
                     
                  }
              }
        );
    }
    
}
