package com.tcs.blog.model;

import com.tcs.blog.model.enumaration.AuditType;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A AuditLogs.
 */
@Entity
@Table(name = "audit_logs")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class AuditLogs extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "field_name")
    private String fieldName;

    @Column(name = "old_activity")
    private String oldActivity;

    @Column(name = "new_activity")
    private String newActivity;

    @Enumerated(EnumType.STRING)
    @Column(name = "audit_type")
    private AuditType auditType;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public AuditLogs userId(Long userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public AuditLogs fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getOldActivity() {
        return oldActivity;
    }

    public AuditLogs oldActivity(String oldActivity) {
        this.oldActivity = oldActivity;
        return this;
    }

    public void setOldActivity(String oldActivity) {
        this.oldActivity = oldActivity;
    }

    public String getNewActivity() {
        return newActivity;
    }

    public AuditLogs newActivity(String newActivity) {
        this.newActivity = newActivity;
        return this;
    }

    public void setNewActivity(String newActivity) {
        this.newActivity = newActivity;
    }


    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    public AuditType getAuditType() {
        return auditType;
    }

    public void setAuditType(AuditType auditType) {
        this.auditType = auditType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditLogs)) {
            return false;
        }
        return id != null && id.equals(((AuditLogs) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "AuditLogs{" +
                "id=" + getId() +
                ", userId=" + getUserId() +
                ", fieldName='" + getFieldName() + "'" +
                ", oldActivity='" + getOldActivity() + "'" +
                ", newActivity='" + getNewActivity() + "'" +
                "}";
    }
}
