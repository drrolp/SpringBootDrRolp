package com.auribox.springboot.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
/*
* En lugar de usar un archivo xml, configuramos los bean mediante anotaciones
* Para eso es importante declarar la clase como @Component ya que así será escaneada por la clase principal
* y dentro encontrará un @Bean que agregará al contexto de spring
*/
@Component
public class DataSourceConfig {

	/*
	* Bean para configurar el connection pool usando la información encontrada en:
	* http://hsqldb.org/doc/2.0/guide/dbproperties-chapt.html#dpc_connection_url
	*/
	@Bean
	public HikariDataSource dataSource(){
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:hsqldb:mem:.");
		config.setUsername("sa");
		config.setPassword("");
		return new HikariDataSource(config);
	}

}
