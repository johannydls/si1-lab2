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
  estilos_pretendidos       varchar(255),
  estilos_nao_pretendidos   varchar(255),
  opcao_que_busca           varchar(255),
  formas_de_contato         varchar(255),
  finalizado                boolean,
  data_de_postagem          varchar(255),
  constraint pk_anuncio primary key (id))
;

create sequence anuncio_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists anuncio;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists anuncio_seq;

