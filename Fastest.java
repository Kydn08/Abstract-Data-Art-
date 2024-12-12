import org.code.theater.*;
import org.code.media.*;

public class Car {
private String sportNames; // GIves the name of the Sports Car
  private String electricNames; // gives the name of the electric Car
 

//My constructor 
  public Car(String sportName, String electricName){
    this.sportName= sportName;
    this.electricName=electricName;


     // My accessor method for the names 
  }
  public String getSportName() {
    return sportName;
  }
  public String getElectricName(){
    return electricName;
  }
 
// To String to show the names
  public String toStringSportName(){
    return "Sport Name:" + sportName;
  }


  public String toStringElectricName(){
    return "Electric Name"+ electricName;
  }

  public String toStringName(){
    return sportName + "(Fastest Sport Car is)"; 

    public String toStringSportName(){
      return "Buggati"+ sportName;
    }
    public String toStringElectricName(){
      return "Fastest Electric Car" +electricName;
    }
  }
  