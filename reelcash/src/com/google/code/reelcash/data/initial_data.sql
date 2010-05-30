insert into countries(name, iso_name, iso_code2, iso_code3) values('Romania', 'Romania', 'RO', 'ROM');
insert into regions(country_id, code, name) values (1, 'NV', 'Nord-Vest');
insert into regions(country_id, code, name) values (1, 'S', 'Sud');
insert into regions(country_id, code, name) values (1, 'TR', 'Transilvania');
insert into counties(region_id, code, name) values(1, 'SM', 'Satu Mare');
insert into counties(region_id, code, name) values(2, 'B', 'Bucuresti');
insert into counties(region_id, code, name) values(3, 'CJ', 'Cluj');
insert into counties(region_id, code, name) values(1, 'MM', 'Maramures');
insert into cities(county_id, "name") values(1, 'Satu Mare');
insert into cities(county_id, "name") values(2, 'Bucuresti');
insert into cities(county_id, "name") values(3, 'Cluj-Napoca');
insert into cities(county_id, "name") values(4, 'Baia Mare');
insert into cities(county_id, "name") values(4, 'Tohat');
insert into locations(city_id, address, postal_code) values (1, 'Pta. N. Titulescu, nr. 18/A', '440056');
insert into locations(city_id, address, postal_code) values (1, 'Str. Marsilia, nr. 44/1', '440061');
insert into locations(city_id, address, postal_code) values (1, 'Pta. 25 Octombrie, nr. 12', '440006');
insert into locations(city_id, address, postal_code) values (2, 'Str. Lipscani, nr. 25, Sector 3', '030031');
insert into locations(city_id, address, postal_code) values (3, 'Str. G. Baritiu, nr. 8', '400027');
insert into locations(city_id, address, postal_code) values (3, 'Str. Macesului, nr. 7', '400483');
insert into contacts("name", surname, location_id) values ('Andrei', 'Olar', 1);
insert into contacts("name", surname, location_id) values ('Doina-Monica', 'Olar', 1);
insert into contacts("name", surname, location_id) values ('Alexandru', 'Olar', 1);
insert into banks("name", location_id, allow_currency_exchange) values ('Banca Nationala A Romaniei', 4, 1);
insert into banks("name", location_id, allow_currency_exchange) values ('Banca Transilvania SA', 5, 0);
insert into banks("name", location_id, parent_id, allow_currency_exchange) values ('Banca Transilvania SA Sucursala Satu Mare', 3, 2, 0);
insert into phones(phone) values('40722607996');
insert into phones(phone) values('40722398673');
insert into phones(phone) values('40261714102');
insert into phones(phone) values('40371178075');
insert into phones(phone) values('40727936624');
insert into contact_identities(contact_id, identity_type, identity_field1, identity_field2) values (1, 'CNP', '1830705304008', '');
insert into contact_identities(contact_id, identity_type, identity_field1, identity_field2) values (1, 'CI', 'SM', '337861');
insert into contact_locations(contact_id, location_id, priority) values (1, 1, 1);
insert into contact_locations(contact_id, location_id, subdivision, priority) values (1, 6, 'CORP I, 7C', 2);
insert into contact_locations(contact_id, location_id) values (2, 1);
insert into contact_locations(contact_id, location_id) values (2, 2);
insert into contact_locations(contact_id, location_id) values (3, 1);
insert into contact_phones(contact_id, phone_id, priority, category) values (1, 1, 1, 'mobile');
insert into contact_phones(contact_id, phone_id, priority, category) values (2, 5, 1, 'mobile');
insert into contact_phones(contact_id, phone_id, priority, category) values (2, 4, 2, 'home');
insert into contact_phones(contact_id, phone_id, priority, category) values (2, 3, 3, 'home');
insert into contact_phones(contact_id, phone_id, priority, category) values (3, 2, 1, 'mobile');
insert into contact_phones(contact_id, phone_id, priority, category) values (3, 4, 2, 'home');
insert into contact_phones(contact_id, phone_id, priority, category) values (3, 3, 3, 'home');
insert into legal_statuses(code, `name`) values('PF', 'Persoana Fizica');
insert into legal_statuses(code, `name`) values('PFA', 'Persoana Fizica Autorizata');
insert into legal_statuses(code, `name`) values('II', 'Intreprindere individuala');
insert into legal_statuses(code, `name`) values('AF', 'Asociatie Familiala');
insert into legal_statuses(code, `name`) values('SNC', 'Societate in Nume Colectiv');
insert into legal_statuses(code, `name`) values('SRL', 'Societate cu Raspundere Limitata');
insert into legal_statuses(code, `name`) values('SA', 'Societate pe Actiuni');
insert into legal_statuses(code, `name`) values('SCS', 'Societate in Comandita Simpla');
insert into legal_statuses(code, `name`) values('SCA', 'Societate in Comandita pe Actiuni');
insert into legal_statuses(code, `name`) values('CS', 'Club sportiv');
insert into legal_statuses(code, `name`) values('A', 'Asociatie');
insert into legal_statuses(code, `name`) values('F', 'Fundatie');
insert into legal_statuses(code, `name`) values('COOP', 'Cooperativa');
insert into legal_statuses(code, `name`) values('RA', 'Regie Autonoma');
insert into currencies(code, `name`, must_exchange) values('RON', 'Leul romanesc nou', 0);
insert into currencies(code, `name`, must_exchange) values('ROL', 'Leul romanesc', 1);
insert into currencies(code, `name`, must_exchange) values('USD', 'Dolar', 1);
insert into currencies(code, `name`, must_exchange) values('EUR', 'Euro', 1);
insert into currencies(code, `name`, must_exchange) values('GBP', 'Lira sterlina', 1);
insert into currencies(code, `name`, must_exchange) values('CHF', 'Francul elvetian', 1);
insert into exchange_rates(currency_id, bank_id, permanent, `value`) values (2, 1, 1, 10000);
insert into bank_accounts(bank_id, account) values(3, 'RO09BTRL03101202E01254XX');
insert into bank_accounts(bank_id, account) values(2, 'RO90BTRL01301202I21420XX');
insert into permissions(`name`, `description`) values('E', 'emit documents');
insert into permissions(`name`, `description`) values('R', 'receive documents');
insert into businesses(`name`, location_id, bank_account_id, legal_status_id) values('SC SAM LEX SRL', 1, 1, 6);
insert into businesses(`name`, location_id, bank_account_id, legal_status_id) values('OLAR ANDREI PFA', 1, 2, 2);
insert into business_permissions(business_id, permission_id) values (1, 1);
insert into business_permissions(business_id, permission_id) values (1, 2);
insert into business_permissions(business_id, permission_id) values (2, 1);
insert into business_permissions(business_id, permission_id) values (2, 2);
insert into business_representatives(business_id, contact_id, text, description) values (1, 2, 'Manager', 'General manager');
insert into business_representatives(business_id, contact_id, text, description) values (1, 3, 'Manager', 'General manager');
insert into business_representatives(business_id, contact_id, text, description) values (2, 1, '', '');
insert into fiscal_identification(business_id, `name`, `value`) values (1, 'CIF', 'RO21244970');
insert into fiscal_identification(business_id, `name`, `value`) values (1, 'CUI', '21244970');
insert into fiscal_identification(business_id, `name`, `value`) values (1, 'ORC', 'J30/329/28.02.2007');
insert into fiscal_identification(business_id, `name`, `value`) values (2, 'CIF', 'RO22456360');
insert into fiscal_identification(business_id, `name`, `value`) values (2, 'CUI', '22456360');
insert into fiscal_identification(business_id, `name`, `value`) values (2, 'ORC', 'F30/778/24.09.2007');
insert into document_types(`name`, description) values ('D', 'Document');
insert into document_types(`name`, description) values ('I', 'Factura');
insert into document_types(`name`, description) values ('R', 'Chitanta');
insert into document_types(`name`, description) values ('P', 'Plata');
insert into document_types(`name`, description) values ('C', 'Incasare');
insert into document_states(`name`, description) values ('N', 'Document nou');
insert into document_states(`name`, description) values ('I', 'Trimis');
insert into document_states(`name`, description) values ('R', 'Receptionat');
insert into units(code, `name`) values ('buc', 'bucata');
insert into units(code, `name`) values ('kg', 'kilogram');
insert into units(code, `name`) values ('l', 'litru');
insert into units(code, `name`) values ('m', 'metru');
insert into units(code, `name`) values ('ora', 'ora de munca');
insert into vat_types(code, `name`, percent) values('19%', 'TVA pentru uz intern', 0.19);
insert into vat_types(code, `name`, percent) values('Scutit', 'Scutire de TVA', 0.0);
insert into vat_types(code, `name`, percent) values('9%', 'TVA de 9%', 0.09);