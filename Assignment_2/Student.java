package Assignment_2;

public class Student {
  // initizlize the arguments of the Student classs
  private String fName;
  private String lName;
  private int gender;
  private int age;

  // 3-argument constructor (Method overload)
  Student(String fName, String gender, int age) {
    // use this. to explicity use the arguments of this student class and not the
    // parameters of the method
    setfName(fName);
    this.lName = "";
    setGender(gender);
    setAge(age);
  }

  // 4-argument constructor (Method overload)
  Student(String fName, String lName, String gender, int age) {
    setfName(fName);
    setlName(lName);
    setGender(gender);
    setAge(age);
  }

  public void setAge(int age) {
    this.age = age < 0 || age > 100 ? -1 : age;
  }

  public void setGender(String gender) {
    gender = gender.toLowerCase();
    if (gender.equals("m") || gender.equals("male")) {
      this.gender = 0;
    } else if (gender.equals("f") || gender.equals("female")) {
      this.gender = 1;
    } else {
      this.gender = -1;
    }
  }

  public void setfName(String fName) {
    fName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase();
    this.fName = fName;
  }

  public void setlName(String lName) {
    lName = lName.substring(0, 1).toUpperCase() + lName.substring(1).toLowerCase();
    this.lName = lName;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    if (gender == 0) {
      return "Male";
    }
    return gender == 1 ? "Female" : "Invalid Gender";
  }

  public String getfName() {
    return fName;
  }

  public String getlName() {
    return lName;
  }

  // Assign a group age for each student based on the student's age
  public String getAgeGroup(int age) {
    String ageGroup = "Invalid Age";

    if (age != -1) {
      if (age <= 12) {
        ageGroup = "Child";
      } else if (age >= 13 && age <= 19) {
        ageGroup = "Teenager";
      } else if (age >= 20 && age <= 25) {
        ageGroup = "Young Adult";
      } else {
        ageGroup = "Adult";
      }
    }

    return ageGroup;
  }

  /*
   * Display the student's details in one go (fname, lname, gender, age, age
   * group)
   */
  public void display() {
    System.out.println("--------------------------------------");
    System.out.printf("Student's fisrt name: %s\n", getfName());
    System.out.printf("Student's last name: %s\n", getlName());
    System.out.printf("Student's gender: %s\n", getGender());
    System.out.printf("Student's age: %d\n", getAge());
    // call the getAgeGroup method for student's age
    System.out.printf("Student's age group: %s\n\n", getAgeGroup(getAge()));

  }
}
