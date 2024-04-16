package de.weyrich;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.StreamSupport;

@SpringBootApplication
@Slf4j
public class PropertyLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyLoggerApplication.class, args);
	}

	@EventListener
	public void handleContextRefresh(ContextRefreshedEvent event) {
		final var env = event.getApplicationContext().getEnvironment();
		log.info("====== Environment and configuration ======");
		log.info("Active profiles: {}", Arrays.toString(env.getActiveProfiles()));
		final MutablePropertySources sources = ((AbstractEnvironment) env).getPropertySources();
		StreamSupport.stream(sources.spliterator(), false)
				.filter(EnumerablePropertySource.class::isInstance)
				.map(ps -> ((EnumerablePropertySource<?>) ps).getPropertyNames())
				.flatMap(Arrays::stream)
				.distinct()
				.filter(prop ->  !prop.toLowerCase().contains("password"))
				.forEach(prop -> log.info("{}: {}", prop, env.getProperty(prop)));
		log.info("===========================================");
	}
}
