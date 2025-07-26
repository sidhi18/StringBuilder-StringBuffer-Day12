import java.lang.StringBuffer;

public class StringBufferdemo {
    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer("Hello,everyone ");
        System.out.println(sc.capacity()); // capacity of sting (16+ string char)

        System.out.println(sc.insert(6, " __")); // inserting '__' in 6th place

        sc.setCharAt(7,'#'); // setting '#' at 7th place
        System.out.println(sc);

        System.out.println(sc.delete(6,9)); // deleting a specific range of  char
        System.out.println(sc.deleteCharAt(4)); // deleting a specific char

        System.out.println(sc.append(" My name is Siddhi")); // adding text at last of string

        System.out.println(sc.reverse()); // reversing the string
        System.out.println(sc.reverse());  // again reverse the string

        System.out.println(sc.subSequence(1,8)); // extracting a text

        System.out.println(sc.replace(0,sc.length(),"This is a program on StringBuffer")); // replacing the text from a particular range

        sc.setLength(30); // setting a new length
        System.out.println(sc);

        StringBuffer sc1 = new StringBuffer("light");
        System.out.println(sc.equals(sc1));





    }
}
