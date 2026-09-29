**Encapsulation:**
Atribut sisi, radius, dan tinggi dibuat private dan hanya bisa diakses lewat getter/setter seperti 
getSisi(), setRadius, dan setTinggi().PHI di buat public static final agar nilainya tidak bisa diubah, 
Satu-satunya yang lebih longgar adalah warna di Bentuk, yang public karena mengikuti UML ( + warna).

**Inheritance:**
Rantai pewarisannya adalah Bentuk --> BujurSangkar --> dan Bentuk --> Lingkaran --> Silinder, ditulis dengan extends. 
Subclass mewarisi warna, getWarna(), dan setWarna() dari Bentuk tanpa menulis ulang. super(warna) dikonstruktor mengisi
atrbut milik induk. Silinder memakai (hitungLuas() * tinggi).

**Polymorphism:**
printInfo() di-override dengan @Override di BujurSangkar, Lingkaran, dan Silinder, sehingga satu nama method 
menghasilkan output berbeda di tiap kelas. TestBentuk belum memperlihatkannya sepenuhnya karena setiap objek ditampung 
di variabel bertipe kelasnya sendiri. Polimorfisme baru terlihat jelas bila objek ditampung sebagai tipe induk, 
misalnya Bentuk[] daftar lalu memanggil b.printInfo() dalam perulangan.
