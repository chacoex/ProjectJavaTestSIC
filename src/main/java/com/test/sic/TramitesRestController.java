package com.test.sic;

import com.test.sic.entitys.Tramite;
import com.test.sic.persistence.TramiteSIC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class TramitesRestController {

    @Autowired
    private TramiteSIC tramiteSIC;

    @GetMapping(value = "/all")
    public List<Tramite> getAll() {
        return tramiteSIC.findAll();
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity find(@PathVariable Long id) {
        Optional<Tramite> optionalTramite =  tramiteSIC.findById(id);
        return ResponseEntity.ok(optionalTramite.get());
    }

    @PostMapping(value = "/savee")
    public ResponseEntity<Tramite> save(@RequestBody Tramite tramite) {
        Tramite obj = tramiteSIC.save(tramite);
        return new ResponseEntity<Tramite>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/deletee/{id}")
    public ResponseEntity<Tramite> delete(@PathVariable Long id) {
        Optional<Tramite> optionalTramite = tramiteSIC.findById(id);
        if (optionalTramite != null) {
            tramiteSIC.deleteById(id);
        } else {
            return new ResponseEntity<Tramite>(optionalTramite.get(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Tramite>(optionalTramite.get(), HttpStatus.OK);
    }
}
