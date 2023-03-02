import org.jfugue.pattern.Pattern;

public interface Instrument {

    public Pattern transposeBb(Pattern pPattern);
    public Pattern transposeEb(Pattern pPattern);
    public Pattern transposeConcert(Pattern pPattern);

    

    
}
