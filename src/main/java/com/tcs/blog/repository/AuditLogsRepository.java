package com.tcs.blog.repository;


import com.tcs.blog.model.AuditLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AuditLogs entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AuditLogsRepository extends JpaRepository<AuditLogs, Long> {

}
