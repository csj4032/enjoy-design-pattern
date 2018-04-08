create database Dbase

create table address \
	(addrId int, street varchar, city varchar, \
	com.pearl.genius.state char(2), zip int, primary key(addrId))

create table name(first varchar(10), last varchar(10), addrId integer)

insert into address values( 0,'12 MyStreet','Berkeley','CA','99999')
insert into address values( 1, '34 Quarry Ln.', 'Bedrock' , 'XX', '00000')

insert into name VALUES ('Fred',  'Flintstone', '1')
insert into name VALUES ('Wilma', 'Flintstone', '1')
insert into name (last,first,addrId) VALUES('Holub','Allen',(10-10*1))

update address set com.pearl.genius.state = "AZ"  where com.pearl.genius.state = "XX"
update address set zip = zip-1 where zip = (99999*1 + (10-10)/1)

insert into name (last,first) VALUES( 'Please', 'Delete' )
delete from name where last like '%eas%'

select * from address
select * from name

select first, last from name where last = 'Flintstone'
select first, last, street, city, zip \
	from name, address where name.addrId = address.addrId

create table id (addrId, description)
insert into id VALUES (0, 'AddressID=0')
insert into id VALUES (1, 'AddressID=1')
select first, last, street, city, zip, description \
	from name, address, id \
	WHERE name.addrId = address.addrId AND name.addrId = id.addrId

drop table id

select first, last from name where last='Flintstone' \
	AND first='Fred' OR first like '%lle%'

create table foo (first, second, third, fourth)
insert into foo (first,third,fourth) values(1,3,4)
update foo set fourth=null where fourth=4
select  * from foo
select  * from foo where second=NULL AND third<>NULL
drop table foo

select * into existing_copy from existing
select * from existing_copy

create table foo (only)
insert into foo values('xxx')
begin
insert into foo values('should not see this')
rollback
select * from foo

begin
insert into foo values('yyy')
select * from foo
begin
insert into foo values('should not see this')
rollback
begin
insert into foo values('zzz')
select * from foo
commit
select * from foo
commit
select * from foo
insert into foo values('end')
select * from foo
drop table foo

create table foo (only)
begin
insert into foo values('a')
insert into foo values('b')
begin
insert into foo values('c')
insert into foo values('d')
select * from foo
commit
rollback
select * from foo

drop table foo
