package com.postgres.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MDO_WORKBOOK")
public class WorkBook {
	@Id
	private String workbookid;
	private Timestamp created;
	private String createdby;
	private Integer deptnbr;
	private String displayweekdt;
	private Integer divnnbr;
	private Timestamp lastupdated;
	private String lastupdatedby;
	private String lockedby;
	private Boolean lockstatus;
	private String mdeffectiveweekdt;
	private Double permactrecamt;
	private Double permactwkbkamt;
	private Double permbudgetamt;
	private Double permbudgetleftamt;
	private Double permoverrideamt;
	private String status;
	private Double totpermrcmndamt;
	private Boolean isdatarefreshed;
	private Boolean isnew;
	private String datadate;
	private String createdbyname;
	private String lastupdatedbyname;
	private String lockedbyname;
}
