### Object-Oriented Development
#### Lab 2 | Encapsulation & Getters and Setters

1. Redefine the Student class from your last assignment and create setters and getters for each attribute in the class. Create two student objects and call these setters and getters in order to test them.

2. Add functionality to the setter methods to modify the input before storing it in a member variable:

- The first name and last name attributes should begin with a capital letter and all other letters should be lower case (see note)
- Store gender as an integer but have the setter method take in a string.
  - If the user enters 'm' , 'M' , 'Male'  or 'MALE'  then set the gender to be 0.
  - If the user enters 'f' , 'F' , 'Female'  or 'FEMALE'  then set the gender to be 1.
  - If the user enters an age less than 0 or greater than 100 then set the age member variable to -1 and print out an error message.

> Note:

- myString.substring(0, 1) will give the first letter of a string
- myString.substring(1) will give the rest of the string
- myString.equalsIgnoreCase(otherString) checks if two strings are equal (regardless of case)
- myString.toUpperCase() and myString.toLowerCase() will set a string to all upper/lower case
