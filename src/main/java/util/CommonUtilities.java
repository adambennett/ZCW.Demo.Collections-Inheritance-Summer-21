package util;


public class CommonUtilities {

    public static void printInstanceOfExample(boolean check, String class1, String class2) {
        System.out.println(class1 + " is " + class2 + ": " +  check);
    }

    public static void printInstanceOfExample(Class a, Class b) {
        System.out.println(a.getName() + " is " + b.getName() + ": " + a.isInstance(b));
    }

}
