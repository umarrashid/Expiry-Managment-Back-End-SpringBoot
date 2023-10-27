package com.umar.newexpirybackendspringboot.expiryService;

import com.umar.newexpirybackendspringboot.expiryModel.ExpiryModel;

import java.util.List;

public interface ExpiryServiceInterface {

     ExpiryModel addExpiry(ExpiryModel expiryModel);

     List<ExpiryModel> getAllData();

     ExpiryModel update(ExpiryModel model, int id);

     void deleteModel(int id);
}
