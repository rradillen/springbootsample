/* ----------------------------------------------------------------------------
*     PROJECT : EURES
*
*     PACKAGE : eu.europa.ec.empl.eures.reg2018.db.conv.api.spring.conf
*        FILE : DbConverterApiApp.java
*
*  CREATED BY : ARHS Developments
*          ON : Dec 27, 2016
*
* MODIFIED BY : ARHS Developments
*          ON : $LastChangedDate
*     VERSION : $LastChangedRevision
*
* ----------------------------------------------------------------------------
* Copyright (c) 2011 European Commission - DG EMPL
* ----------------------------------------------------------------------------
*/
package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

/**

*/
@SuppressWarnings("RedundantInterfaceDeclaration")
@SpringBootApplication
public class DbConvApiApp extends SpringBootServletInitializer implements WebApplicationInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DbConvApiApp.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DbConvApiApp.class, args);
	}
}
