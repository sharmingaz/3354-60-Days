//60 Days setHabit function

package applicationTesting;

public class Habit {

  String description = "default"; //description of Habit
  int timeHour = 8; //set timeHour variable
  int timeMinute = 15; //set timeMinute variable

  Habit(String description, int timeHour, int timeMinute) 
  {
      this.description = description;
      this.timeHour = timeHour;
      this.timeMinute = timeMinute;
  }
  
  //setter for description
  public void setDescription(String description) 
  {
      this.description = description;
  }
  
  //getter for description
  public String getDescription() 
  {
      return description;
  }
  
  //setter for reminder time hour
  public void setTimeHour(int timeHour) 
  {
      this.timeHour = timeHour;
  }
  
  //getter for reminder time hour
  public int getTimeHour()
  {
	  return timeHour;
  }
  
  //setter for reminder time minute
  public void setTimeMinute(int timeMinute) 
  {
      this.timeMinute = timeMinute;
  }
  
  //getter for reminder time minute
  public int getTimeMinute()
  {
	  return timeMinute;
  }
  
}
