package Experimenting;

import org.jfugue.theory.Note;
import org.jfugue.pattern.*;



public class Music {


    /*
     * @pre must be monophonic
     * @post must return a polyphonic, two voice system
     */
    public static Pattern transposePattern(Pattern pPattern){

        Pattern fPattern = new Pattern();
        String elements = pPattern.toString();

        for (String stringNote : elements.split(" ")){

            Note note = new Note(stringNote);

            int noteValue = note.getValue();

            Note transposedNote = new Note(noteValue + 4);

            fPattern.add(transposedNote);

        }

        return fPattern;
    }

}

