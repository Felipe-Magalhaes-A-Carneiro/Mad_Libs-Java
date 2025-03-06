public class MadLibs {

    /*
    This program generates a mad libbed story;
    Author: Felipe Magalhaes
    Date: 03/03/2025
     */

    public static void main(String[] args) {

        String name1 = "Batman";
        String name2 = "Joker";

        int number = 9999;

        String adjective1 = "strong";
        String adjective2 = "long";
        String adjective3 = "dark";

        String verb1 = "fight";

        String noun1 = "batarang";
        String noun2 = "weapon";
        String noun3 = "money";
        String noun4 = "bandit";
        String noun5 = "justice";
        String noun6 = "batmobile";

        String place1 = "Gothan City";

        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". It is goind to be a " + adjective2 + " day! Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of froxen " + noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the word.";

        System.out.println(story);
    }
}