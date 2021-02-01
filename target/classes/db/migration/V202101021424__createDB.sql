CREATE TABLE IF NOT EXISTS consent (
    record_id varchar(255) NOT NULL,
    creation_date varchar(255) NOT NULL,
    status varchar(255) NOT NULL,
    status_update_date varchar(255) NOT NULL,
    PRIMARY KEY (record_id)
);

CREATE TABLE IF NOT EXISTS consent_session (
    record_id varchar(255) NOT NULL,
    consent_id varchar(255) NOT NULL,
    refresh_token varchar(255) NOT NULL,
);