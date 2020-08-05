package rs.tfzr.aleksa.tfzrseminarski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.tfzr.aleksa.tfzrseminarski.model.Tim;
import rs.tfzr.aleksa.tfzrseminarski.repository.TimRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/tim")
public class TimControllerImpl {

    @Autowired
    TimRepository repository;

    @GetMapping("/brzonapravi")
    public String brzoNapravi () {
        repository
                .save(new Tim(0, "Crvena Zvezda", 1945, "Antic"));

        repository.
                saveAll(Arrays.asList(
                        new Tim(1, "Partizan", 1945, "Neko"),
                        new Tim(2, "Chelsea", 1893, "Pep"),
                        new Tim(3, "Arsenal", 1863, "Arsene Wanger")
                ));

        return "Napravljeni plejsholderi za timove";
    }

    @GetMapping("/timovis")
    public List<Tim> getSviTimovi() {
        System.out.println("Uzimam sve timove");

        List<Tim> timovi = new ArrayList<>();
        repository.findAll().forEach(timovi::add);

        return timovi;
    }

    @PostMapping ("/timovis/napravi")
    public Tim postTim (@RequestBody Tim tim) {
        Tim _tim =
                repository
                .save(new Tim(
                        tim.getTim_id(), tim.getTim_ime(), tim.getTim_osnovan(), tim.getTim_trener()
                ));

        return _tim;
    }

    @DeleteMapping("/timovis/{id}")
    public ResponseEntity<String> obrisiTim(@PathVariable("id") int tim_id) {
        System.out.println("Brise se tim sa id: " + tim_id + "... ");

        repository.deleteById(tim_id);

        return new ResponseEntity<>("Tim je uspesno obrisan!", HttpStatus.OK);
    }

    @PutMapping("/timovis/{id}")
    public ResponseEntity<Tim> updateTim(@PathVariable("id") int tim_id, @RequestBody Tim tim) {
        System.out.println("Izmenjeni podaci za tim " + tim_id + "... ");

        Optional<Tim> timData = repository.findById(tim_id);

        if (timData.isPresent()) {
            Tim _tim = timData.get();
            _tim.setTim_ime(tim.getTim_ime());
            _tim.setTim_osnovan(tim.getTim_osnovan());
            _tim.setTim_trener(tim.getTim_trener());
            return new ResponseEntity<>(repository.save(_tim), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
