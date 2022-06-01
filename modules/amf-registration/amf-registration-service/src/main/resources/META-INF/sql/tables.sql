create table AMF_Account (
	uuid_ VARCHAR(75) null,
	accountId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	userName_ VARCHAR(75) null,
	gender VARCHAR(75) null,
	birthday DATE null,
	password1 VARCHAR(75) null,
	password2 VARCHAR(75) null,
	homePhone INTEGER,
	mobilePhone INTEGER,
	address VARCHAR(75) null,
	address2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	zip VARCHAR(75) null,
	securityQuestion VARCHAR(75) null,
	securityAnswer VARCHAR(75) null,
	acceptedTou VARCHAR(75) null
);