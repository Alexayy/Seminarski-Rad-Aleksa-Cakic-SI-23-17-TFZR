package rs.tfzr.aleksa.tfzrseminarski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.tfzr.aleksa.tfzrseminarski.model.Igrac;
import rs.tfzr.aleksa.tfzrseminarski.model.Tim;
import rs.tfzr.aleksa.tfzrseminarski.repository.IgracRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class IgracControllerImpl {

    @Autowired
    IgracRepository repository;

    @GetMapping("/brzonapravi")
    public String brzoNapravi () {
        repository.save(new Igrac(0, "Aleksa", "Cakic", 26, "Arsenal", 1996));

        repository.
                saveAll(Arrays.asList(
                        new Igrac(1, "Frank", "Lampard", 8, "Chelsea", 1996),
                        new Igrac(2, "Thiery", "Henry", 10, "Arsenal", 1996),
                        new Igrac(3, "Samir", "Nasri", 8, "Maseielle", 1996)
                ));

        return "Napravljeni su plejsholderi!";
    }

    // TODO - Setup endpoints
    /**
     * /api/igracis
     * /api/igracis/ + id
     */

    @GetMapping("/igracis")
    public List<Igrac> getSviIgraci() {
        System.out.println("Uzimam sve igrace");

        List<Igrac> igraci = new ArrayList<>();
        repository.findAll().forEach(igraci::add);

        return igraci;
    }

    @PostMapping(value = "/igracis/napravi")
    public Igrac postIgrac(@RequestBody Igrac igrac) {
        Igrac _igrac =
                repository
                        .save(new Igrac(
                                igrac.getIgrac_id(), igrac.getIgrac_ime(), igrac.getIgrac_prezime(), igrac.getIgrac_broj(), igrac.getIgrac_tim(), igrac.getIgrac_godiste()
                        ));

        return _igrac;
    }

    @DeleteMapping("/igracis/{id}")
    public ResponseEntity<String> obrisiIgraca(@PathVariable("id") int igrac_id) {
        System.out.println("Brise se igrac sa id: " + igrac_id + "... ");

        repository.deleteById(igrac_id);

        return new ResponseEntity<>("Igrac je uspesno obrisan!", HttpStatus.OK);
    }

    @PutMapping("/igracis/{id}") // <3
    public ResponseEntity<Igrac> updateIgrac(@PathVariable("id") int igrac_id, @RequestBody Igrac igrac) {
        System.out.println("Izmenjeni podaci za igraca " + igrac_id + "... ");

        Optional<Igrac> igracData = repository.findById(igrac_id);

        if (igracData.isPresent()) {
            Igrac _igrac = igracData.get();
            _igrac.setIgrac_ime(igrac.getIgrac_ime());
            _igrac.setIgrac_prezime(igrac.getIgrac_prezime());
            _igrac.setIgrac_broj(igrac.getIgrac_broj());
            _igrac.setIgrac_godiste(igrac.getIgrac_godiste());
            _igrac.setIgrac_tim(igrac.getIgrac_tim());
            return new ResponseEntity<>(repository.save(_igrac), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
