public class Fahrrad
{
  private String marke = "UNKN";
  private int gaenge = 0;   
  private boolean elektrisch = false ;
  public String getMarke()
  {
    return marke;  
  }
  public int getGaenge ()
  {
    return gaenge; 
  }
  public boolean getElektrisch()
  {
   return elektrisch;   
  }
  public void setMarke (String neuMarke)
  {
    marke = neuMarke;
  }
  public void setGaege (int neuGaenge)
  {
    gaenge = neuGaenge;  
  }
  public void setElekrisch (boolean neuElekrisch)
  {
    elektrisch = neuElekrisch;
  }
  public Fahrrad(String neuMarke , int neuGaenge , boolean neuElekrisch)
  {
    marke      =neuMarke;
    gaenge     =neuGaenge;
    elektrisch =neuElekrisch;
  }  
  public void printFahrrad()
  {
    System.out.println(marke + " Fahrrad: " + gaenge + " Gaenge - " + elektrisch);   
  }
}
  
