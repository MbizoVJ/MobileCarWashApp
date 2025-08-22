package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.FullWash;
import za.ac.cput.service.FullWashService;

import java.util.List;

@RestController
@RequestMapping("/fullwash")
public class FullWashController{

 private FullWashService service;
 @Autowired
    public FullWashController(FullWashService service){

     this.service = service;

     }

     @PostMapping("/create")
             public FullWash createFullWash(@RequestBody FullWash fullwash){
         return service.create(fullwash);

     }


     @GetMapping("/read/{serviceId}")
    public FullWash read(@PathVariable String serviceId){
     return  service.read(serviceId);
     }

     @PutMapping("/update")
    public FullWash update(@RequestBody FullWash fullWash){
     return service.update(fullWash);
     }

    /* @RequestMapping("/delete/{serviceId}")
    public boolean delete(@PathVariable String serviceId){
     return service.delete(serviceId);
     }
*/

     @GetMapping("/getAll")
    public List<FullWash> getAll(){
     return service.getAll();
     }
}


