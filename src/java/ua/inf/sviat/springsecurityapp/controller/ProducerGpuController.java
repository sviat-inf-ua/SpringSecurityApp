package ua.inf.sviat.springsecurityapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import ua.inf.sviat.springsecurityapp.model.ProducerGpu;
import ua.inf.sviat.springsecurityapp.service.ProducerGpuService;

/**
 * Created by Sviatoslav on 24.04.2017.
 */
@Controller
@RequestMapping("/admin/producerGpu")
@SessionAttributes("producerGpu")
public class ProducerGpuController {

    @Autowired
    private ProducerGpuService producerGpuService;

    @ModelAttribute("producerGpu")
    public ProducerGpu getForm(){
        return new ProducerGpu();
    }

    @GetMapping
    public String show(Model model){
        model.addAttribute("producerGpus", producerGpuService.findAll());
        return "producerGpu";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model){
        model.addAttribute("producerGpu", producerGpuService.findOne(id));
        show(model);
        return "producerGpu";
    }

    @PostMapping
    public String save (@ModelAttribute("producerGpu") ProducerGpu entity, SessionStatus status) {
        producerGpuService.save(entity);
        status.setComplete();
        return "redirect:/admin/producerGpu";
    }
    @GetMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        producerGpuService.delete(id);
        return "redirect:/admin/producerGpu";
    }
    @RequestMapping("/cancel")
    public String cancel (SessionStatus status){
        status.setComplete();
        return "redirect:/admin/producerGpu";
    }
}
