public class Stringbuilders {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("SIDDHI JADHAV");
        System.out.println(sc.capacity());  // capacity of string ( 16 + string char)

        System.out.println(sc.insert(6," chandrashekhar"));  // inserting a char at 6th position

        sc.setCharAt(2,'*'); // replacing char at 2nd position by *
        System.out.println(sc);

        System.out.println(sc.delete(2,4));  // deleting char from a specific range

        System.out.println(sc.deleteCharAt(3));  // deleting a char from a particular position

        System.out.println(sc.append(" is learning JAVA currently"));  // adding a sentence/word/letter at the end of string

        System.out.println(sc.reverse());  // reversing a string
        System.out.println(sc.reverse());  // again reversing

        System.out.println(sc.subSequence(3,8));  //extracting a particular sequence

        System.out.println(sc.replace(0,3,"SIDDHI")); //replacing a word from particular range

        sc.setLength(28);  // setting new length of string
        System.out.println(sc);



    }
}
