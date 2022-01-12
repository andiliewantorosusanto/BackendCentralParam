CREATE TABLE SP_KodePromo
(
    id INT IDENTITY(1,1),
    kodePromo VARCHAR(255) NULL,
    idProgram INT NULL,
    notifikasi VARCHAR(1000) NULL,
    startBerlaku DATE NULL,
    endBerlaku DATE NULL,
    stsData INT NULL,
    remarks VARCHAR(1000) NULL,
    createdBy INT NULL,
    createdDate DATETIME NULL,
    updatedBy INT NULL,
    updatedDate DATETIME NULL,
    deletedBy INT NULL,
    deletedDate DATETIME NULL
)

CREATE TABLE SP_KodeReferral
(
    id INT IDENTITY(1,1),
    idMaster INT NULL,
    kodeReferral VARCHAR(4) NULL,
    stsData INT NULL,
    createdBy INT NULL,
    createdDate DATETIME NULL
)

CREATE TABLE temp_KodePromo
(
    id INT IDENTITY(1,1),
    kodePromo VARCHAR(255) NULL,
    idProgram INT NULL,
    notifikasi VARCHAR(1000) NULL,
    startBerlaku DATE NULL,
    endBerlaku DATE NULL,
    tipeData INT NULL,
    stsData INT NULL,
    createdBy INT NULL,
    createdDate DATETIME NULL,
    updatedBy INT NULL,
    updatedDate DATETIME NULL
)

CREATE TABLE temp_KodeReferral
(
    id INT IDENTITY(1,1),
    idMaster INT NULL,
    kodeReferral VARCHAR(4) NULL
)

CREATE TABLE tempUpload_KodePromo
(
    id INT IDENTITY(1,1),
    kodePromo VARCHAR(255) NULL,
    namaProgram VARCHAR(255) NULL,
    notifikasi VARCHAR(1000) NULL,
    startBerlaku DATE NULL,
    endBerlaku DATE NULL,
    createdBy INT NULL,
    createdDate DATETIME NULL,
    tokenUpload VARCHAR(1000) NULL,
    [filename] VARCHAR(1000) NULL
)

CREATE TABLE tempUpload_KodeReferral
(
    id INT IDENTITY(1,1),
    idMaster INT NULL,
    kodeReferral VARCHAR(4) NULL
)