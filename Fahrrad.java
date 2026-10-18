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
  public void setMarke (String neuMarke)
  {
    marke = neuMarke;
  }
  public void setGaege (int neuGaenge)
  {
    gaenge = neuGaenge;  
  }
  public void setPreis (int neuPreis)
  {
    preis  =  neuPreis; 
  }
  public void setElekrisch (boolean neuElekrisch)
  {
    elektrisch = neuElekrisch;
  }
  public void setGefedert (boolean neuGefedert )
  {
   gefedert = neuGefedert;  
  }
  public Fahrrad(String neuMarke , int neuGaenge ,int neuPreis, boolean neuElekrisch,boolean neuGefedert)
  {
    marke      =neuMarke;
    gaenge     =neuGaenge;
    preis      =  neuPreis;
    elektrisch =neuElekrisch;
    gefedert   =neuGefedert;
     
  }
  public void printFahrrad()
  {
    System.out.println(marke + " Fahrrad: " + gaenge + " Gaenge,Preis: " +preis +", Elekrisch:" + elektrisch +" , Gefedert:" + gefedert);   
  }
}
  
