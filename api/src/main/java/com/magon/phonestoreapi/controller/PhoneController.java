package com.magon.phonestoreapi.controller;

import com.magon.phonestoreapi.model.Brand;
import com.magon.phonestoreapi.model.Phone;
import com.magon.phonestoreapi.service.PhoneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/phones")
@AllArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping
    public List<Phone> fetchAllPhones()
    {
        return phoneService.getAllPhones();
    }

    /**
     * Fetches the newest 5 phones per brand, sorted by the release date and price. <br><br>
     * This endpoint is mainly used on the landing page of the frontend. <br><br>
     * Uses the {@link PhoneService#getPhonesGroupedByBrand(int)} method.
     */
    @GetMapping("/newest-phones-per-brand")
    public Map<Brand, List<Phone>> fetchNewestPhonesPerBrand()
    {
        return phoneService.getPhonesGroupedByBrand(5);
    }
}
