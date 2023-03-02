import org.jfugue.pattern.Pattern;
import org.jfugue.theory.Note;

public class CInstrument implements Instrument{

    private enum ConcertInstrument {
        GUITAR,
        VIOLIN,
        VIOLA,
        CELLO,
        DOUBLE_BASS,
        FLUTE,
        PICCOLO,
        OBOE,
        ENGLISH_HORN,
        CLARINET,
        BASS_CLARINET,
        BASSOON,
        CONTRABASSOON,
        TRUMPET,
        FRENCH_HORN,
        TROMBONE,
        BASS_TROMBONE,
        TUBA,
        TIMPANI,
        SNARE_DRUM,
        BASS_DRUM,
        CYMBALS,
        TRIANGLE,
        TAMBOURINE,
        XYLOPHONE,
        MARIMBA,
        GLOCKENSPIEL,
        HARP,
        PIANO
    }

    private ConcertInstrument aInstrument;

    public CInstrument(ConcertInstrument pInstrument){

        aInstrument = pInstrument;

    }

    public ConcertInstrument getaInstrument() {
        return aInstrument;
    }

    public void setaInstrument(ConcertInstrument aInstrument) {
        this.aInstrument = aInstrument;
    }
    

    //TRANSPOSINGMETHODS
    public Pattern transposeConcert(Pattern pPattern){

        return pPattern;

    }

    public Pattern transposeBb(Pattern pPattern){

        Pattern fPattern = new Pattern();
        String elements = pPattern.toString();

        for (String stringNote : elements.split(" ")){

            Note note = new Note(stringNote);

            int noteValue = note.getValue();

            Note transposedNote = new Note(noteValue + 2);

            fPattern.add(transposedNote);

        }

        return fPattern;
    }

    public Pattern transposeEb(Pattern pPattern){

        Pattern fPattern = new Pattern();
        String elements = pPattern.toString();

        for (String stringNote : elements.split(" ")){

            Note note = new Note(stringNote);

            int noteValue = note.getValue();

            Note transposedNote = new Note(noteValue - 5);

            fPattern.add(transposedNote);

        }

        return fPattern;
    }

    

}
