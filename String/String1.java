package String;

public class String1 {
    public static void main(String[] args) {
        String s1 = "pwskill";
        String s2 = new String("PWskill");
        String s3 = new String("pwskill");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equals(s3));
    }
}
