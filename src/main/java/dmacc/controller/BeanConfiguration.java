package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Battalion;
import dmacc.beans.Company;
import dmacc.beans.Platoon;
import dmacc.beans.Regiment;
import dmacc.beans.Soldier;
import dmacc.beans.Squad;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Apr 1, 2021
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Soldier soldier() {
		Soldier bean = new Soldier();
		bean.setFirstName("Jimbob");
		return bean;
	}
	
	@Bean
	public Squad squad() {
		Squad bean = new Squad();
		return bean;
	}
	
	@Bean
	public Platoon platoon() {
		Platoon bean = new Platoon();
		return bean;
	}
	
	@Bean
	public Company company() {
		Company bean = new Company();
		return bean;
	}
	
	@Bean
	public Battalion battalion() {
		Battalion bean = new Battalion();
		return bean;
	}
	
	@Bean
	public Regiment regiment() {
		Regiment bean = new Regiment();
		return bean;
	}
}
