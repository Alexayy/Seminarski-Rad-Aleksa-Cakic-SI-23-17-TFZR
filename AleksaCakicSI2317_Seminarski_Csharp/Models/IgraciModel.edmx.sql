
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, 2012 and Azure
-- --------------------------------------------------
-- Date Created: 08/15/2020 17:13:46
-- Generated from EDMX file: C:\Users\alex\Desktop\Seminarski-Rad-Aleksa-Cakic-SI-23-17-TFZR\AleksaCakicSI2317_Seminarski_Csharp\Models\IgraciModel.edmx
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

IF OBJECT_ID(N'[dbo].[igraci]', 'U') IS NOT NULL
    DROP TABLE [dbo].[igraci];
GO

-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'igracis'
CREATE TABLE [dbo].[igracis] (
    [igrac_id] int IDENTITY(1,1) NOT NULL,
    [igrac_ime] varchar(50)  NULL,
    [igrac_prezime] varchar(50)  NULL,
    [igrac_broj] varchar(50)  NULL,
    [igrac_tim] varchar(50)  NULL,
    [igrac_godiste] int  NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [igrac_id] in table 'igracis'
ALTER TABLE [dbo].[igracis]
ADD CONSTRAINT [PK_igracis]
    PRIMARY KEY CLUSTERED ([igrac_id] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------