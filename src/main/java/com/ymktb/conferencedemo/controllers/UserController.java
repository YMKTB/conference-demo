package com.ymktb.conferencedemo.controllers;

import com.ymktb.conferencedemo.models.Anno;
import com.ymktb.conferencedemo.repositories.AnnoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AnnoRepository annoRepository;

/*    @GetMapping
    public List<Anno> list(){
        return annoRepository.findAll();
    }*/

    @GetMapping
    @RequestMapping("/")
    public String gets(Model model){
        model.addAttribute("name", "ahmetcim");

        return "user";
    }

    @GetMapping
    @RequestMapping("{id}")
    public Anno get(@PathVariable Long id){
        return (Anno) annoRepository.getOne(id);
    }

    @PostMapping
    public Anno create(@RequestBody final Anno anno){
        return annoRepository.saveAndFlush(anno);
    }

    @RequestMapping(value = "{id}" , method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        annoRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}" , method = RequestMethod.PUT)
    public Anno update(@PathVariable Long id, @RequestBody Anno anno){
        Anno existingAnno = (Anno) annoRepository.getOne(id);
        BeanUtils.copyProperties(anno,existingAnno,"id");
        return annoRepository.saveAndFlush(existingAnno);
    }

}
