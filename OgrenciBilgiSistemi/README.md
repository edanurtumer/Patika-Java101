# ��renci Not Sistemi
Course S�n�f� �zellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Teacher S�n�f� �zellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()
Student S�n�f� �zellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
�dev
Course s�n�f�na derse ait s�zl� notu k�sm�n� girin ve ortalamaya etkisini her ders i�in ayr� ayr� belirtin. S�zl� notlar�n �da ortalamaya etkileme y�zdesi ile dahil edin.

�rnek : Fizik dersine ait s�zl� notunun ortalamaya etkisi %20 ise s�nav notunun etkisi %80'dir.

��renci s�zl�den 90, s�navdan 60 alm�� ise, o dersin genel ortalamaya etkisi �u �ekilde hesaplan�r :

Fizik Ortalamas� : (90 * 0.20) + (60* 0.80);
