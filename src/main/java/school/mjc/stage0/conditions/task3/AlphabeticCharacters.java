package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        // Convert character to lowercase for easier comparison
        char lowercaseChar = Character.toLowerCase(character);

        // Check if the character is a letter from the English alphabet
        if ((lowercaseChar >= 'a' && lowercaseChar <= 'z')) {
            // Check if the character is a vowel
            if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }

    public static void main(String[] args) {
        AlphabeticCharacters ac = new AlphabeticCharacters();
        ac.vowelDeterminer('a'); // Example usage
    }
}

