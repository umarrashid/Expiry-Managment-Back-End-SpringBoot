package com.umar.newexpirybackendspringboot.expiryController;

import com.umar.newexpirybackendspringboot.expiryModel.ExpiryModel;
import com.umar.newexpirybackendspringboot.expiryService.ExpirySerivceImplementaion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class ExpiryController {

    @Autowired
    ExpirySerivceImplementaion expirySerivceImplementaion;

    @PostMapping("/add")
    public ExpiryModel addExpiryModel(@RequestBody ExpiryModel model){
        return expirySerivceImplementaion.addExpiry(model);
    }

    @GetMapping("/getAllData")
    public List<ExpiryModel> getDataAll(){
        return expirySerivceImplementaion.getAllData();
    }

    @PutMapping("/update/{id}")
    public ExpiryModel updateExpiryModel(@RequestBody ExpiryModel model, @PathVariable int id){
        return expirySerivceImplementaion.update(model, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDataModel(@PathVariable int id){
        expirySerivceImplementaion.deleteModel(id);
    }
}
