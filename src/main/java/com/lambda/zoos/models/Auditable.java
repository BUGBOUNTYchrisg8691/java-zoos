package com.lambda.zoos.models;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.TIMESTAMP;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
abstract class Auditable
{
	@CreatedBy
	protected String created_by;
	
	@CreatedDate
	@Temporal(TIMESTAMP)
	protected Date created_date;
	
	@CreatedBy
	protected String last_modified_by;
	
	@CreatedDate
	@Temporal(TIMESTAMP)
	protected Date last_modified_date;
}
