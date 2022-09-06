package com.codewars.count-the-days;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.concurrent.TimeUnit ;
import java.util.Date;

public class Day{

  public String countDays(Date d){
    Date today = new Date();
    long diff = d.getTime() - today.getTime();
    String result;
    if (diff > 0) {
      result = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + " days";
    } else if (diff == 0) {
      result = "Today is the day!";
    } else {
      result = "The day is in the past!";
    }
    return result;
  }
}
