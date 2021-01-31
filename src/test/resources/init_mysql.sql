create table tasks (
    id bigint not null,
    name varchar(255),
    description varchar(255),
    assignee varchar(255),
    primary key (id)
) engine=InnoDB;

insert into tasks (id, name, description, assignee) value (1, 'Task 1', 'I have something TODO', 'Crocker');
insert into tasks (id, name, description, assignee) value (2, 'Task 2', 'Oh great, something else', 'Crocker');
insert into tasks (id, name, description, assignee) value (3, 'Task 3', 'At least this is not for me', 'Not Crocker');