

/**
 * ProgrammingLanguage
 */
public class ProgrammingLanguage {
    public static void main(String[] args) {
        Python py = new Python();
        Cpp cpp = new Cpp();

        System.out.println(py.add(2, 3));
        System.out.println(py.Power(2, 3));
        System.out.println(py.StringToInteger("1234"));

        System.out.println(cpp.IntegerToString(1234));
        System.out.println(cpp.Power(3, 2));
    }
    
}

/**
 * InnerProgrammingLanguage
 */
interface PythonProgrammingLanguage {
  
    public int StringToInteger(String s);
    public long Power(int a , int b);
    public long add(int a , int b);
}

class Python implements PythonProgrammingLanguage{
    public int StringToInteger(String s) {
        return Integer.parseInt(s);
    }
    public long Power (int a , int b ) {
        return (long) Math.pow(a, b);
    }
    public long add(int a , int b ) {
        return (a+b);
    }
}

/**
 * InnerProgrammingLanguage
 */
interface CppProgrammingLanguage {
    public String IntegerToString(int i);
    public long Power(int a , int b);
    
}

class Cpp implements CppProgrammingLanguage {
    public String IntegerToString(int i) {
        return String.valueOf(i);
    }
    public long Power(int a , int b ) {
        return (long) Math.pow(a, b);
    }

    

    
}



