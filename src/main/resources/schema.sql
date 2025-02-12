DROP TABLE IF EXISTS POLICY;
DROP TABLE IF EXISTS TRANS;
DROP TABLE IF EXISTS PAYMENT_INSTRUCTION;


CREATE TABLE POLICY
(
    ID                    IDENTITY NOT NULL PRIMARY KEY,
    NUMBER                  VARCHAR(255),
    RISK                  VARCHAR(50),
    RISK_DESCRIPTION      VARCHAR(255)
);

CREATE TABLE TRANS
(
    ID                    IDENTITY NOT NULL PRIMARY KEY,
    EXTERNAL_ID           VARCHAR(50),
    RISK                  VARCHAR(50),
    RISK_DESCRIPTION      VARCHAR(255),
    POLICY_ID               INT
);


CREATE TABLE PAYMENT_INSTRUCTION
(
    ID              IDENTITY NOT NULL PRIMARY KEY,
    EXTERNAL_ID     VARCHAR(50),
    PAYMENT_MODE    VARCHAR(50),
    TRANSACTION_ID  INT
);

ALTER TABLE PAYMENT_INSTRUCTION
    ADD FOREIGN KEY (TRANSACTION_ID)
        REFERENCES TRANS (ID);


ALTER TABLE TRANS
    ADD FOREIGN KEY (POLICY_ID)
        REFERENCES POLICY (ID);
