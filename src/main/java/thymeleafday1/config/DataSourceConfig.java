package thymeleafday1.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sqlite.SQLiteDataSource;

import java.sql.SQLException;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(destroyMethod = "", name = "EmbeddeddataSource")
    public DataSource dataSource() throws SQLException {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:" + "sample.db");
        dataSourceBuilder.type(SQLiteDataSource.class);

        return dataSourceBuilder.build();
    }

}