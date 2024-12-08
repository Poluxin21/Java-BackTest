package org.atlas.app.models.Users;

public enum TipoUser {
    COMUM(0),
    PRO(1),
    PROPLS(2);

    private final int TipoUser;

    TipoUser(int i) {
        this.TipoUser = i;
    }

    public int getTipoUser()
    {
        return TipoUser;
    }

}