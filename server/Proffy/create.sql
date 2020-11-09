
    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users

    create table classes (
       id  bigserial not null,
        cost float4 not null,
        subject varchar(255),
        user_id int8 not null,
        primary key (id)
    )

    create table class_schedule (
       id  bigserial not null,
        from_ int4,
        to_ int4,
        week_day int4 not null,
        class_id int8 not null,
        primary key (id)
    )

    create table connections (
       id  bigserial not null,
        created_at timestamp,
        user_id int8 not null,
        primary key (id)
    )

    create table users (
       id  bigserial not null,
        avatar varchar(255),
        bio varchar(255),
        name varchar(255),
        whatsapp varchar(255),
        primary key (id)
    )

    alter table if exists classes 
       add constraint FKr4g4x4emo8ermns7r9x4gkijh 
       foreign key (user_id) 
       references users

    alter table if exists class_schedule 
       add constraint FK9fplehvxxgfj35vacj8b0qabh 
       foreign key (class_id) 
       references classes

    alter table if exists connections 
       add constraint FKltpo1ymtaafd67hx5tls1db6u 
       foreign key (user_id) 
       references users
