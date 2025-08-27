package dragonshoutproject;

import java.io.*;
import java.util.*;

/**
 * @author Sai Thupakula 2B
 * 
 * class that translates English words dragon language
 * loads translations from a file and allows to add new ones
 * Precondition: translation file must exist and be formatted correctly
 * Post condition: translations are stored and can be retrieved or updated.
 */
public class DragonTranslator {
    private Map<String, String> translationMap;
    private static final String fileName = "src/dragonshoutproject/dragonShouts.dat";

    /**
     * Constructs a DragonTranslator object
     * Precondition: The file "dragonShouts.dat" must be available in the project directory
     * Post condition: Loads existing translations into a map for easy lookup
     */
    public DragonTranslator() {
        translationMap = new HashMap<>();
        loadTranslations();
    }

    /**
     * Loads translations from the file into the map
     * Precondition: file must exist and be formatted with "EnglishWord DragonWord" on each line
     * Post condition: The translation map is populated with given word pairs
     */
    private void loadTranslations() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    translationMap.put(parts[0].toLowerCase(), parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading translations: " + e.getMessage());
        }
    }

    /**
     * retrieves the dragon translation for a given english word
     * @param word the english word to translate
     * @return the corresponding dragon translation, or "??" if not found
     * Precondition: valid English word is provided as input
     * Post condition: returns translated Dragon word if found, else returns "??"
     */
    public String getTranslation(String word) {
        String lowercaseWord = word.toLowerCase();

        for (Map.Entry<String, String> entry : translationMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(lowercaseWord)) {
                return entry.getKey();
            }
        }
        return "??";
    }

    /**
     * adds a new english dragon word pair to translation map and updates file
     * @param english The english word to add
     * @param dragon The corresponding dragon translation
     * @return true if the word was successfully added, false if it already exists
     * Precondition: both words must be valid strings. cannot be empty
     * Post condition: the new translation pair is added to map and written to file.
     */
    public boolean addTranslation(String english, String dragon) {
        english = english.toLowerCase();

        if (translationMap.containsKey(english)) {
            return false;
        }

        translationMap.put(dragon, english);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(dragon + " " + english);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing translation: " + e.getMessage());
            return false;
        }

        return true;
    }

    /**
     * returns string representation of all stored translations
     * @return a formatted string containing all English/Dragon word pairs
     * Precondition: translation map may or may not have entries
     * Post condition: string representation of the map is returned
     */
    @Override
    public String toString() {
        return translationMap.toString();
    }
}
