package com.trolleybest.backend;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.trolleybest.backend.model.Product;
import com.trolleybest.backend.repository.ProductRepository;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	CommandLineRunner seedProducts(ProductRepository productRepository) {
		return args -> {
			if (productRepository.count() > 0) {
				return;
			}

			LocalDateTime now = LocalDateTime.now();

			productRepository.saveAll(List.of(
					new Product(
							"Wireless Noise-Cancelling Headphones",
							"Bluetooth headphones with active noise cancellation and 30-hour battery life.",
							"SoundCore",
							149.99,
							25,
							"https://example.com/images/headphones.jpg",
							true,
							now),
					new Product(
							"4K Smart TV 55 Inch",
							"Ultra HD smart television with HDR support and built-in streaming apps.",
							"VisionMax",
							499.99,
							12,
							"https://example.com/images/smart-tv.jpg",
							true,
							now),
					new Product(
							"USB-C Fast Charger",
							"Compact 65W USB-C charger for phones, tablets, and laptops.",
							"ChargePro",
							39.99,
							80,
							"https://example.com/images/usb-c-charger.jpg",
							true,
							now),
					new Product(
							"Mechanical Gaming Keyboard",
							"RGB mechanical keyboard with tactile switches and programmable keys.",
							"KeyForge",
							89.99,
							40,
							"https://example.com/images/mechanical-keyboard.jpg",
							true,
							now),
					new Product(
							"Portable Bluetooth Speaker",
							"Water-resistant speaker with deep bass and 18-hour playback.",
							"BoomWave",
							59.99,
							35,
							"https://example.com/images/bluetooth-speaker.jpg",
							true,
							now)
			));
		};
	}
}
