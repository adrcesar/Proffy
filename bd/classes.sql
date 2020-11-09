-- Table: public.classes

-- DROP TABLE public.classes;

CREATE TABLE public.classes
(
    id integer NOT NULL DEFAULT nextval('classes_id_seq'::regclass),
    subject character varying(255) COLLATE pg_catalog."default",
    cost real,
    user_id integer,
    CONSTRAINT classes_pkey PRIMARY KEY (id),
    CONSTRAINT classes_users_fk FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.classes
    OWNER to postgres;