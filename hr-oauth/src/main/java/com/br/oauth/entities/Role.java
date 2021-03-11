package com.br.oauth.entities;

public class Role {

    private Long id;
    private String roleName;

    public Role() {
    }

    public Role(final Long id, final String roleName, final String email, final String password) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }
}
