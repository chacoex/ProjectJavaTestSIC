package com.test.sic;

import com.test.sic.entitys.Empleado;
import com.test.sic.entitys.Persona;
import com.test.sic.entitys.Tramite;
import com.test.sic.persistence.EmpleadoSIC;
import com.test.sic.persistence.PersonaSIC;
import com.test.sic.persistence.TramiteSIC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TramitesControlador {

    @Autowired
    private PersonaSIC personaSIC;
    @Autowired
    private EmpleadoSIC empleadoSIC;
    @Autowired
    private TramiteSIC tramiteSIC;

    @RequestMapping("/persona")
    public String persona(Model model){
        System.out.println("test");
        model.addAttribute("list", personaSIC.findAll());
        System.out.println(model);
        return "persona";
    }

    @GetMapping("/save_persona/{id_persona}")
    public String showSavePerson(@PathVariable("id_persona") Long id, Model model) {
        if (id != null && id != 0) {
            model.addAttribute("persona", personaSIC.findById(id));
        } else {
            model.addAttribute("persona", new Persona());
        }
        return "save";
    }

    @PostMapping("/save_persona")
    public String save_persona(Persona persona, Model model) {
        personaSIC.save(persona);
        return "redirect:/";
    }

    @GetMapping("/delete_persona/{id}")
    public String delete_pesona(@PathVariable Long id, Model model) {
        personaSIC.deleteById(id);

        return "redirect:/";
    }

    @PostMapping("/save_empleado")
    public String save_empleado(Empleado empleado, Model model) {
        empleadoSIC.save(empleado);
        return "redirect:/";
    }

    @RequestMapping("/tramite")
    public String index(Model model){
        model.addAttribute("list", tramiteSIC.findAll());
        System.out.println(model);
        return "index";
    }

    @GetMapping("/save/{numero}")
    public String showSave(@PathVariable("numero") Long id, Model model) {
        if (id != null && id != 0) {
            model.addAttribute("numero", tramiteSIC.findById(id));
        } else {
            model.addAttribute("numero", new Tramite());
        }
        return "save";
    }

    @PostMapping("/save")
    public String save(Tramite tramite, Model model) {
        tramiteSIC.save(tramite);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        tramiteSIC.deleteById(id);

        return "redirect:/";
    }




}
