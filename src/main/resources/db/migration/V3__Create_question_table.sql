create table question
(
	id bigint auto_increment,
	title varchar(50),
	description text,
	creator bigint,
	comment_count int default 0,
	view_count int default 0,
	like_count int default 0,
	tag varchar(256),
	gmt_create bigint,
	gmt_modified bigint,
	constraint question_pk
		primary key (id)
);