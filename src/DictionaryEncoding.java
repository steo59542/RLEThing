import java.util.ArrayList;

public class DictionaryEncoding
{

    private static ArrayList<String> words = new ArrayList<>();

    private static String input = new StringBuilder()
            .append("Is this the real life?\n")
            .append("Is this just fantasy?\n")
            .append("Caught in a landslide\n")
            .append("No escape from reality\n")
            .append("Open your eyes\n")
            .append("Look up to the skies and see\n")
            .append("I'm just a poor boy, I need no sympathy\n")
            .append("Because I'm easy come, easy go\n")
            .append("A little high, little low\n")
            .append("Anyway the wind blows, doesn't really matter to me, to me\n")
            .append("Mama, just killed a man\n")
            .append("Put a gun against his head\n")
            .append("Pulled my trigger, now he's dead\n")
            .append("Mama, life had just begun\n")
            .append("But now I've gone and thrown it all away\n")
            .append("Mama, ooo\n")
            .append("Didn't mean to make you cry\n")
            .append("If I'm not back again this time tomorrow\n")
            .append("Carry on, carry on, as if nothing really matters\n")
            .append("Too late, my time has come\n")
            .append("Sends shivers down my spine\n")
            .append("Body's aching all the time\n")
            .append("Goodbye everybody I've got to go\n")
            .append("Gotta leave you all behind and face the truth\n")
            .append("Mama, ooo (anyway the wind blows)\n")
            .append("I don't want to die\n")
            .append("I sometimes wish I'd never been born at all\n")
            .append("I see a little silhouetto of a man\n")
            .append("Scaramouch, scaramouch will you do the fandango\n")
            .append("Thunderbolt and lightning very very frightening me\n")
            .append("Gallileo, Gallileo,\n")
            .append("Gallileo, Gallileo,\n")
            .append("Gallileo Figaro - magnifico\n")
            .append("But I'm just a poor boy and nobody loves me\n")
            .append("He's just a poor boy from a poor family\n")
            .append("Spare him his life from this monstrosity\n")
            .append("Easy come easy go will you let me go\n")
            .append("Bismillah! No we will not let you go - let him go\n")
            .append("Bismillah! We will not let you go - let him go\n")
            .append("Bismillah! We will not let you go let me go\n")
            .append("Will not let you go let me go (never)\n")
            .append("Never let you go let me go\n")
            .append("Never let me go ooo\n")
            .append("No, no, no, no, no, no, no\n")
            .append("Oh mama mia, mama mia, mama mia let me go\n")
            .append("Beelzebub has a devil put aside for me\n")
            .append("For me\n")
            .append("For me\n")
            .append("So you think you can stone me and spit in my eye\n")
            .append("So you think you can love me and leave me to die\n")
            .append("Oh baby, can't do this to me baby\n")
            .append("Just gotta get out just gotta get right outta here\n")
            .append("Ooh yeah, ooh yeah\n")
            .append("Nothing really matters\n")
            .append("Anyone can see\n")
            .append("Nothing really matters nothing really matters to me\n")
            .append("Anyway the wind blows")
            .toString();

    public static void main(String[] args)
    {
        System.out.println(input);
        System.out.println();
        System.out.println("Length of input string " + input.length() + " characters.");

        String[] bits = input.split(" ");
        ArrayList<String> dictionary = new ArrayList<>();

        for(String word:bits){
            if (!dictionary.contains(word)) dictionary.add(word);
            System.out.print(dictionary.indexOf(word) + ",");
            wordCount++;
        }

        System.out.println();
        System.out.println("Length of output pattern " + wordCount + " numbers.");
    }
}