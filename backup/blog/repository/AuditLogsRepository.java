package com.tcs.blog.repository;


import com.tcs.blog.model.AuditLogs;
import com.tcs.blog.model.enumaration.AuditType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data  repository for the AuditLogs entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AuditLogsRepository extends JpaRepository<AuditLogs, Long> {

}
