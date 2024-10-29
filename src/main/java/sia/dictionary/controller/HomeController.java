package sia.dictionary.controller;

import org.springframework.web.bind.annotation.*;
import sia.dictionary.model.DictionaryEntry;
import sia.dictionary.model.DictionaryRepository;

import java.util.Optional;

// Rest
@RestController
public class HomeController {


    private final DictionaryRepository dictionaryRepository;

    public HomeController(DictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }

    @GetMapping("/entries")
    public Iterable<DictionaryEntry> findAllEntries() {
        return this.dictionaryRepository.findAll();
    }

    @GetMapping("/entries/{id}")
    @CrossOrigin(origins = "http://localhost:60879" )
    public Optional<DictionaryEntry> findEntryById(@PathVariable Integer id) {
        return this.dictionaryRepository.findById(id);
    }

    @PostMapping("/entries")
    public DictionaryEntry addOneEntry(@RequestBody DictionaryEntry dictionaryEntry) {
//
        return this.dictionaryRepository.save(dictionaryEntry);
    }

}
