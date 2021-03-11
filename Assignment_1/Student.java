package Assignment_1;

public class Student {
  // initizlize the arguments of the Student classs
  private String fName;
  private String lName;
  private String gender;
  private int age;

  // 3-argument constructor (Method overload)
  Student(String fName, String gender, int age) {
      // use this. to explicity use the arguments of this student class and not the
      // parameters of the method
      this.fName = fName;
      this.lName = "";
      this.gender = gender;
      this.age = age;
  }

  // 4-argument constructor (Method overload)
  Student(String fName, String lName, String gender, int age) {
      this.fName = fName;
      this.lName = lName;
      this.gender = gender;
      this.age = age;
  }

  // Assign a group age for each student based on the student's age
  public String getAge(int age) {
      String ageGroup = "";

      if (age <= 12) {
          ageGroup = "Child";
      } else if (age >= 13 && age <= 19) {
          ageGroup = "Teenager";
      } else if (age >= 20 && age <= 25) {
          ageGroup = "Young Adult";
      } else {
          ageGroup = "Adult";
      }

      return ageGroup;
  }

  /*
   * Display the student's details in one go (fname, lname, gender, age, age
   * group)
   */
  public void display() {
      System.out.println("--------------------------------------");
      System.out.printf("Student's fisrt name: %s\n", this.fName);
      System.out.printf("Student's last name: %s\n", this.lName);
      System.out.printf("Student's gender: %s\n", this.gender);
      System.out.printf("Student's age: %d\n", this.age);
      // call the getAge method for student's age
      System.out.printf("Student's age group: %s\n\n", getAge(this.age));

  }
}
