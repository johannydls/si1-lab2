# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table anuncio (
  id                        varchar(255) not null,
  titulo                    varchar(255),
  cidade                    varchar(255),
  bairro                    varchar(255),
  descricao                 varchar(255),
  instrumentos              varchar(255),
  estilosPretendidos        varchar(255),
  estilosNaoPretendidos     varchar(255),
  opcaoQueBusca             varchar(255),
  formasDeContato           varchar(255),
  finalizado                boolean,
  dataDePostagem            varchar(255),
  codigo_de_acesso          varchar(255),
  constraint pk_anuncio primary key (id))
;

create sequence anuncio_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists anuncio;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists anuncio_seq;

