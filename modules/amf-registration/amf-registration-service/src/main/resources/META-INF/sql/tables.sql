create table AMF_REGISTRATION_LOG (
	logId LONG not null primary key,
	dateTime DATE null,
	screenName VARCHAR(75) null,
	userId LONG,
	ipAddress VARCHAR(75) null,
	eventType VARCHAR(75) null,
	additionalInfo VARCHAR(75) null
);

create table AR_AmfRegistration (
	fakeAttribute VARCHAR(75) not null primary key
);