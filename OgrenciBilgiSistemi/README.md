# Öðrenci Not Sistemi
Course Sýnýfý Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Teacher Sýnýfý Özellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()
Student Sýnýfý Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
Ödev
Course sýnýfýna derse ait sözlü notu kýsmýný girin ve ortalamaya etkisini her ders için ayrý ayrý belirtin. Sözlü notlarýn ýda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sýnav notunun etkisi %80'dir.

Öðrenci sözlüden 90, sýnavdan 60 almýþ ise, o dersin genel ortalamaya etkisi þu þekilde hesaplanýr :

Fizik Ortalamasý : (90 * 0.20) + (60* 0.80);
