package com.tcs.blog.service;


import com.tcs.blog.model.AuditLogs;

/**
 * Service Interface for managing {@link com.tcs.blog.model.AuditLogs}.
 */
public interface AuditLogsService {

    /**
     * Save a auditLogs.
     *
     * @param auditLogsDTO the entity to save.
     * @return the persisted entity.
     */
    void save(AuditLogs auditLogsDTO);


}
