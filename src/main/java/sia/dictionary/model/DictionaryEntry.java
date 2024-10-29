package sia.dictionary.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.repository.CrudRepository;
@Data
@Entity
@Table(name = "entries")
public class DictionaryEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String description;



    // Hibernate expects entities to have a no-arg constructor,
    // though it does not necessarily have to be public.
    public DictionaryEntry() {}
    public DictionaryEntry(Integer id, String description) {
        this.description = description;
        this.id = id;
    }

}

