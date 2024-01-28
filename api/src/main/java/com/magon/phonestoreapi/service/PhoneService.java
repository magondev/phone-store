package com.magon.phonestoreapi.service;

import com.magon.phonestoreapi.model.Brand;
import com.magon.phonestoreapi.model.Phone;
import com.magon.phonestoreapi.repository.PhoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@AllArgsConstructor
@Service
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public List<Phone> getAllPhones()
    {
        return phoneRepository.findAll();
    }

    /**
     * Returns a list of phones, grouped by the brand of the phones. <br><br>
     * The list in each group is first sorted by release date (so you get the most recent phones first),
     * and then after the price.
     *
     * @param maxCountPerGroup defines how many phones will be listed in each group
     * @return Map of phones, grouped phone-brand, sorted by release date and price
     */
    public Map<Brand, List<Phone>> getPhonesGroupedByBrand(int maxCountPerGroup) {
        List<Phone> allPhones = getAllPhones();

        // Get all phones, grouped per brand
        Map<Brand, List<Phone>> phonesByBrand = allPhones.stream()
                .collect(Collectors.groupingBy(Phone::getBrand));

        // Sort by release date and price
        phonesByBrand.forEach((brand, phones) -> {
            phones.sort(Comparator.comparing(Phone::getReleaseDate).thenComparing(Phone::getPrice).reversed());
        });

        // If phone-count per group is greater than maxCountPerGroup, just cut the rest off
        phonesByBrand.forEach((brand, phones) -> {
            if (phones.size() > maxCountPerGroup) {
                phones.subList(maxCountPerGroup, phones.size()).clear();
            }
        });

        return phonesByBrand;
    }
}
