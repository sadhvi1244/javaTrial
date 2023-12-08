package String;

public class MoreOnMutableStr {
    public static void main(String[] args) {
    //    StringBuffer sb = new StringBuffer(); //same with StringBuilder uski bhi initial capacity 16 hi hai
    //    System.out.println(sb.capacity());
    //    sb.append("abcdefghijklmnop");
     //   System.out.println(sb.capacity());
     //   sb.append("s");
      //  System.out.println(sb.capacity()); //means how character you can add
      //  System.out.println(sb.length()); //how many character is present

       // StringBuffer sb2 = new StringBuffer("Sachin"); //6 + 16 = 22 jb yaha per koi value de do
        //System.out.println(sb2);
       // System.out.println(sb2.capacity());
        //System.out.println(sb2.charAt(1));
        //sb2.setCharAt(1,'A'); //SAchin //(yaha per sout isiliye nhi likhe kyuki ye function already uper call ho chuka hai)
        //System.out.println(sb2);

    //    StringBuilder sb = new StringBuilder(150);
    //    System.out.println(sb.capacity());
    //    sb.append("java");
     //   System.out.println(sb); //jaige ab capacity to 150 ka le liye hai but hmne use to syf 4 kiye hai
     //   sb.trimToSize(); //to iske liye hm trimToSize() method use kiye hai
     //   System.out.println(sb.capacity());

       StringBuilder sb = new StringBuilder("ppwjava");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
