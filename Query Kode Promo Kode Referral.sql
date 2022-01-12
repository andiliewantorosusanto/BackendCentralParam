
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
GO
ALTER TABLE SP_KKBSK_RuleEngine_LogSP
ADD kodePromo VARCHAR(255) NULL,
    kodeReferral VARCHAR(4) NULL,
    Result_notifikasi VARCHAR(1000) NULL
GO
ALTER TABLE SP_KKBSK_RuleEngine_LogSP_Budget 
ADD kodePromo varchar(255) null, 
    kodeReferral varchar(4) null, 
    Result_notifikasi varchar(1000) null
GO
ALTER PROC [dbo].[spHTA_RuleEngine_SimulasiKKBSK]( 
	@cluster int=null, 
	@currYear varchar(4)=null, 
	@dateParam datetime=null, 
	@hargaKendaraan money=null, 
	@jenisKendaraan int=null, 
	@jenisPembiayaan int=null, 
	@lengthRound int=null, 
	@melampirkanNPWP int=null, 
	@perluasan varchar(100)=null, 
	@produk int=null, 
	@program int=null, 
	@thnKendaraan varchar(4)=null, 
	@tipeAsuransi int=null, 
	@tipeKonsumen int=null, 
	@tipeUangMuka int=null, 
	@tujuanPenggunaan int=null, 
	@uangMuka float=null, 
	@wilayah int=null, 
	@prioritas int=0, 
	@Source varchar(100),
    @kodePromo VARCHAR(255)=null, --added als, kode promo
    @kodeReferral VARCHAR(4)=null --added als, kode promo
) AS 
BEGIN 
	BEGIN TRY 
	--Set Param to DB 
	DECLARE @token varchar(1000)=NEWID() 
	 
	DECLARE @txtValidRule varchar(100)='' 
	DECLARE @txtInvalidRule varchar(100)='' 
	DECLARE @tblValidRule TABLE( 
		idRule int null 
	) 
	DECLARE @tblInvalidRule TABLE( 
		idRule int null 
	) 
	INSERT INTO SP_KKBSK_RuleEngine_LogSP( 
		token 
		,createddate 
		,cluster 
		,currYear 
		,dateParam 
		,hargaKendaraan 
		,jenisKendaraan 
		,jenisPembiayaan 
		,lengthRound 
		,melampirkanNPWP 
		,perluasan 
		,produk 
		,program 
		,thnKendaraan 
		,tipeAsuransi 
		,tipeKonsumen 
		,tipeUangMuka 
		,tujuanPenggunaan 
		,uangMuka 
		,wilayah 
		,Result_cluster 
		,Result_currYear 
		,Result_dateParam 
		,Result_hargaKendaraan 
		,Result_jenisKendaraan 
		,Result_jenisPembiayaan 
		,Result_lengthRound 
		,Result_melampirkanNPWP 
		,Result_perluasan 
		,Result_produk 
		,Result_program 
		,Result_thnKendaraan 
		,Result_tipeAsuransi 
		,Result_tipeKonsumen 
		,Result_tipeUangMuka 
		,Result_tujuanPenggunaan 
		,Result_uangMuka 
		,Result_wilayah 
		,prioritas 
		,[Source] 
        ,kodePromo
        ,kodeReferral
	) VALUES( 
		@token 
		,GETDATE()	 
		,@cluster 
		,@currYear 
		,@dateParam 
		,@hargaKendaraan 
		,@jenisKendaraan 
		,@jenisPembiayaan 
		,@lengthRound 
		,@melampirkanNPWP 
		,@perluasan 
		,@produk 
		,@program 
		,@thnKendaraan 
		,@tipeAsuransi 
		,@tipeKonsumen 
		,@tipeUangMuka 
		,@tujuanPenggunaan 
		,@uangMuka 
		,@wilayah 
		,@cluster 
		,@currYear 
		,@dateParam 
		,@hargaKendaraan 
		,@jenisKendaraan 
		,@jenisPembiayaan 
		,@lengthRound 
		,@melampirkanNPWP 
		,@perluasan 
		,@produk 
		,@program 
		,@thnKendaraan 
		,@tipeAsuransi 
		,@tipeKonsumen 
		,@tipeUangMuka 
		,@tujuanPenggunaan 
		,@uangMuka 
		,@wilayah 
		,@prioritas 
		,@Source
        ,@kodePromo
        ,@kodeReferral
	) 
 
	--Get Matching Rule 
	DECLARE @idMaster int=null 
	DECLARE @Rule_idx varchar(255)=null 
	DECLARE @Rule_operator varchar(255)=null 
	DECLARE @Rule_val varchar(255)=null 
	DECLARE @Rule_valType varchar(100)=null 
	DECLARE @Rule_whereSQL nvarchar(max)=null 
	 
	DECLARE @retval int   =null 
	DECLARE @Rule_SQL nvarchar(max)=null; 
	DECLARE @ParmDefinition nvarchar(500); 
	SET @ParmDefinition = N'@retvalOUT int OUTPUT'; 
			 
	DECLARE dbCursor CURSOR FOR  
	SELECT id FROM SP_KKBSK_RuleEngine_Master WITH(NOLOCK) where simulationType=1 
 
	OPEN dbCursor 
	FETCH NEXT FROM dbCursor into @idMaster 
	WHILE @@FETCH_STATUS=0 
		BEGIN 
		IF EXISTS( 
			SELECT 1  
			FROM SP_KKBSK_RuleEngine_DetailRule WITH(NOLOCK) 
			WHERE idMaster=@idMaster 
		) 
			BEGIN 
			DECLARE dbCursorDetail CURSOR FOR 
			SELECT idx,operator,val,valType 
			FROM SP_KKBSK_RuleEngine_DetailRule WITH(NOLOCK) 
			WHERE idMaster=@idMaster 
 
			OPEN dbCursorDetail 
			FETCH NEXT FROM dbCursorDetail INTO @Rule_idx,@Rule_operator,@Rule_val,@Rule_valType 
			WHILE @@FETCH_STATUS=0 
				BEGIN 
				SET @Rule_whereSQL=isnull(@Rule_whereSQL,'') 
				 
				SET @Rule_whereSQL=@Rule_whereSQL+' AND '+@Rule_idx+' '+@Rule_operator+' '+'cast('''+@Rule_val+''' as '+@Rule_valType+')' 
					 
				FETCH NEXT FROM dbCursorDetail INTO @Rule_idx,@Rule_operator,@Rule_val,@Rule_valType 
				END 
			CLOSE dbCursorDetail 
			DEALLOCATE dbCursorDetail  
			 
			IF(isnull(@Rule_whereSQL,'')<>'') 
				BEGIN 
				SET @Rule_whereSQL=REPLACE(@Rule_whereSQL,'_perluasan',isnull(@perluasan,'')) 
                SET @Rule_whereSQL=REPLACE(@Rule_whereSQL,'_kodeReferral',isnull(@kodeReferral,''))
				SELECT @Rule_SQL = N'SELECT @retvalOUT = '+cast(@idMaster as nvarchar(10))+' FROM SP_KKBSK_RuleEngine_LogSP WITH(NOLOCK) WHERE token='''+@token+''' ' + @Rule_whereSQL;   
				print @Rule_SQL 
				EXEC sp_executesql @Rule_SQL, @ParmDefinition, @retvalOUT=@retval OUTPUT; 
				 
				IF(@retval IS NOT NULL) 
					BEGIN 
					INSERT INTO @tblValidRule VALUES(@idMaster) 
					SET @txtValidRule = @txtValidRule+cast(@idMaster as varchar(10))+',' 
					END 
				ELSE 
					BEGIN 
					INSERT INTO @tblInvalidRule VALUES(@idMaster) 
					SET @txtInvalidRule = @txtInvalidRule+cast(@idMaster as varchar(10))+',' 
					END			 
				END 
			else 
				BEGIN 
				INSERT INTO @tblInvalidRule VALUES(@idMaster) 
				SET @txtInvalidRule = @txtInvalidRule+cast(@idMaster as varchar(10))+',' 
				END 
			 
			SET @Rule_idx=null 
			SET @Rule_operator=null 
			SET @Rule_val=null 
			SET @Rule_valType=null 
			SET @retval=null 
			SET @Rule_SQL=null 
			SET @Rule_whereSQL=null 
			 
			END 
 
		FETCH NEXT FROM dbCursor into @idMaster 
		END 
 
	CLOSE dbCursor 
	DEALLOCATE dbCursor 
	 
	--Get Things To Do 
	IF (@txtValidRule IS NOT NULL AND LEN(@txtValidRule)>0) 
		BEGIN 
		SET @txtValidRule=LEFT(@txtValidRule,LEN(@txtValidRule)-1) 
		DECLARE @idRule int=null 
		DECLARE @Result_SQL nvarchar(max)='' 
		DECLARE @Result_updateSQL nvarchar(max)='' 
		DECLARE @Result_concatResult nvarchar(max)='' 
		DECLARE dbCursor CURSOR FOR 
		SELECT idRule FROM @tblValidRule 
		 
		OPEN dbCursor 
		FETCH NEXT FROM dbCursor INTO @idRule 
		WHILE @@FETCH_STATUS=0 
			BEGIN 
			print @idRule 
			SET @Result_concatResult='' 
			IF EXISTS( 
				SELECT 1 FROM SP_KKBSK_RuleEngine_DetailResult WITH(NOLOCK) where idMaster=@idRule 
			) 
				BEGIN 
				DECLARE dbCursorDetail CURSOR FOR 
				SELECT 'Result_'+idx+'=cast('''+val+''' as '+valType+'),' FROM SP_KKBSK_RuleEngine_DetailResult WITH(NOLOCK) WHERE idMaster=@idRule 
				 
				OPEN dbCursorDetail 
				FETCH NEXT FROM dbCursorDetail INTO @Result_concatResult 
				WHILE @@FETCH_STATUS=0 
					BEGIN 
					SET @Result_updateSQL=@Result_updateSQL+@Result_concatResult 
					FETCH NEXT FROM dbCursorDetail INTO @Result_concatResult 
					END 
				CLOSE dbCursorDetail 
				DEALLOCATE dbCursorDetail 
				 
				SET @Result_SQL=' 
					UPDATE SP_KKBSK_RuleEngine_LogSP 
					SET '+@Result_updateSQL+'validRule='''+@txtValidRule+''' WHERE token='''+@token+'''' 
				print @Result_SQL 
				exec sp_executesql @Result_SQL  
				END 
			 
			FETCH NEXT FROM dbCursor INTO @idRule 
			END 
		CLOSE dbCursor 
		DEALLOCATE dbCursor 
		END 
	--ELSE 
	--	BEGIN 
	--	UPDATE SP_KKBSK_RuleEngine_LogSP SET errorCode='01',errorMessage='No Rule Matched',invalidRule=@txtInvalidRule WHERE token=@token 
	--	END 
	IF EXISTS( 
		SELECT 1  
		FROM SP_KKBSK_RuleEngine_LogSP WITH(NOLOCK)  
		WHERE token=@token  
		AND Result_cluster				 IS NOT NULL 
		AND Result_currYear IS NOT NULL 
		AND Result_dateParam IS NOT NULL 
		AND Result_hargaKendaraan IS NOT NULL 
		AND Result_jenisKendaraan IS NOT NULL 
		AND Result_jenisPembiayaan IS NOT NULL 
		AND Result_lengthRound IS NOT NULL 
		AND Result_melampirkanNPWP IS NOT NULL 
		--AND Result_perluasan IS NOT NULL 
		AND Result_produk IS NOT NULL 
		AND Result_program IS NOT NULL 
		AND Result_thnKendaraan IS NOT NULL 
		AND Result_tipeAsuransi IS NOT NULL 
		AND Result_tipeKonsumen IS NOT NULL 
		AND Result_tipeUangMuka IS NOT NULL 
		AND Result_tujuanPenggunaan IS NOT NULL 
		AND Result_uangMuka IS NOT NULL 
		AND Result_wilayah IS NOT NULL	 
	) 
		BEGIN 
		UPDATE SP_KKBSK_RuleEngine_LogSP SET errorCode='00',errorMessage='Sukses',invalidRule=@txtInvalidRule WHERE token=@token 
		END 
	ELSE 
		BEGIN 
		UPDATE SP_KKBSK_RuleEngine_LogSP SET errorCode='02',errorMessage='Incomplete Result',invalidRule=@txtInvalidRule WHERE token=@token 
		END		 
 
    -- added notif
    DECLARE @notif varchar(1000)=''
    SELECT @notif=a.Notifikasi FROM SP_KodePromo a with(nolock) inner join SP_KodeReferral b with(nolock) on a.id=b.idMaster where GETDATE() BETWEEN a.startBerlaku AND a.endBerlaku and a.kodePromo=@kodePromo and b.kodeReferral=@kodeReferral and a.stsData = 1
    IF(isnull(@notif,'')='')
        BEGIN
        IF(EXISTS(select 1 FROM SP_KodePromo a with(nolock) inner join SP_KodeReferral b with(nolock) on a.id=b.idMaster where GETDATE() BETWEEN a.startBerlaku AND a.endBerlaku and a.kodePromo=@kodePromo and a.stsData = 1))
            BEGIN
            SET @notif='Kode Promo tidak dapat digunakan, Berikut penawaran terbaik untuk anda'
        END
        ELSE
            BEGIN
            SET @notif='Kode Promo tidak ditemukan, Berikut penawaran terbaik untuk anda'
        END
	END
    UPDATE SP_KKBSK_RuleEngine_LogSP set Result_notifikasi=@notif where token=@token

	SELECT * FROM SP_KKBSK_RuleEngine_LogSP WITH(NOLOCK) WHERE token=@token 
	 
	END TRY 
	BEGIN CATCH 
	DECLARE @errMessage varchar(1000)=ERROR_MESSAGE() 
	INSERT INTO SP_KKBSK_RuleEngine_LogSP( 
		createddate 
		,cluster 
		,currYear 
		,dateParam 
		,hargaKendaraan 
		,jenisKendaraan 
		,jenisPembiayaan 
		,lengthRound 
		,melampirkanNPWP 
		,perluasan 
		,produk 
		,program 
		,thnKendaraan 
		,tipeAsuransi 
		,tipeKonsumen 
		,tipeUangMuka 
		,tujuanPenggunaan 
		,uangMuka 
		,wilayah 
		,errorCode 
		,errorMessage 
	)VALUES(GETDATE(),@cluster,@currYear,@dateParam,@hargaKendaraan,@jenisKendaraan,@jenisPembiayaan,@lengthRound,@melampirkanNPWP 
	,@perluasan,@produk,@program,@thnKendaraan,@tipeAsuransi,@tipeKonsumen,@tipeUangMuka,@tujuanPenggunaan,@uangMuka, 
	@wilayah,'99',@errMessage) 
	SELECT '99' as errorCode,@errMessage as errorMessage 
	END CATCH 
	 
	BEGIN TRY  
		CLOSE dbCursor 
		DEALLOCATE dbCursor 
		CLOSE dbCursorDetail 
		DEALLOCATE dbCursorDetail  
	END TRY 
	BEGIN CATCH 
	END CATCH 
END 
GO
CREATE PROC [dbo].[spHTA_RuleEngine_SimulasiKKBSK_Budget]( 
	@program int=null 
	,@jenisPembiayaan int=null 
	,@jenisSimulasi int=null 
	,@nominalBudget money=null 
	,@tipeKonsumen int=null 
	,@melampirkanNPWP int=null 
	,@cluster int=null 
	,@tujuanPenggunaan int=null 
	,@hargaKendaraan money=null 
	,@thnKendaraan varchar(4)=null 
	,@wilayah int=null 
	,@tipeAsuransi int=null 
	,@jenisKendaraan int=null 
	,@produk int=null 
	,@dateParam datetime=null 
	,@currYear varchar(4)=null 
	,@lengthRound int=null 
	,@Perluasan varchar(100)=null 
	,@prioritas int=0 
	,@Source varchar(100)=null
    ,@kodePromo VARCHAR(255) = NULL
    ,@kodeReferral VARCHAR(4) = NULL
) AS 
BEGIN 
	BEGIN TRY 
	--Set Param to DB 
	DECLARE @token varchar(1000)=NEWID() 
	 
	DECLARE @txtValidRule varchar(100)='' 
	DECLARE @txtInvalidRule varchar(100)='' 
	DECLARE @tblValidRule TABLE( 
		idRule int null 
	) 
	DECLARE @tblInvalidRule TABLE( 
		idRule int null 
	) 
	INSERT INTO SP_KKBSK_RuleEngine_LogSP_Budget( 
		token 
		,createddate 
		,program 
		,jenisPembiayaan 
		,jenisSimulasi 
		,nominalBudget 
		,tipeKonsumen 
		,melampirkanNPWP 
		,cluster 
		,tujuanPenggunaan 
		,hargaKendaraan 
		,thnKendaraan 
		,wilayah 
		,tipeAsuransi 
		,jenisKendaraan 
		,produk 
		,dateParam 
		,currYear 
		,lengthRound 
		,Perluasan 
		,Result_program 
		,Result_jenisPembiayaan 
		,Result_jenisSimulasi 
		,Result_nominalBudget 
		,Result_tipeKonsumen 
		,Result_melampirkanNPWP 
		,Result_cluster 
		,Result_tujuanPenggunaan 
		,Result_hargaKendaraan 
		,Result_thnKendaraan 
		,Result_wilayah 
		,Result_tipeAsuransi 
		,Result_jenisKendaraan 
		,Result_produk 
		,Result_dateParam 
		,Result_currYear 
		,Result_lengthRound 
		,Result_Perluasan 
		,prioritas 
		,[Source]
        ,kodePromo
        ,kodeReferral
	) VALUES( 
		@token 
		,GETDATE()	 
		,@program 
		,@jenisPembiayaan 
		,@jenisSimulasi 
		,@nominalBudget 
		,@tipeKonsumen 
		,@melampirkanNPWP 
		,@cluster 
		,@tujuanPenggunaan 
		,@hargaKendaraan 
		,@thnKendaraan 
		,@wilayah 
		,@tipeAsuransi 
		,@jenisKendaraan 
		,@produk 
		,@dateParam 
		,@currYear 
		,@lengthRound 
		,@Perluasan 
		,@program 
		,@jenisPembiayaan 
		,@jenisSimulasi 
		,@nominalBudget 
		,@tipeKonsumen 
		,@melampirkanNPWP 
		,@cluster 
		,@tujuanPenggunaan 
		,@hargaKendaraan 
		,@thnKendaraan 
		,@wilayah 
		,@tipeAsuransi 
		,@jenisKendaraan 
		,@produk 
		,@dateParam 
		,@currYear 
		,@lengthRound 
		,@Perluasan 
		,@prioritas 
		,@Source 
        ,@kodePromo
        ,@kodeReferral
	) 
 
	--Get Matching Rule 
	DECLARE @idMaster int=null 
	DECLARE @Rule_idx varchar(255)=null 
	DECLARE @Rule_operator varchar(255)=null 
	DECLARE @Rule_val varchar(255)=null 
	DECLARE @Rule_valType varchar(100)=null
	DECLARE @Rule_whereSQL nvarchar(max)=null 
	 
	DECLARE @retval int   =null 
	DECLARE @Rule_SQL nvarchar(max)=null; 
	DECLARE @ParmDefinition nvarchar(500); 
	SET @ParmDefinition = N'@retvalOUT int OUTPUT'; 
			 
	DECLARE dbCursor CURSOR FOR  
	SELECT id FROM SP_KKBSK_RuleEngine_Master WITH(NOLOCK) where simulationType=2 
 
	OPEN dbCursor 
	FETCH NEXT FROM dbCursor into @idMaster 
	WHILE @@FETCH_STATUS=0 
		BEGIN 
		IF EXISTS( 
			SELECT 1  
			FROM SP_KKBSK_RuleEngine_DetailRule WITH(NOLOCK) 
			WHERE idMaster=@idMaster 
		) 
			BEGIN 
			DECLARE dbCursorDetail CURSOR FOR 
			SELECT idx,operator,val,valType 
			FROM SP_KKBSK_RuleEngine_DetailRule WITH(NOLOCK) 
			WHERE idMaster=@idMaster 
 
			OPEN dbCursorDetail 
			FETCH NEXT FROM dbCursorDetail INTO @Rule_idx,@Rule_operator,@Rule_val,@Rule_valType 
			WHILE @@FETCH_STATUS=0 
				BEGIN 
				SET @Rule_whereSQL=isnull(@Rule_whereSQL,'') 
				 
				SET @Rule_whereSQL=@Rule_whereSQL+' AND '+@Rule_idx+' '+@Rule_operator+' '+'cast('''+@Rule_val+''' as '+@Rule_valType+')' 
					 
				FETCH NEXT FROM dbCursorDetail INTO @Rule_idx,@Rule_operator,@Rule_val,@Rule_valType 
				END 
			CLOSE dbCursorDetail 
			DEALLOCATE dbCursorDetail  
			 
			IF(isnull(@Rule_whereSQL,'')<>'') 
				BEGIN 
				SET @Rule_whereSQL=REPLACE(@Rule_whereSQL,'_perluasan',isnull(@perluasan,'')) 
				SELECT @Rule_SQL = N'SELECT @retvalOUT = '+cast(@idMaster as nvarchar(10))+' FROM SP_KKBSK_RuleEngine_LogSP_Budget WITH(NOLOCK) WHERE token='''+@token+''' ' + @Rule_whereSQL;   
				SET @Rule_whereSQL=REPLACE(@Rule_whereSQL,'_kodeReferral',isnull(@kodeReferral,''))
                --print @Rule_SQL 
				EXEC sp_executesql @Rule_SQL, @ParmDefinition, @retvalOUT=@retval OUTPUT; 
				 
				IF(@retval IS NOT NULL) 
					BEGIN 
					INSERT INTO @tblValidRule VALUES(@idMaster) 
					SET @txtValidRule = @txtValidRule+cast(@idMaster as varchar(10))+',' 
					END 
				ELSE 
					BEGIN 
					INSERT INTO @tblInvalidRule VALUES(@idMaster) 
					SET @txtInvalidRule = @txtInvalidRule+cast(@idMaster as varchar(10))+',' 
					END			 
				END 
			else 
				BEGIN 
				INSERT INTO @tblInvalidRule VALUES(@idMaster) 
				SET @txtInvalidRule = @txtInvalidRule+cast(@idMaster as varchar(10))+',' 
				END 
			 
			SET @Rule_idx=null 
			SET @Rule_operator=null 
			SET @Rule_val=null 
			SET @Rule_valType=null 
			SET @retval=null 
			SET @Rule_SQL=null 
			SET @Rule_whereSQL=null 
			 
			END 
 
		FETCH NEXT FROM dbCursor into @idMaster 
		END 
 
	CLOSE dbCursor 
	DEALLOCATE dbCursor 
	 
	--Get Things To Do 
	IF (@txtValidRule IS NOT NULL AND LEN(@txtValidRule)>0) 
		BEGIN 
		SET @txtValidRule=LEFT(@txtValidRule,LEN(@txtValidRule)-1) 
		DECLARE @idRule int=null 
		DECLARE @Result_SQL nvarchar(max)='' 
		DECLARE @Result_updateSQL nvarchar(max)='' 
		DECLARE @Result_concatResult nvarchar(max)='' 
		DECLARE dbCursor CURSOR FOR 
		SELECT idRule FROM @tblValidRule 
		 
		OPEN dbCursor 
		FETCH NEXT FROM dbCursor INTO @idRule 
		WHILE @@FETCH_STATUS=0 
			BEGIN 
			--print @idRule 
			SET @Result_concatResult='' 
			IF EXISTS( 
				SELECT 1 FROM SP_KKBSK_RuleEngine_DetailResult WITH(NOLOCK) where idMaster=@idRule 
			) 
				BEGIN 
				DECLARE dbCursorDetail CURSOR FOR 
				SELECT 'Result_'+idx+'=cast('''+val+''' as '+valType+'),' FROM SP_KKBSK_RuleEngine_DetailResult WITH(NOLOCK) WHERE idMaster=@idRule 
				 
				OPEN dbCursorDetail 
				FETCH NEXT FROM dbCursorDetail INTO @Result_concatResult 
				WHILE @@FETCH_STATUS=0 
					BEGIN 
					SET @Result_updateSQL=@Result_updateSQL+@Result_concatResult 
					FETCH NEXT FROM dbCursorDetail INTO @Result_concatResult 
					END 
				CLOSE dbCursorDetail 
				DEALLOCATE dbCursorDetail 
				 
				SET @Result_SQL=' 
					UPDATE SP_KKBSK_RuleEngine_LogSP_Budget 
					SET '+@Result_updateSQL+'validRule='''+@txtValidRule+''' WHERE token='''+@token+'''' 
				--print @Result_SQL 
				exec sp_executesql @Result_SQL  
				END 
			 
			FETCH NEXT FROM dbCursor INTO @idRule 
			END 
		CLOSE dbCursor 
		DEALLOCATE dbCursor	 
		END 
	--ELSE 
	--	BEGIN 
	--	UPDATE SP_KKBSK_RuleEngine_LogSP_Budget SET errorCode='01',errorMessage='No Rule Matched',invalidRule=@txtInvalidRule WHERE token=@token 
	--	END 
	IF EXISTS( 
		SELECT 1  
		FROM SP_KKBSK_RuleEngine_LogSP_Budget WITH(NOLOCK)  
		WHERE token=@token AND 
		Result_program			IS NOT NULL AND 
		Result_jenisPembiayaan	IS NOT NULL AND 
		Result_jenisSimulasi	IS NOT NULL AND 
		Result_nominalBudget	IS NOT NULL AND 
		Result_tipeKonsumen		IS NOT NULL AND 
		Result_melampirkanNPWP	IS NOT NULL AND 
		Result_cluster			IS NOT NULL AND 
		Result_tujuanPenggunaan	IS NOT NULL AND 
		Result_hargaKendaraan	IS NOT NULL AND 
		Result_thnKendaraan		IS NOT NULL AND 
		Result_wilayah			IS NOT NULL AND 
		Result_tipeAsuransi		IS NOT NULL AND 
		Result_jenisKendaraan	IS NOT NULL AND 
		Result_produk			IS NOT NULL AND 
		Result_dateParam		IS NOT NULL AND 
		Result_currYear			IS NOT NULL AND 
		Result_lengthRound		IS NOT NULL --AND 
		--Result_Perluasan		IS NOT NULL 
	) 
		BEGIN 
		UPDATE SP_KKBSK_RuleEngine_LogSP_Budget SET errorCode='00',errorMessage='Sukses',invalidRule=@txtInvalidRule WHERE token=@token 
		END 
	ELSE 
		BEGIN 
		UPDATE SP_KKBSK_RuleEngine_LogSP_Budget SET errorCode='02',errorMessage='Incomplete Result',invalidRule=@txtInvalidRule WHERE token=@token 
		END	 
	DECLARE @notif varchar(1000)=''
    SELECT @notif=a.Notifikasi FROM SP_KodePromo a with(nolock) inner join SP_KodeReferral b with(nolock) on a.id=b.idMaster where GETDATE() BETWEEN a.startBerlaku AND b.endBerlaku and a.kodePromo=@kodePromo and b.kodeReferral=@kodeReferral and a.stsData = 1
    IF(isnull(@notif,'')='')
        BEGIN
        IF(EXISTS(select 1 FROM SP_KodePromo a with(nolock) inner join SP_KodeReferral b with(nolock) on a.id=b.idMaster where GETDATE() BETWEEN a.startBerlaku AND b.endBerlaku and a.kodePromo=@kodePromo and a.stsData = 1))
            BEGIN
            SET @notif='Kode Promo tidak dapat digunakan, Berikut penawaran terbaik untuk anda'
            END
        ELSE
            BEGIN
            SET @notif='Kode Promo tidak ditemukan, Berikut penawaran terbaik untuk anda'
            END
        END
    UPDATE SP_KKBSK_RuleEngine_LogSP_Budget set Result_notifikasi=@notif where token=@token


	SELECT * FROM SP_KKBSK_RuleEngine_LogSP_Budget WITH(NOLOCK) WHERE token=@token 
	 
	END TRY 
	BEGIN CATCH 
	DECLARE @errMessage varchar(1000)=ERROR_MESSAGE() 
	INSERT INTO SP_KKBSK_RuleEngine_LogSP_Budget( 
		createddate 
		,program 
		,jenisPembiayaan 
		,jenisSimulasi 
		,nominalBudget 
		,tipeKonsumen 
		,melampirkanNPWP 
		,cluster 
		,tujuanPenggunaan 
		,hargaKendaraan 
		,thnKendaraan 
		,wilayah 
		,tipeAsuransi 
		,jenisKendaraan 
		,produk 
		,dateParam 
		,currYear 
		,lengthRound 
		,Perluasan 
		,errorCode 
		,errorMessage 
	)VALUES(GETDATE() 
	,@program 
	,@jenisPembiayaan 
	,@jenisSimulasi 
	,@nominalBudget 
	,@tipeKonsumen 
	,@melampirkanNPWP 
	,@cluster 
	,@tujuanPenggunaan 
	,@hargaKendaraan 
	,@thnKendaraan 
	,@wilayah 
	,@tipeAsuransi 
	,@jenisKendaraan 
	,@produk 
	,@dateParam 
	,@currYear 
	,@lengthRound 
	,@Perluasan 
	,'99',@errMessage) 
	SELECT '99' as errorCode,@errMessage as errorMessage 
	END CATCH 
	 
	BEGIN TRY  
		CLOSE dbCursor 
		DEALLOCATE dbCursor 
		CLOSE dbCursorDetail 
		DEALLOCATE dbCursorDetail  
	END TRY 
	BEGIN CATCH 
	END CATCH 
END
GO