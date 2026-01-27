import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        int hasSize = languages.size();
        return hasSize == 0 ? true : false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String first = languages.get(0);
        return first;
       
    }

    public int count() {
        int listSize = languages.size();
        return listSize;
    }

    public boolean containsLanguage(String language) {
        boolean hasLanguage = languages.contains(language);
        return hasLanguage;
    }

    public boolean isExciting() {
        if(languages.contains("Java") || languages.contains("Kotlin")){
            return true;
        }else{
            return false;
        }
    }
}
