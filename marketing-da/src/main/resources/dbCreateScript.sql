/*
    Aşağıdaki scriptler veritabanına root kullanıcısı ile bağlandıktan sonra çalıştırılmalıdır. Aksi halde yetki hatası alınacaktır.
*/

create database marketing; -- Yeni veritabanı oluşturur.

create user 'springuser'@'%' identified by 'ThePassword'; -- springuser kullanıcısını oluşturur.

grant all on marketing.* to 'springuser'@'%'; -- springuser kullanıcısına marketing altındaki tüm nesneler için tüm yetkileri verir.
