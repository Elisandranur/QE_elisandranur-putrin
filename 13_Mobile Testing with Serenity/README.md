### Resume Mobile Testing with Serenity

## Mobile Testing with Serenity
Mobile testing dengan Serenity adalah pendekatan pengujian perangkat lunak yang menggabungkan penggunaan kerangka kerja Serenity BDD (Behavior Driven Development) dengan alat mobile testing untuk melakukan pengujian mobile secara otomatis. Sedangkan, Serenity BDD adalah kerangka kerja sumber terbuka yang digunakan untuk mengembangkan pengujian penerimaan otomatis berkualitas tinggi yang dapat dipelihara untuk aplikasi web dan seluler. Mobile testing dengan Serenity melibatkan pembuatan pengujian penerimaan otomatis menggunakan kerangka kerja Serenity BDD dan mengintegrasikannya dengan alat pengujian mobile seperti Appium atau Selendroid. Alat ini memungkinkan pengujian berinteraksi dengan antarmuka pengguna aplikasi seluler dan mensimulasikan interaksi pengguna. Tes dapat dibuat dalam behavior-driven development style, menggunakan sintaks Gherkin, yang membuatnya mudah dipahami oleh pengujian teknis dan non-teknis. Tes ditulis dalam format bahasa alami, membuatnya lebih mudah dibaca dan dipelihara.

Mobile Testing dengan Serenity memiliki beberapa keuntungan, antara lain:
- Automated testing: Dengan menggunakan kerangka Serenity BDD, pengujian dapat diotomatisasi dan dijalankan berulang kali, memungkinkan pengujian yang lebih cepat dan menyeluruh.
- Improved test coverage: Serenity BDD memungkinkan pembuatan tes penerimaan yang mencakup berbagai skenario, memastikan bahwa aplikasi seluler diuji secara menyeluruh.
- Better collaboration: Serenity BDD memungkinkan kolaborasi antara pemangku kepentingan yang berbeda, termasuk pengembang, penguji, dan analis bisnis, memastikan bahwa setiap orang memiliki pemahaman yang sama mengenai persyaratan dan harapan.
- Detailed reporting: Serenity BDD memberikan laporan terperinci tentang hasil pengujian, memudahkan untuk mengidentifikasi masalah apa pun dan melacak kemajuan dari waktu ke waktu.

## Appium
Appium adalah perangkat atau software otomatisasi pengujian sumber terbuka untuk aplikasi seluler/mobile yang mendukung untuk mengotomatiskan pengujian untuk aplikasi web asli, hibrid, dan seluler pada platform Android dan iOS. Ini mendukung berbagai bahasa pemrograman termasuk Java, Python, Ruby, JavaScript, dan banyak lagi. Appium menggunakan protokol WebDriver untuk mengotomatiskan interaksi dengan antarmuka pengguna aplikasi dan mensimulasikan tindakan pengguna seperti tapping, scrolling, swiping, dan typing. Untuk menggunakan Appium untuk pengujian seluler, dapat dilakukan langkah-langkah berikut:
1. Install Appium
2. Install the Appium client library
3. Set up the desired capabilities: Langkah selanjutnya adalah menyiapkan capabilities yang diinginkan untuk pengujian. Kemampuan yang diinginkan mencakup nama perangkat, nama platform, nama paket aplikasi, nama aktivitas aplikasi, dan lainnya.
4. menuliskan skrip pengujian: Setelah menyiapkan capabilities yang diinginkan, selanjutnya menulis skrip pengujian dalam bahasa pemrograman pilihan. Skrip pengujian ini akan mengotomatiskan interaksi pengguna dengan aplikasi seluler.
5. Jalankan skrip pengujian: Terakhir, dapat menjalankan skrip pengujian di perangkat seluler atau emulator menggunakan Appium. penguji bisa menggunakan alat Appium GUI atau antarmuka baris perintah untuk menjalankan pengujian.

Appium menyediakan platform yang fleksibel dan kuat untuk pengujian seluler, memungkinkan untuk mengotomatiskan berbagai skenario pengujian untuk aplikasi web asli, hibrid, dan seluler. Dengan menggunakan Appium, Anda dapat memastikan bahwa aplikasi seluler telah diuji secara menyeluruh dan memenuhi persyaratan dan harapan client.

Ketika melakukan Setup desired capabilities, perlu memerhatikan hal berikut ini, desired capabilities adalah istilah yang digunakan di Appium dan alat otomatisasi pengujian lainnya untuk menjelaskan serangkaian pengaturan konfigurasi yang digunakan untuk menyesuaikan perilaku skrip otomatisasi pengujian. Kemampuan yang diinginkan khusus untuk perangkat seluler atau emulator yang menjalankan skrip, dan menentukan parameter yang diperlukan untuk membuat koneksi antara skrip pengujian dan perangkat. Untuk menyiapkan desired capabilities di Appium, perlu untuk menentukan sejumlah pasangan key-value yang menjelaskan karakteristik perangkat dan aplikasi yang sedang Anda uji. misalkan berikut merupakan desired capabilities yang diinginkan:

- platformName: Nama platform seluler, "Android" atau "iOS".
- deviceName: Nama perangkat seluler atau emulator yang ingin Anda uji.
- app: Jalur ke file APK atau IPA dari aplikasi yang ingin Anda uji.
- appPackage: Nama paket aplikasi yang ingin Anda uji.
- appActivity: Aktivitas utama aplikasi yang ingin Anda uji.
- automationName: Nama mesin otomatisasi yang harus digunakan, "Appium" (default) atau "UiAutomator2" (untuk Android) atau "XCUITest" (untuk iOS).

Berikut adalah contoh pengaturan desired capabilities di Java:

- DesiredCapabilities caps = new DesiredCapabilities();
- caps.setCapability("deviceName", "Pixel_3a_API_29");
- caps.setCapability("appPackage", "com.example.myapp");
- caps.setCapability("automationName", "UiAutomator2");

Dalam contoh ini, capa yang di set merupakan yang diinginkan untuk perangkat Android, menentukan nama perangkat, jalur ke file APK aplikasi, nama paket, aktivitas utama, dan mesin otomasi yang harus digunakan. Dengan menyetel desired capabilities di Appium, skrip dapat disesuaikan dengan otomatisasi pengujian agar cocok dengan karakteristik perangkat dan aplikasi yang diuji, memastikan pengujian berjalan lancar dan akurat.
