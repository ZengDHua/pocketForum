create table notification
(
	id bigint auto_increment,
	notifier bigint not null,
	notifier_name varchar(100),
	receiver bigint not null,
	outer_id bigint not null,
	outer_title varchar(256),
	type int not null,
	status int default 0 not null,
	gmt_create bigint not null,
	constraint notification_pk
		primary key (id)
);