insert into employee (idemployee,first_name,start_Date,salary) VALUES (1,'Darshana',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (2,'Sampath',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (3,'Welikala',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (4,'Hasaru',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (5,'Piumine',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (6,'Wijegunarathna',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (7,'Bandara',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (8,'Gajanayaka',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (9,'Nimal',CURRENT_DATE,72000);
insert into employee (idemployee,first_name,start_Date,salary) VALUES (10,'Kamla',CURRENT_DATE,72000);

insert into dat_Case (id,status) values (1,'ACTIVE');
insert into dat_Case (id,status) values (2,'ACTIVE');
insert into dat_Case (id,status) values (3,'ACTIVE');
insert into dat_Case (id,status) values (4,'ACTIVE');
insert into dat_Case (id,status) values (5,'ACTIVE');
insert into dat_Case (id,status) values (6,'ACTIVE');
insert into dat_Case (id,status) values (7,'ACTIVE');

insert into dat_Field(id,field_name,field_value,dat_case_id) values (1,'1 field 1', '1 value 1',1);
insert into dat_Field(id,field_name,field_value,dat_case_id) values (2,'1 field 2', '1 value 2',1);
insert into dat_Field(id,field_name,field_value,dat_case_id) values (3,'1 field 3', '1 value 3',1);


insert into dat_Field(id,field_name,field_value,dat_case_id) values (4,'6 field 1', '6 value 1',6);
insert into dat_Field(id,field_name,field_value,dat_case_id) values (5,'6 field 2', '6 value 2',6);
insert into dat_Field(id,field_name,field_value,dat_case_id) values (6,'6 field 3', '6 value 3',6);

insert into dat_Field(id,field_name,field_value,dat_case_id) values (7,'7 field 1', '6 value 1',7);
insert into dat_Field(id,field_name,field_value,dat_case_id) values (8,'7 field 2', '6 value 2',7);
insert into dat_Field(id,field_name,field_value,dat_case_id) values (9,'EHR', 'YES',7);