//Q.5 Demonstrate the use of repeat(), strip(),trim(), isBlank(), indent(), transform(), stripIndent(),
// translateEscapes(),tripleQuotes and formatted() methods.

package beyondjava8_features2;

public class question_5 {
    public static void main(String[] args) {
        //repeat
        String toBeRepeated = "Hello";
        System.out.println(toBeRepeated.repeat(2));

        //strip
        String string = "\n   Hello\u2005";
        System.out.println(string.strip());

        //trim
        System.out.println(string.trim());

        //isBlank
        String blankString = "  \n";
        System.out.println(blankString.isBlank());

        //indent()
        System.out.println("Hello World".indent(5));

        //transform
        String text = "good day";
        String reverseText = text.transform(str-> new StringBuilder(str)
                .reverse().toString());
        System.out.println(reverseText);

        //stripIndent
        String string3 = """
                \tHello
                \t\t\tWorld
                \thow are you""";
        //System.out.println(string3);
        System.out.println(string3.stripIndent());

        //translateEscapes()
        String str = "rohit\\n gupta";
        System.out.println(str.translateEscapes());

        //triple Qoutes
        String multilineString = """
                line1
                     line2""";
        System.out.println(multilineString);

        //formated()
        System.out.println("Rohit's Age is :%d".formatted(21));

    }

}
