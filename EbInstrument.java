import org.jfugue.pattern.Pattern;
import org.jfugue.theory.Note;

public class EbInstrument implements Instrument{

    private enum EbInstruments {
        EB_CLARINET,
        ALTO_CLARINET,
        CONTRALTO_CLARINET,
        EB_ALTO_HORN,
        EB_BARITONE_HORN,
        EB_TUBA,
        EB_SOPRANO_CORNET,
        EB_TRUMPET,
        EB_CORNET,
        EB_FRENCH_HORN,
        SOPRANO_SAXOPHONE,
        ALTO_SAXOPHONE,
        BARITONE_SAXOPHONE,
        SOPRANO_CORNET,
        MELLOPHONE
    }    
    

    private EbInstruments aInstrument;

    public EbInstrument(EbInstruments pInstrument){

        aInstrument = pInstrument;

    }

    public EbInstruments getaInstrument() {
        return aInstrument;
    }

    public void setaInstrument(EbInstruments aInstrument) {
        this.aInstrument = aInstrument;
    }
    

    //TRANSPOSING METHODS
    public Pattern transposeEb(Pattern pPattern){

        return pPattern;

    }

    public Pattern transposeBb(Pattern pPattern){

        Pattern fPattern = new Pattern();
        String elements = pPattern.toString();

        for (String stringNote : elements.split(" ")){

            Note note = new Note(stringNote);

            int noteValue = note.getValue();

            Note transposedNote = new Note(noteValue + 7);

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

            Note transposedNote = new Note(noteValue - 3);

            fPattern.add(transposedNote);

        }

        return fPattern;
    }

    

}
