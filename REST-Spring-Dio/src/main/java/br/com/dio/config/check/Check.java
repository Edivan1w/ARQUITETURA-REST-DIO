package br.com.dio.config.check;


import java.net.InetAddress;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class Check implements HealthIndicator {

	@Override
	public Health health() {
		
		try {
			InetAddress address = InetAddress.getByName("localhost10");
			if(address.isReachable(10000)) {
				return Health.up().build();
			}
		} catch (Exception e) {
			return Health.down().withDetail("Motivo", e.getMessage()).build();
		}
		return Health.down().withDetail("Motivo", "Motivo desconhecido").build();
	}

}
