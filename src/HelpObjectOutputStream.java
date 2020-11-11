//Τζόνισον Κοτόρι icsd11073

//Σε αυτήν την κλάση κάνω override τη μέθοδο writeStreamHeader της κλάσης ObjectOutputStream 
//όπου κάνει 'reset' τον 'header' που είναι το πρώτο στοιχείο του αρχείου.
//Μόνο με αυτόν τον τρόπο μπόρεσα να κάνω εισαγωγή και αναζήτηση βιβλίου εναλλάξ.


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;



public class HelpObjectOutputStream extends ObjectOutputStream
{
    public HelpObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    } 
       @Override
       protected void writeStreamHeader() throws IOException {
    
     reset();
  
        
    }
    
}
