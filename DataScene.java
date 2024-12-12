import org.code.theater.*;

/*
*This will show a scene that will be played from the data from the data sets. Played from the Theater 
* class using the data sets
*/

public class DataScene extends Scene {

private Car[] cars; //My 1-D Array  

  //My constructor 
  public DataScene()  {
    cars = createCars();
  }
/** This will return my 1D array of the car objectr using electricNames file and the sportsNames files**/
  public Car[] createCars(){
    String[] sportNamesArray= FileReader.toStringArray("sportsNames.txt");
        String[] electricNamesArray= FileReader.toStringArray("electricNames.txt");


  Car[] carsArray= new Car[sportNamesArray.length]; 
  for(int i = 0; i < carsArray.length; i++){
  carsArray[i]= new Car(sportNamesArray[i],electricNamesArray[i]);
  }
return carArray;
}
/** should pick a randmon car**/
public void drawScene(){
  int randomIndex= (int) (Math.random() *cars.length);
  Car car = cars[randomIndex];
}
  {
   drawText(car.toStringSportNames(), 17,99); 
  drawText(car.toStringElectricNames(), 17, 120);
}
{
  System.out.println(car);
}