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
		// Test-data for iPhone
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

		// Test-data for samsung
		Phone samsungGalaxyS22 = new Phone("samsung-galaxy-s22", Brand.SAMSUNG, "Samsung Galaxy S22", 256, DisplayType.OLED, 1299.00, OperatingSystem.ANDROID, LocalDate.of(2023, 9, 15));
		repository.findById("samsung-galaxy-s22").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS22)
		);

		Phone samsungGalaxyS22Ultra = new Phone("samsung-galaxy-s22-ultra", Brand.SAMSUNG, "Samsung Galaxy S22 Ultra", 512, DisplayType.OLED, 1499.00, OperatingSystem.ANDROID, LocalDate.of(2023, 9, 15));
		repository.findById("samsung-galaxy-s22-ultra").ifPresentOrElse(
				p -> System.out.println("Phone already exists. Skipping " + p),
				() -> repository.insert(samsungGalaxyS22Ultra)
		);

		// Test-data for huawei
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

	}

}
