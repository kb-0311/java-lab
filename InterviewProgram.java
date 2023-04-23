import java.nio.file.AccessDeniedException;
import java.util.Scanner;

class InterviewException extends Exception {
  public InterviewException(String message) {
    super(message);
  }
}

class Interview {
  private String name;
  private int age;
  private String gender;
  private String education;

  public Interview(String name, int age, String gender, String education) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.education = education;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getEducation() {
    return education;
  }
}

public class InterviewProgram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter your name: ");
      String name = scanner.nextLine();

      System.out.print("Enter your age: ");
      int age = Integer.parseInt(scanner.nextLine());

      if (age < 18 || age > 60) {
        throw new InterviewException("Age must be between 18 and 60");
      }

      System.out.print("Enter your gender: ");
      String gender = scanner.nextLine();

      if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
        throw new InterviewException("Gender must be male or female");
      }

      System.out.print("Enter your education: ");
      String education = scanner.nextLine();

      if (!education.equalsIgnoreCase("graduate") && !education.equalsIgnoreCase("postgraduate")) {
        throw new InterviewException("Education must be graduate or postgraduate");
      }

      Interview interview = new Interview(name, age, gender, education);

      System.out.println("Interview details:");
      System.out.println("Name: " + interview.getName());
      System.out.println("Age: " + interview.getAge());
      System.out.println("Gender: " + interview.getGender());
      System.out.println("Education: " + interview.getEducation());

    } catch (NumberFormatException e) {
      System.out.println("Age must be a number");
    } catch (InterviewException e) {
      
        e.printStackTrace();
      
    }
  }
}
