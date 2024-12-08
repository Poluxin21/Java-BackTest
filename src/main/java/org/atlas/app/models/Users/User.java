package org.atlas.app.models.Users;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_user")
    private TipoUser tipoUser;

    public User() {}

    public User(String username, String password, String email, TipoUser tipoUser) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.tipoUser = tipoUser;
    }

    public long getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoUser getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(TipoUser tipoUser) {
        this.tipoUser = tipoUser;
    }

    @Override
    public String toString() {
        return "User{id=" + Id + ", username='" + username + "', email='" + email + "', tipoUser=" + tipoUser + "}";
    }
}
