package be.thomasmore.froomi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import be.thomasmore.froomi.model.Apartment;
import be.thomasmore.froomi.repositories.ApartmentRepository;

import java.util.Optional;

@Controller
public class ApartmentController {
    @Autowired
    private ApartmentRepository apartmentRepository;

    @GetMapping("/apartmentlist")
    public String apartmentlist(Model model){
        Iterable<Apartment> apartments = apartmentRepository.findAll();
        model.addAttribute("apartments", apartments);
        return "apartmentlist";
    }

    @GetMapping({"/apartmentdetails","/apartmentdetails/{id}"})
    public String apartmentdetails(Model model, @PathVariable(required = false) Integer id){
        Optional<Apartment> optionalApartments = apartmentRepository.findById(id);

        if(optionalApartments.isPresent()){
            model.addAttribute("apartment", optionalApartments.get());
        }
        return "apartmentdetails";
    }
}
