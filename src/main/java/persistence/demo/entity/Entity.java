package persistence.demo.entity;

import java.io.Serializable;

/**
 * Represents an entity in the system.
 */
public abstract class Entity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}