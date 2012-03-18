# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comment (
  id                        bigint not null,
  name                      varchar(255),
  text                      varchar(255),
  constraint pk_comment primary key (id))
;

create sequence comment_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists comment;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists comment_seq;

