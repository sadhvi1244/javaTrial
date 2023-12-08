package String;

public class ImMethods {
    public static void main(String[] args) {
        String str = "Pw skill java";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length()); //space ki bhi value add hoti h
        System.out.println(str.charAt(3)); //location btata hai
       // int length = str.length(); //ye real life development me hota hai
        System.out.println(str.substring(3,8)); //ye tab jab hme koi bich ke index sse koi value cahye hoti hai tab hm stating aur ending ka index number dete hai
        System.out.println(str.indexOf("s")); //index ka number
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a")); //last value


    }

}
