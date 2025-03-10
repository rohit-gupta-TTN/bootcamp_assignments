package models;

import com.fasterxml.jackson.annotation.JsonFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.hateoas.RepresentationModel;

@JsonFilter("UserEnhancedFilter")
public class DynamicFilterUser {
    @Schema(description = "Unique ID for the user of type Integer")
    private int id;
    @Schema(description = "Name of the user of type String")
    private String name;
    private String password;

    public DynamicFilterUser(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public DynamicFilterUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
}