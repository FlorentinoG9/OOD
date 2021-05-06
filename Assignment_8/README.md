### OOD Lab8

#### Exception Handling, & Comparable

- Put your name and student number in a comment at the top of each file.
- Ensure that your code is well formatted e.g. lines after an opening brace should be indented. Each closing brace should be at the same indentation as the statement which opened it. (Use Ctrl + Shift + F if using Eclipse)
- It is compulsory to comment your code appropriately. For each of the exercises ensure that your code is sufficiently commented to demonstrate your understanding of the software you are writing. You do not have to comment every line however.
- Marks will be lost if the above instructions are not followed.
- You may discuss assignments with you classmates but you must write each assignment yourself. Copying another student’s code will be considered plagiarism. Outcomes vary from receiving zero in assessments to failing the course.

---

Tasks

- Write a class called Customer that has data fields for ID, age, name and phoneNumber.
- For the age, name and phoneNumber fields add getter and setter methods.
- Specify one constructor to initialise the age, name and phoneNumber field.
- The ID field should automatically be filled in with the next available ID (starting at 1).
- Overwrite the toString method so that it returns a string description for the customer in the format below.
  1235 John Smyth, 0861234567, 40
- Use the Customer class to implement the Comparable interface and provide implementation of the compareTo method, which will compare two Customer objects by their age.
- Write a class called Lab8 that creates 5 customers. Store these customer objects in an ArrayList and then sort the list, using the Collections.sort method. (You will need to import java.util.\_ for this.)
- Loop through the sorted list and print the details of each customer to a new line in a text file. The example below will open/create a text file called OutFile.txt and print the line “Test”. You will need to either wrap this code in a try/catch block or declare that your main method throws an IOException – either is acceptable. (You will need to import java.io.\_ for this).

```java

PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

System.out.println("Test");

if (out != null) {
  out.close();
  }

```