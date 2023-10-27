package com.umar.newexpirybackendspringboot.expiryService;

import com.umar.newexpirybackendspringboot.expiryModel.ExpiryModel;
import com.umar.newexpirybackendspringboot.repository.ExpiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpirySerivceImplementaion implements ExpiryServiceInterface {

    @Autowired
    ExpiryRepository expiryRepository;
    @Override
    public ExpiryModel addExpiry(ExpiryModel expiryModel) {
        return expiryRepository.save(expiryModel);
    }

    @Override
    public void deleteModel(int id) {
        ExpiryModel model = expiryRepository.findById(id).orElseThrow();
        expiryRepository.deleteById(id);
    }

    @Override
    public ExpiryModel update(ExpiryModel model, int id) {
        ExpiryModel updateModel = expiryRepository.findById(id).orElseThrow();
        updateModel.setBrandName(model.getBrandName());
        updateModel.setSupplierName(model.getSupplierName());
        updateModel.setExpiryDate(model.getExpiryDate());
        return expiryRepository.save(updateModel);
    }

    @Override
    public List<ExpiryModel> getAllData(){
        return expiryRepository.findAll();
    }
}
