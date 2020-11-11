//Τζόνισον Κοτόρι icsd11073

//Εδώ έχω την κλάση Βιβλίο με τα χαρακτηριστικά ως private μεταβλητές.
//Η κλάση υλοποιεί το interface java.io.Serializable για να μπορούν τα αντικείμενα της κλάσης να εγγραφούν/αναγνωστούν σε streams. 
import java.io.Serializable;

public class Vivlio implements Serializable
{
    private String Titlos;
    private String ISBN;
    private String Suggrafeas;
    private String EtosEkdosis;
    private String Kathgoria;
    
//Constructor
    public Vivlio(String Titlos, String ISBN, String Suggrafeas, String EtosEkdosis, String Kathgoria)
    {
        this.Titlos = Titlos;
        this.ISBN = ISBN;
        this.Suggrafeas = Suggrafeas;
        this.EtosEkdosis = EtosEkdosis;
        this.Kathgoria = Kathgoria;
    }
//Setters & Getters
    public String getTitlos() 
    {
        return Titlos;
    }

    public void setTitlos(String Titlos)
    {
        this.Titlos = Titlos;
    }

    public String getISBN() 
    {
        return ISBN;
    }

    public void setISBN(String ISBN) 
    {
        this.ISBN = ISBN;
    }

    public String getSuggrafeas()
    {
        return Suggrafeas;
    }

    public void setSuggrafeas(String Suggrafeas) 
    {
        this.Suggrafeas = Suggrafeas;
    }

    public String getEtosEkdosis() 
    {
        return EtosEkdosis;
    }

    public void setEtosEkdosis(String EtosEkdosis) 
    {
        this.EtosEkdosis = EtosEkdosis;
    }

    public String getKathgoria() 
    {
        return Kathgoria;
    }

    public void setKathgoria(String Kathgoria) 
    {
        this.Kathgoria = Kathgoria;
    }
//Η μέθοδος toString για να εμφανίσω τα στοιχεία του βιβλίου
    public String toString() 
    {
        return "Το βιβλίο με στοιχεία:  " + "Τίτλος= " + Titlos + ", ISBN= " + ISBN + ", Συγγραφέας= " + Suggrafeas + ", Έτος Έκδοσης= " + EtosEkdosis + ", Είδος/Κατηγορία= " + Kathgoria;
    }
    
    
    
}
