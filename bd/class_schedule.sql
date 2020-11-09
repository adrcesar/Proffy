-- Table: public.class_schedule

-- DROP TABLE public.class_schedule;

CREATE TABLE public.class_schedule
(
    id integer NOT NULL DEFAULT nextval('class_schedule_id_seq'::regclass),
    week_day integer,
    from_ integer,
    to_ integer,
    class_id integer,
    CONSTRAINT class_schedule_pkey PRIMARY KEY (id),
    CONSTRAINT class_schedule_classes_fk FOREIGN KEY (class_id)
        REFERENCES public.classes (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.class_schedule
    OWNER to postgres;