package tn.esprit.springproject.Config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI(){
        return  new OpenAPI().info(infoAPI());
    }
    public Info infoAPI(){
        return  new Info().title("SprincDoc-FoyerProject").description("Tp Gestion Foyer").contact(contactAPI());
    }
    public Contact contactAPI(){
        return new Contact().name("Hanin Ben Jemaa").email("hanin.benjemaa@esprit.tn").url("");
    }
    @Bean
    public GroupedOpenApi allPublicApi() {
        return GroupedOpenApi.builder()
                .group("All Management API")
                .pathsToMatch("/**")
                .build();
    }
    @Bean
    public GroupedOpenApi foyerPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Foyer Management API")
                .pathsToMatch("/Foyer/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi blocPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Bloc Management API")
                .pathsToMatch("/bloc/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi etudiantPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only etudiant Management API")
                .pathsToMatch("/Etudiant/**")
                .pathsToExclude("**")
                .build();
    }

    @Bean
    public GroupedOpenApi chambrePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only chambre Management API")
                .pathsToMatch("/Chambre/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi reservationPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only reservation Management API")
                .pathsToMatch("/Reservation/**")
                .pathsToExclude("**")
                .build();
    }

    @Bean
    public GroupedOpenApi universityPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only university Management API")
                .pathsToMatch("/University/**")
                .pathsToExclude("**")
                .build();
    }
}
