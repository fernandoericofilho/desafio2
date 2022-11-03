CREATE DATABASE desafio_tecnico;

create table pessoa (
	id_pessoa serial,
	nome varchar(100) not null,
	cpf varchar(11) not null,
	data_nascimento date not null
);

alter table pessoa add constraint pessoa_pk primary key (id_pessoa);

create table conta (
	id_conta serial,
	id_pessoa bigserial not null,
	saldo numeric default 0,
	limite_saque_diario numeric default 0,
	flag_ativo boolean default false,
	tipo_conta numeric not null,
	data_criacao date default current_date
);

alter table conta add constraint conta_pk primary key (id_conta);
alter table conta add constraint pessoa_fk foreign key (id_pessoa) REFERENCES pessoa(id_pessoa);

create table transacao (
	id_transacao serial,
	id_conta bigserial not null,
	valor numeric default 0,
	data_transacao date default current_date
);

alter table transacao add constraint transacao_pk primary key (id_transacao);
alter table transacao add constraint conta_fk foreign key (id_conta) REFERENCES conta(id_conta);