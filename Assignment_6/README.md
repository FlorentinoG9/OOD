### Object-Oriented Development
#### OOD Lab 6 | Polymorphism, Object Class, Generics

- Put your name and student number in a comment at the top of each file.
- Ensure that your code is well formatted e.g. lines after an opening brace should be indented. Each closing brace should be at the same indentation as the statement which opened it. (Use Ctrl + Shift + F if using Eclipse)
- It is compulsory to comment your code appropriately. For each of the exercises ensure that your code is sufficiently commented to demonstrate your understanding of the software you are writing. You do not have to comment every line however.
- Marks will be lost if the above instructions are not followed.
- You may discuss assignments with you classmates but you must write each assignment yourself. Copying another student’s code will be considered plagiarism. Outcomes vary from receiving zero in assessments to failing the course.

----

1. Create a **Person** class with name and phone number as attributes.
2. Create an **Employee** class which inherits from class Person and which also has a PPS number.
3. Override the **toString()** method for both classes. This should print out the details of the object.
4. Override the **equals()** method for both classes.
    - Two person objects are considered equal if they have the same name and phone number.
    - Two employees are considered equal if they have the same PPS number.
    - Ensure that the equals method checks for an object being compared to itself and also being compared to null.
5. Create a class named **Lab6** to test your classes.
    - Create a generic method called **printArrayList** which takes a generic ArrayList as a parameter e.g. **printArrayList(ArrayList<E> al)**. This method should loop through the array list and print out each object.
    - Create an **ArrayList** to hold **Person** objects.
    - Create two **Person** objects and two **Employee** objects and store them in this **ArrayList**.
    - Pass this **ArrayList** to the **printArrayList** method.
    - Create two Employees whose PPS numbers are the same but whose names are slightly different (e.g. Al and Alan). Illustrate that these are not equal with regards to the == operator but are equal when the equals() method is used.
    
     
> What do I submit?
> Submit the Person, Employee and Lab6 java files.
