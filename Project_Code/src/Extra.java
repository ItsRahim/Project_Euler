/*
// Date & Time (I replaced the date and time variable types with int to avoid initial errors, so they need to be replaced)


//Date

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
...
	
LocalDate dateObj = LocalDate.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
// The variable "date" is a string
date = date.format(format);

// Time

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
...
	
LocalTime time = LocalTime.now();
DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
// The variable "time" is a string
time = time.format(format);
 */