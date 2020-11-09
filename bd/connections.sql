-- Table: public.connections

-- DROP TABLE public.connections;

CREATE TABLE public.connections
(
    id integer NOT NULL DEFAULT nextval('connections_id_seq'::regclass),
    created_at time without time zone,
    user_id integer,
    CONSTRAINT connections_pkey PRIMARY KEY (id),
    CONSTRAINT connections_users_fk FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.connections
    OWNER to postgres;