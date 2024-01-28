package com.magon.phonestoreapi;

import com.magon.phonestoreapi.model.Brand;
import com.magon.phonestoreapi.model.DisplayType;
import com.magon.phonestoreapi.model.OperatingSystem;
import com.magon.phonestoreapi.model.Phone;
import com.magon.phonestoreapi.repository.PhoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Bean
	CommandLineRunner runner(PhoneRepository repository)
	{
		return args -> {
			addTestData(repository);
		};
	}

	private static void addTestData(PhoneRepository repository) {
		addTestDataForIPhone(repository);
		addTestDataForSamsung(repository);
		addTestDataForHuawei(repository);
	}



	private static void addTestDataForIPhone(PhoneRepository repository) {
		Phone iphoneProMax15 = new Phone("iphone-pro-max-15", Brand.APPLE, "iPhone Pro Max 15", 512, DisplayType.OLED, 1599.00, OperatingSystem.iOS, LocalDate.of(2023, 10, 5));

		repository.findById("iphone-pro-max-15").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(iphoneProMax15)
		);

		Phone iphonePro15 = new Phone("iphone-pro-15", Brand.APPLE, "iPhone Pro 15", 256, DisplayType.OLED, 1499.00, OperatingSystem.iOS, LocalDate.of(2023, 10, 5));

		repository.findById("iphone-pro-15").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(iphonePro15)
		);

		Phone iphone15 = new Phone("iphone-15", Brand.APPLE, "iPhone 15", 256, DisplayType.OLED, 899.00, OperatingSystem.iOS, LocalDate.of(2023, 10, 5));

		repository.findById("iphone-15").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(iphone15)
		);

		Phone iphone15Plus = new Phone("iphone-15-plus", Brand.APPLE, "iPhone 15 Plus", 256, DisplayType.OLED, 790.90, OperatingSystem.iOS, LocalDate.of(2023, 10, 5));

		repository.findById("iphone-15-plus").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(iphone15Plus)
		);

		// Test-Daten für iPhone 14
		Phone iphoneProMax14 = new Phone("iphone-pro-max-14", Brand.APPLE, "iPhone Pro Max 14", 512, DisplayType.OLED, 1699.00, OperatingSystem.iOS, LocalDate.of(2024, 9, 15));

		repository.findById("iphone-pro-max-14").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(iphoneProMax14)
		);

		Phone iphonePro14 = new Phone("iphone-pro-14", Brand.APPLE, "iPhone Pro 14", 256, DisplayType.OLED, 1599.00, OperatingSystem.iOS, LocalDate.of(2024, 9, 15));

		repository.findById("iphone-pro-14").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(iphonePro14)
		);

		Phone iphone14 = new Phone("iphone-14", Brand.APPLE, "iPhone 14", 256, DisplayType.OLED, 999.00, OperatingSystem.iOS, LocalDate.of(2024, 9, 15));

		repository.findById("iphone-14").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(iphone14)
		);

		Phone iphone14Plus = new Phone("iphone-14-plus", Brand.APPLE, "iPhone 14 Plus", 256, DisplayType.OLED, 899.90, OperatingSystem.iOS, LocalDate.of(2024, 9, 15));

		repository.findById("iphone-14-plus").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(iphone14Plus)
		);
	}

	private static void addTestDataForSamsung(PhoneRepository repository) {
		Phone samsungGalaxyS22 = new Phone("samsung-galaxy-s22", Brand.SAMSUNG, "Samsung Galaxy S22", 256, DisplayType.OLED, 1299.00, OperatingSystem.ANDROID, LocalDate.of(2023, 9, 15));
		repository.findById("samsung-galaxy-s22").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS22)
		);

		Phone samsungGalaxyS22Plus = new Phone("samsung-galaxy-s22-plus", Brand.SAMSUNG, "Samsung Galaxy S22+", 256, DisplayType.OLED, 1299.00, OperatingSystem.ANDROID, LocalDate.of(2023, 9, 15));
		repository.findById("samsung-galaxy-s22-plus").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS22Plus)
		);

		Phone samsungGalaxyS22Ultra = new Phone("samsung-galaxy-s22-ultra", Brand.SAMSUNG, "Samsung Galaxy S22 Ultra", 512, DisplayType.OLED, 1499.00, OperatingSystem.ANDROID, LocalDate.of(2023, 9, 15));
		repository.findById("samsung-galaxy-s22-ultra").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS22Ultra)
		);

		Phone samsungGalaxyS23 = new Phone("samsung-galaxy-s23", Brand.SAMSUNG, "Samsung Galaxy S23", 256, DisplayType.OLED, 1399.00, OperatingSystem.ANDROID, LocalDate.of(2024, 8, 15));
		repository.findById("samsung-galaxy-s23").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS23)
		);

		Phone samsungGalaxyS23Plus = new Phone("samsung-galaxy-s23-plus", Brand.SAMSUNG, "Samsung Galaxy S23+", 256, DisplayType.OLED, 1399.00, OperatingSystem.ANDROID, LocalDate.of(2024, 8, 15));
		repository.findById("samsung-galaxy-s23-plus").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS23Plus)
		);

		Phone samsungGalaxyS23Ultra = new Phone("samsung-galaxy-s23-ultra", Brand.SAMSUNG, "Samsung Galaxy S23 Ultra", 512, DisplayType.OLED, 1599.00, OperatingSystem.ANDROID, LocalDate.of(2024, 8, 15));
		repository.findById("samsung-galaxy-s23-ultra").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS23Ultra)
		);

		Phone samsungGalaxyS24 = new Phone("samsung-galaxy-s24", Brand.SAMSUNG, "Samsung Galaxy S24", 256, DisplayType.OLED, 1499.00, OperatingSystem.ANDROID, LocalDate.of(2025, 7, 15));
		repository.findById("samsung-galaxy-s24").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS24)
		);

		Phone samsungGalaxyS24Plus = new Phone("samsung-galaxy-s24-plus", Brand.SAMSUNG, "Samsung Galaxy S24+", 256, DisplayType.OLED, 1499.00, OperatingSystem.ANDROID, LocalDate.of(2025, 7, 15));
		repository.findById("samsung-galaxy-s24-plus").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS24Plus)
		);

		Phone samsungGalaxyS24Ultra = new Phone("samsung-galaxy-s24-ultra", Brand.SAMSUNG, "Samsung Galaxy S24 Ultra", 512, DisplayType.OLED, 1699.00, OperatingSystem.ANDROID, LocalDate.of(2025, 7, 15));
		repository.findById("samsung-galaxy-s24-ultra").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS24Ultra)
		);
	}

	private static void addTestDataForHuawei(PhoneRepository repository) {
		Phone huaweiP50 = new Phone("huawei-p50", Brand.HUAWEI, "Huawei P50", 128, DisplayType.OLED, 899.00, OperatingSystem.ANDROID, LocalDate.of(2023, 8, 20));
		repository.findById("huawei-p50").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiP50)
		);

		Phone huaweiMate40Pro = new Phone("huawei-mate-40-pro", Brand.HUAWEI, "Huawei Mate 40 Pro", 256, DisplayType.OLED, 1099.00, OperatingSystem.ANDROID, LocalDate.of(2023, 8, 20));
		repository.findById("huawei-mate-40-pro").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiMate40Pro)
		);

		Phone huaweiP50Pro = new Phone("huawei-p50-pro", Brand.HUAWEI, "Huawei P50 Pro", 256, DisplayType.OLED, 1199.00, OperatingSystem.ANDROID, LocalDate.of(2023, 8, 20));
		repository.findById("huawei-p50-pro").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiP50Pro)
		);

		Phone huaweiP50Pocket = new Phone("huawei-p50-pocket", Brand.HUAWEI, "Huawei P50 Pocket", 128, DisplayType.OLED, 799.00, OperatingSystem.ANDROID, LocalDate.of(2023, 8, 20));
		repository.findById("huawei-p50-pocket").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiP50Pocket)
		);

		Phone huaweiP40ProPlus = new Phone("huawei-p40-pro-plus", Brand.HUAWEI, "Huawei P40 Pro+", 512, DisplayType.OLED, 1399.00, OperatingSystem.ANDROID, LocalDate.of(2020, 6, 1));
		repository.findById("huawei-p40-pro-plus").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiP40ProPlus)
		);

		Phone huaweiP40Lite5G = new Phone("huawei-p40-lite-5g", Brand.HUAWEI, "Huawei P40 lite 5G", 128, DisplayType.OLED, 499.00, OperatingSystem.ANDROID, LocalDate.of(2020, 6, 1));
		repository.findById("huawei-p40-lite-5g").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiP40Lite5G)
		);

		Phone huaweiP30ProNewEdition = new Phone("huawei-p30-pro-new-edition", Brand.HUAWEI, "Huawei P30 Pro New Edition", 256, DisplayType.OLED, 699.00, OperatingSystem.ANDROID, LocalDate.of(2020, 6, 1));
		repository.findById("huawei-p30-pro-new-edition").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiP30ProNewEdition)
		);

		Phone huaweiP40LiteE = new Phone("huawei-p40-lite-e", Brand.HUAWEI, "Huawei P40 lite E", 64, DisplayType.OLED, 299.00, OperatingSystem.ANDROID, LocalDate.of(2020, 5, 1));
		repository.findById("huawei-p40-lite-e").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiP40LiteE)
		);

		Phone huaweiPSmartPro = new Phone("huawei-p-smart-pro", Brand.HUAWEI, "Huawei P smart Pro", 128, DisplayType.OLED, 399.00, OperatingSystem.ANDROID, LocalDate.of(2020, 5, 1));
		repository.findById("huawei-p-smart-pro").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiPSmartPro)
		);

		Phone huaweiPSmart2020 = new Phone("huawei-p-smart-2020", Brand.HUAWEI, "Huawei P smart 2020", 64, DisplayType.OLED, 249.00, OperatingSystem.ANDROID, LocalDate.of(2020, 5, 1));
		repository.findById("huawei-p-smart-2020").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(huaweiPSmart2020)
		);
	}

}
