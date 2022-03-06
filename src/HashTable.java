import java.util.Arrays;

public class HashTable {

    private final int tableSize = 50000;
    private final Anagram[] myTable = new Anagram[tableSize];


    public int hashCode(String key, int tableSize) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
        }
        return sum % tableSize;
    }

    public void add(Anagram theAnagram) {
        int count = 1;
        int initHash = hashCode(theAnagram.getKey(), tableSize);
        if (myTable[initHash] != null) {
            int reHash;
            do {
                reHash = (hashCode(theAnagram.getKey(), tableSize) + (count * count)) % tableSize;
                count++;
            } while (myTable[reHash] != null);
            myTable[reHash] = theAnagram;
        } else {
            myTable[initHash] = theAnagram;
        }
    }

    public int search(String theWord) {
        int theLocation;

        char[] charArray = theWord.toCharArray();
        Arrays.sort(charArray);

        String theKey = Arrays.toString(charArray);

        theLocation = hashCode(theKey, tableSize);

        return theLocation;
    }


}
