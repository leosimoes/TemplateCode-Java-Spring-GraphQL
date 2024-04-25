CREATE USER IF NOT EXISTS "LEO" SALT '1f3b6876755c003e' HASH '29727052add9bf280eee87c3c98b94f9ef1407347370ee284ed22b4469da01cf' ADMIN;
CREATE MEMORY TABLE "PUBLIC"."ASSOCIATEDS"(
    "ID" UUID NOT NULL,
    "NAME" CHARACTER VARYING(255)
);

CREATE MEMORY TABLE "PUBLIC"."MAINS"(
    "ASSOCIATED_ID" UUID,
    "ID" UUID NOT NULL,
    "DESCRIPTION" CHARACTER VARYING(255),
    "NAME" CHARACTER VARYING(255)
);

ALTER TABLE "PUBLIC"."ASSOCIATEDS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_7B" PRIMARY KEY("ID");
ALTER TABLE "PUBLIC"."MAINS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_45" PRIMARY KEY("ID");
ALTER TABLE "PUBLIC"."MAINS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_4" UNIQUE("NAME");
ALTER TABLE "PUBLIC"."ASSOCIATEDS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_7" UNIQUE("NAME");
ALTER TABLE "PUBLIC"."MAINS" ADD CONSTRAINT "PUBLIC"."FKSL1SUEX5OUOU1QC0SMDY9HLPN" FOREIGN KEY("ASSOCIATED_ID") REFERENCES "PUBLIC"."ASSOCIATEDS"("ID") NOCHECK;