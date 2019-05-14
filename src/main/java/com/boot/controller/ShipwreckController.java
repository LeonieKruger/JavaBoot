package com.boot.controller;

import com.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShipwreckController {

    //each method handles crud operation for shipwreck resource
    //all code here is pure MVC code

    @RequestMapping("/")
    public String home(){
        return  "Hello World";
    }

//    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET) // appends value  on above annotation value
//    public List<Shipwreck> list(){
//
//        return  ShipwreckStub.list();
//    }
//
//    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
//    public Shipwreck create(@RequestBody Shipwreck shipwreck){
//
//        return  ShipwreckStub.create(shipwreck);
//    }
//
//    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
//    public Shipwreck get(@PathVariable long id){
//
//        return  ShipwreckStub.get(id);
//    }
//
//    @RequestMapping(value = "shipwrecks", method = RequestMethod.PUT)
//    public Shipwreck update(@PathVariable long id,@RequestBody Shipwreck shipwreck){
//
//        return  ShipwreckStub.update(id,shipwreck);
//    }
//
//    @RequestMapping(value = "shipwrecks", method = RequestMethod.DELETE)
//    public Shipwreck delete(@PathVariable long id){
//
//        return  ShipwreckStub.delete(id);
//    }
}
