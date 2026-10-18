public class Fahrrad
{
  private String marke = "UNKN";
  private int gaenge = 1; 
  private int preis  = 250;
  private boolean elektrisch = false ;
  private boolean gefedert = false ;
  
  public String getMarke()
  {
    return marke;  
  }
  public int getGaenge ()
  {
    return gaenge; 
  }
  public int getPreis()
  {
    return preis;
  }
  public boolean getElektrisch()
  {
   return elektrisch;   
  }
  public boolean getGefedert()
  {
    return gefedert;
  }
  public void setMarke (String marke)
  {
    this.marke = marke;
  }
  public void setGaege (int gaenge)
  {
    this.gaenge = gaenge;  
  }
  public void setPreis (int preis)
  {
    this.preis  =  preis; 
  }
  public void setElektrisch (boolean elektrisch)
  {
    this.elektrisch = elektrisch;
  }
  public void setGefedert (boolean gefedert )
  {
   this.gefedert = gefedert;  
  }
  public Fahrrad(String marke , int gaenge ,int preis, boolean elektrisch,boolean gefedert)
  {
    this.marke      =marke;
    this.gaenge     =gaenge;
    this.preis      =  preis;
    this.elektrisch = elektrisch;
    this.gefedert   =gefedert;
     
  }
  public void printFahrrad()
  {
    System.out.println("Fahrrad: " + marke + " - " + gaenge + " Gänge - " + (elektrisch ? "elektrisch" : "ohne Motor"));  
  }
}
  
