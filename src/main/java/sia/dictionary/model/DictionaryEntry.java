package sia.dictionary.model;

public class DictionaryEntry {
    private String description;
    private Integer id;

    public DictionaryEntry(String description, Integer id) {
        this.description = description;
        this.id = id;
    }
    public String getDescription(){
        return description;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

}
