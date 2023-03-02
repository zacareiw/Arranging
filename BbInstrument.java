
import org.jfugue.pattern.Pattern;
import org.jfugue.theory.Note;

public class BbInstrument implements Instrument{

    private enum BbInstruments {
        B_FLAT_CLARINET,
        B_FLAT_BASS_CLARINET,
        B_FLAT_TRUMPET,
        B_FLAT_CORNET,
        B_FLAT_FLUGELHORN,
        B_FLAT_HORN,
        B_FLAT_TROMBONE,
        B_FLAT_BARITONE_HORN,
        B_FLAT_EUPHONIUM,
        B_FLAT_TUBA,
        B_FLAT_HELICON,
        B_FLAT_CORNET_A_PISTON,
        B_FLAT_TENOR_HORN
    }
    

    private BbInstruments aInstrument;

    public BbInstrument(BbInstruments pInstrument){

        aInstrument = pInstrument;

    }

    public BbInstruments getaInstrument() {
        return aInstrument;
    }

    public void setaInstrument(BbInstruments aInstrument) {
        this.aInstrument = aInstrument;
    }
    

    //TRANSPOSING METHODS
    public Pattern transposeBb(Pattern pPattern){

        return pPattern;

    }

    public Pattern transposeEb(Pattern pPattern){

        Pattern fPattern = new Pattern();
        String elements = pPattern.toString();

        for (String stringNote : elements.split(" ")){

            Note note = new Note(stringNote);

            int noteValue = note.getValue();

            Note transposedNote = new Note(noteValue + 5);

            fPattern.add(transposedNote);

        }

        return fPattern;
    }

    public Pattern transposeConcert(Pattern pPattern){

        Pattern fPattern = new Pattern();
        String elements = pPattern.toString();

        for (String stringNote : elements.split(" ")){

            Note note = new Note(stringNote);

            int noteValue = note.getValue();

            Note transposedNote = new Note(noteValue - 2);

            fPattern.add(transposedNote);

        }

        return fPattern;
    }

    

}


    

