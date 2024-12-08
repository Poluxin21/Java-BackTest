    package org.atlas.app.models.Users;

    import javax.persistence.Entity;
    import javax.persistence.Id;

    @Entity
    public class User {
        @Id
        private String Username;
        private String Password;
        private TipoUser TipoUser;

        public User(
                String username,
                String password,
                TipoUser tipoUser)
        {
            this.Username = username;
            this.Password = password;
            this.TipoUser = tipoUser;
        }

        public String getUsername() {
            return Username;
        }

        public String getPassword()
        {
            return Password;
        }

        public TipoUser getTipoUser() {
            return TipoUser;
        }
    }
