public class CeaserCypher {
    public String cypher(String encryptionString, int key) {
        String errorMessage = "";
        if (key < 1 || key > 25) {
            errorMessage = "The key must be between 1 and 25";
        } else {
            String cypherText = "";
            int length = encryptionString.length();
            for (int i = 0; i < length; i++) {
                char ch = encryptionString.charAt(i);
                if (Character.isLetter(ch));
            }
            return cypherText;
        }
        return errorMessage;
    }
}
