public class CumulativePoetry {
    static String[] arrPoetryLines = new String[]{"the horse and the hound and the horn that belonged to",
                                            "the farmer sowing his corn that kept",
                                            "the rooster that crowed in the morn that woke",
                                            "the priest all shaven and shorn that married",
                                            "the man all tattered and torn that kissed",
                                            "the maiden all forlorn that milked",
                                            "that cow with the crumpled horn that tossed",
                                            "the dog that worried",
                                            "the cat that killed",
                                            "the rat that ate",
                                            "the malt that lay in",
                                            "the house that Jack built."};

    public static void main(String args[]) {

        if(args[0]!=null && args[0].equals("--reveal-for-day")) {
            if(args[1] != null && args[1].matches("^[0-9]*$")) {
                System.out.println(revealForDay(Integer.parseInt(args[1])));
            }
            else {
                System.out.println("Day argument entered incorrectly.");
            }
        }

        else if(args[0]!=null && args[0].equals("--recite")) {
            System.out.println(recite());
        }
    }

    public static String recite() {
        String poem = "";
        for(int i=1; i<=arrPoetryLines.length; i++) {
            poem = poem + "Day " + i +  " -\n";
            poem = poem + revealForDay(i) + "\n";
        }
        return poem;
    }

    public static String revealForDay(int day) {
        int index = arrPoetryLines.length - day;
        String poem = "This is " + arrPoetryLines[index] + "\n";
        for(int i=index+1; i<arrPoetryLines.length; i++) {
            poem = poem + "\t" + arrPoetryLines[i] + "\n";
        }
        return poem;
    }
}
