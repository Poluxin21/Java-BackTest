    package org.atlas.app.models.Users;

    import javax.persistence.Entity;
    import javax.persistence.Id;

    @Entity
    public class User {
        @Id
        private String Username;
        private String Password;

        public User(
                String username,
                String password)
        {
            this.Username = username;
            this.Password = password;
        }

        public String getUsername() {
            return Username;
        }
        public void setUsername(String username)
        {
            this.Username = Username;
        }

        public String getPassword()
        {
            return Password;
        }

        public void setPassword(String password) {
            this.Password = Password;
        }

    }
