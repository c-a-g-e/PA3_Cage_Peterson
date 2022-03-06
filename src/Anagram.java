import java.util.List;

public class Anagram {

    private final String myAnagramKey;
    private List<String> myValue;

    public Anagram(String theKey, String theValue) {
        myAnagramKey = theKey;
        addValue(theValue);
    }

    public String getKey() {
        return myAnagramKey;
    }

    public List<String> getValues() {
        return myValue;
    }

    public void addValue(String theValue) {
        myValue.add(theValue);
    }


}
