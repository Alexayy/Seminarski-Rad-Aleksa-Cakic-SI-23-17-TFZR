
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, 2012 and Azure
-- --------------------------------------------------
-- Date Created: 08/15/2020 17:19:08
-- Generated from EDMX file: C:\Users\alex\Desktop\Seminarski-Rad-Aleksa-Cakic-SI-23-17-TFZR\AleksaCakicSI2317_Seminarski_Csharp\Models\TimoviModel.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [Seminarski];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------


-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[timovi]', 'U') IS NOT NULL
    DROP TABLE [dbo].[timovi];
GO

-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'timovis'
CREATE TABLE [dbo].[timovis] (
    [tim_id] int IDENTITY(1,1) NOT NULL,
    [tim_ime] varchar(50)  NULL,
    [tim_osnovan] int  NULL,
    [tim_trener] varchar(50)  NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [tim_id] in table 'timovis'
ALTER TABLE [dbo].[timovis]
ADD CONSTRAINT [PK_timovis]
    PRIMARY KEY CLUSTERED ([tim_id] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------