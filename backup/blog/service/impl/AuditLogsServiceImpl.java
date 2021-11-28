package com.tcs.blog.service.impl;


import com.tcs.blog.model.AuditLogs;
import com.tcs.blog.repository.AuditLogsRepository;
import com.tcs.blog.service.AuditLogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link AuditLogs}.
 */
@Service
@Transactional
public class AuditLogsServiceImpl implements AuditLogsService {

	private final Logger log = LoggerFactory.getLogger(AuditLogsServiceImpl.class);

	@Autowired
	private AuditLogsRepository auditLogsRepository;


	/**
	 * Save a auditLogs.
	 *
	 * @param auditLogs the entity to save.
	 * @return the persisted entity.
	 */
	@Override
	public void save(AuditLogs auditLogs) {
		log.debug("Request to save AuditLogs : {}", auditLogs);
		auditLogsRepository.save(auditLogs);

	}


}
