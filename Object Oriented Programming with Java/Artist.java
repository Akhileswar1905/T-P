/* Given the following two files in the server: one is abstract class and another is interface class.
---------------------------------------------------------------------------------------------------------
MusicDirector.java:

abstract class MusicDirector {
   private String name;

   public MusicDirector(String name) {
       this.name = name;
   }

   public abstract void directsMusic();

   public String getName() {
       return name;
   }
}

Composer.java:
------------------
interface Composer{
   void composesMelody();
}

You need to create another class named as "Artist.java" which extends abstract class MusicDirector and defines the
directsMusic() method and uses constructor and getter methods as well.
Also the Artist.java needs to implement the interface method composesMelody() from Composer.java interface.

Note: the Artist.java class should initialize the artist name through MusicDirector constructor. U can use
super keyword to achieve the same.

directsMusic() method should display following message:
"Artistname Directs Film Music- Mixing, Mastering, recording of Songs"

composesMelody() method should display following message:
"Artistname composes independent song, writes lyrics and creates melody."

Depending on the user input (Case-Insensitive), one of the above methods should be called.

The user inputs should consider only the following list of artists and the information of whether they are both 
Music directors and Composers or only Music Director or Only Composer. 
---------------------------------------------
AR RAHMAN:              Both Music Director and Composer.
ANIRUDH RAVICHANDER:    Both Music Director and Composer.
CHANDAN SHETTY:         Both Music Director and Composer.
THAMAN S:               Both Music Director and Composer.

ARIJIT SINGH:           Only composer
JAANI:                  Only composer

DSP:                    Only Music Director
PRITAM:                 Only Music Director

If any other artist name is entered apart from the above mentioned. Print "Invalid Artist Name" message.

Observe the given test cases for more clarity:

Test case examples:
----------------------
input=Arijit Singh
output=
ARIJIT SINGH composes independent song, writes lyrics and creates melody.

input=pritam
output=
PRITAM Directs Film Music- Mixing, Mastering, recording of Songs

input=AR RAHMAN
output=AR RAHMAN Directs Film Music- Mixing, Mastering, recording of Songs
Also, AR RAHMAN composes independent song, writes lyrics and creates melody.

input=arjun 
output=
Invalid Artist Name

Note: in the output Artist name should appear in Capitals and for comparison it should be case insensitive.
*/

// Start writing your code from here

import java.util.*;

public class Artist extends MusicDirector implements Composer {

    public Artist(String str) {
        super(str);
    }

    public static void main(String[] args) {
        List<String> dir = new ArrayList<>();
        List<String> comp = new ArrayList<>();

        dir.add("DSP");
        dir.add("PRITAM");

        comp.add("ARIJIT SINGH");
        comp.add("JAANI");

        dir.add("THAMAN S");
        comp.add("THAMAN S");
        dir.add("AR RAHMAN");
        comp.add("AR RAHMAN");
        dir.add("ANIRUDH RAVICHANDER");
        comp.add("ANIRUDH RAVICHANDER");
        dir.add("CHANDAN SHETTY");
        comp.add("CHANDAN SHETTY");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toUpperCase();
        if (dir.contains(str) && comp.contains(str))
            System.out.println(str + " Directs Film Music - Mixing, Mastering, recording of Songs Also," + str
                    + " composes independent song, writes lyrics and creates melody.");
        else if (dir.contains(str))
            System.out.println(str + " Directs Film Music - Mixing, Mastering, recording of Songs.");
        else if (comp.contains(str))
            System.out.println(str + " composes independent song, writes lyrics and creates melody.");
        else
            System.out.println("Invalid Artist Name");
    }

    public void directsMusic() {
        System.out.println(" Directs Film Music - Mixing, Mastering, recording Songs.");
    }

    public void composesMelody() {
        System.out.println(" composes independent song, writes lyrics and creates melody.");
    }

}
