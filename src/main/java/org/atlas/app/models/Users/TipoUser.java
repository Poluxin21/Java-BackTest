package org.atlas.app.models.Users;

public enum TipoUser {
    COMUM(0),
    PRO(1),
    PROPLS(2);

    private final int tipo;

    TipoUser(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
