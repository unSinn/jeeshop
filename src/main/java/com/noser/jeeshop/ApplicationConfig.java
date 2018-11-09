package com.noser.jeeshop;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import javax.annotation.sql.DataSourceDefinition;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author airhacks.com
 */
@ApplicationPath("/api")
@OpenAPIDefinition(info = @Info(
    title = "Example application",
    version = "1.0.0",
    contact = @Contact(
        name = "Fabian Mächler",
        email = "fabian.maechler@noser.com",
        url = "http://www.noser.com")
)
)
@DataSourceDefinition(
    name = "java:app/MyApp/MyDS",
    className = "org.h2.jdbcx.JdbcDataSource",
    url = "jdbc:h2:mem:test"
)
public class ApplicationConfig extends Application {

}
