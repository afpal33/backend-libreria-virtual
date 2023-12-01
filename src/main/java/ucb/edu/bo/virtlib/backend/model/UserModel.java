package ucb.edu.bo.virtlib.backend.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String given_name;
    private String family_name;
    private String picture;
    private String locale;
    private LocalDateTime updated_at;
    private String email;
    private Integer email_verified;
    private String sub;

    public UserModel(Long id, String given_name, String family_name, String picture, String locale, LocalDateTime updated_at, String email, Integer email_verified, String sub) {
        this.user_id = user_id;
        this.given_name = given_name;
        this.family_name = family_name;
        this.picture = picture;
        this.locale = locale;
        this.updated_at = updated_at;
        this.email = email;
        this.email_verified = email_verified;
        this.sub = sub;
    }

    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = user_id;
    }

    public String getGiven_name() {
        return given_name;
    }

    public void setGiven_name(String given_name) {
        this.given_name = given_name;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmail_verified() {
        return email_verified;
    }

    public void setEmail_verified(Integer email_verified) {
        this.email_verified = email_verified;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
}
