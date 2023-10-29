Question1--------

Unit Test, bir yazılımın en küçük ve test edilebilir bölümlerinin incelendiği bir yazılım geliştirme sürecidir. Unit Test, yazılım testinin ilk seviyesidir ve entegrasyon testinden önce gelir. Buradaki amacımız yazılımın her kısmının tasarlandığı şekilde gerçekleştiğini doğrulamaktır. Unit Test yazmak kodda yeniden düzenleme işlemini yapmayı kolaylaştırır. Kodda değişiklik yaptığımızda, oluşturduğumuz algoritmaya uygun bir şekilde çalışıp çalışmadığını kolaylıkla test edebiliriz.

Unit Test Framework’ leri

Robot Framework
- JUnit
- Spock
- NUnit
- TestNG
- Jasmin
- Mocha

Bir Unit test yazmak için;

- En küçük parçacığı test edilmeli
- Sadece bir senaryo test edilir.
- Kullanılan adımlar belirlenir.
- Test method ismi test edilen yapıyı andırmalıdır.
- Test edilen kısım diğer kısımlardan bağımsız olmalıdır.
- Testlerimiz tam otomatik şekilde çalışmalıdır.
- Hızlı çalışabilmeli ve çabuk sonuçlar vermelidir.
- Okunaklı, anlaşılabilir ve sürdürebilir olmalıdır.
- Test başarısız olduğunda durmalı ve iyi bir hata raporu döndürmelidir.

Question2-------

Design Patterns (Tasarım Kalıpları), yazılımın geliştirme aşamasındaki yeni bir senaryoda sorunun nasıl çözüleceğini bilmek için kullanılan bir şablon yöntemidir. Belli bir kod yazacağımızı düşünelim, ihtiyacımız olan bir kalıbı yeniden yazmak yerine hali hazırda
bulunan ve uygulanabilirliği kanıtlanan bu patternler sayesinde problemimizi daha rahat çözebiliriz. 3 tip Design pattern vardır;

- Yaratıcı Tasarım Kalıpları (Creational Design Patterns)
  Nesnelerin oluşturulması ve yönetilmesi ile ilgilidir. Nesnelerin hangi koşullarda oluşturacağını, nesnelerinin durumunu ve nesne oluşturulurken en optimal çözümlerin üretilmesi için geliştirilmiş tasarımlardır. Örneğin;

  * Factory Pattern          :  Aynı abstract class veya interface’den türeyen nesnelerin üretiminin bir genel bir class üzerinde sağlanmasında kullanılır. 
  * Singleton Pattern        :  Bir sınıftan yalnızca bir nesne üretilebilmesini garanti eder ve diğer sınıfların yeni nesne üretmeleri yerine bu nesneye erişebilmelerine olanak sağlar.

- Yapısal Tasarım Kalıpları (Structural Design Patterns)
  Daha büyük yapılar oluşturmak için class'ların tasarımı ve birbirileri arasındaki ilişkilerin nasıl olacağı ile ilgilidir. Örneğin;

  * Adapter Design Pattern   : Bir sistem parçasının, var olan başka bir sisteme adapte edilmesini ve o sistem içerisinde kullanılabilmesini sağlayan bir kalıptır.
  * Composite Design Pattern : Kendi içlerinde birbirlerinden farklı olan bir grup nesnenin sanki tek bir bütün nesneymiş gibi kullanılabilmesine imkan sağlayan tasarım desenidir.

- Davranışsal Tasarım Kalıpları( Behavioral Design Pattern ) 
   Nesneler arasındaki iletişim ve nesneler arasında sorumlulukların nasıl atandığı ile ilgilidir. Nesnelere doğru sorumlulukların verilmesi, uygun algoritmaların kullanılması ve nesnelerin doğru yerde doğru işi yapmalarını sağlayan tasarımlardır. Örneğin;

   * Strategy Design Pattern : Spesifik bir işi bir çok farklı yolla yapan bir sınıfı alıp bütün bu algoritmaları "strategy" adı verilen ayrı sınıflara ayırmamızı sağlar.
   * Command Design Pattern  : Metotları bir aracı üzerinden çağırmayı ve böylece istemci ile metot arasındaki bağı zayıflatmayı hedefleyen bir tasarım desenidir. Böylece istemciyi değiştirdiğimizde, metot bundan etkilenmez, metodu değiştirdiğimizde istemci bu değişimden etkilenmez.

  





