public class Date {
  
  Integer day, month, year;

  public Date(Integer day, Integer month, Integer year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Integer getDay() {
    return day;
  }

  public Integer getMonth() {
    return month;
  }

  public Integer getYear() {
    return year;
  }

  public String displayDate(){
    String date = day + "/" + month + "/" + year;
    return date;
  }

}
