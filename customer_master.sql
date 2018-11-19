create table tanu_CustomerMaster
(
Customer_ID number(10) not null,
Customer_Code varchar(10) not null primary key,
    Customer_Name varchar(30) not null,
   Customer_Address1 varchar(100) not null,
   Customer_Address2 varchar(100) null,
   Customer_Pin_Code number(6) not null,
   E_mail_address  varchar(100) not null,
   Contact_Number number(20) null,
   Primary_Contact_Person varchar(100) not null,
   RecordStatus varchar(1)  not null,
ActiveInactiveFlag varchar(1)  not null,
CreateDate date not null,
CreatedBy  varchar(30)  not null,
ModifiedDate date  null,
ModifiedBy  varchar(30)   null,
AuthorizedDate  date  null,
AuthorizedBy   varchar(30)  not null
);


