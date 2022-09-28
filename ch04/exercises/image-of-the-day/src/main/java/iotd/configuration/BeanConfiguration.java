package iotd.configuration;

import iotd.services.CacheService;
import iotd.services.MemoryCacheService;
import org.springframework.context.annotation.Bean;

public class BeanConfiguration {

	@Bean
	public CacheService cacheService() {
		return new MemoryCacheService();
	}	
}
