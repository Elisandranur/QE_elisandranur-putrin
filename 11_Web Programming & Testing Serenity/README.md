### Resume Web Programming dan Review Web UI testing with serenity

## Website Programming Menggunakan HTML
Pemrograman website dengan HTML (Hypertext Markup Language) adalah proses pembuatan halaman web dan aplikasi web menggunakan HTML. HTML adalah bahasa markup yang digunakan untuk membuat dan memformat konten untuk web. Ini adalah bahasa markup standar untuk membuat halaman web dan digunakan bersama dengan teknologi web lainnya seperti CSS (Cascading Style Sheets) dan JavaScript. HTML menyediakan sekumpulan tag dan atribut yang digunakan untuk menentukan struktur dan konten halaman web. Sebagai contoh, tag <html> mendefinisikan awal dari dokumen HTML, tag <head> berisi informasi tentang dokumen seperti judul dan tautan ke stylesheet, dan tag <body> berisi konten utama dokumen. contoh sederhana dari programnya yaitu
<!DOCTYPE html>
<html>
  <head>
    <title>ELISA'S PAGE</title>
  </head>
  <body>
    <h1>XX SELAMAT DATANGGG!</h1>
    <p>This is a paragraph of text.</p>
    <ul>
      <li>Item 1</li>
      <li>Item 2</li>
      <li>Item 3</li>
    </ul>
  </body>
</html>

Pada contoh ini, dokumen HTML dasar dengan judul dan beberapa konten. Deklarasi <!DOCTYPE html> digunakan untuk menentukan versi HTML. Tag <html> mendefinisikan awal dokumen HTML, dan tag <head> dan <body> masing-masing berisi informasi tentang dokumen atau konten utama. Tag <h1> digunakan untuk membuat judul, dan tag <p> digunakan untuk membuat paragraf. Tag <ul> digunakan untuk membuat daftar tidak berurutan, dan tag <li> menentukan setiap item dalam daftar. pemrograman web dengan HTML melibatkan penggunaan tag dan atribut HTML untuk membuat struktur dan konten halaman web dan aplikasi web. teknologi web lainnya seperti CSS dan JavaScript digunakan bersama dengan HTML untuk membuat halaman web dan aplikasi web yang lebih canggih.

## Review Web UI testing with serenity
Serenity adalah framework otomatis pengujian yang dapat digunakan untuk menguji situs web dan jenis aplikasi perangkat lunak lainnya. Serenity menyediakan sejumlah fitur yang dapat membantu penguji membuat dan menjalankan pengujian otomatis, membuat laporan, dan mengelola hasil pengujian. Saat menguji situs web menggunakan Serenity, penguji dapat membuat pengujian otomatis menggunakan salah satu dari beberapa bahasa pemrograman, termasuk Java, Groovy, dan Kotlin. Serenity menggunakan gaya pengujian BDD (Behavior-Driven Development), yang berfokus untuk menggambarkan perilaku sistem dengan cara yang jelas dan mudah dipahami.

QA dapat menulis skrip pengujian mengenai situs web, memasukkan data ke dalam formulir, mengklik tombol, dan menavigasi halaman. Serenity juga mendukung pengujian di tingkat API, yang memungkinkan penguji memverifikasi bahwa sistem backend situs web berfungsi dengan benar. Setelah pengujian ditulis, Serenity dapat menjalankannya dan menghasilkan laporan yang menunjukkan hasil pengujian, termasuk kegagalan atau kesalahan yang terjadi. Laporan ini dapat digunakan untuk mengidentifikasi dan mendiagnosis masalah pada situs web dan untuk memastikan bahwa situs berfungsi dengan benar. menggunakan Serenity untuk menguji situs web dapat membantu penguji membuat dan menjalankan pengujian dengan lebih efisien dan efektif, yang mengarah ke situs web yang lebih berkualitas dan lebih andal. Prosedur pengujian UI web dengan Serenity di IntelliJ memerlukan beberapa langkah:
- membuat proyek Serenity: Di IntelliJ, buat proyek Java baru dan tambahkan dependensi yang diperlukan untuk Serenity, termasuk pustaka Serenity-core dan Serenity-junit.
- menuliskan skenario pengujian: Dengan menggunakan gaya BDD Serenity, tulis skenario pengujian yang menjelaskan perilaku yang diharapkan dari UI web. Skenario ini harus ditulis dalam format yang dapat dibaca manusia dan harus menyertakan langkah-langkah untuk berinteraksi dengan UI web, seperti mengklik tombol atau mengisi formulir.
- menulis definisi langkah: Untuk setiap langkah dalam skenario pengujian, tulis definisi langkah yang memetakan langkah tersebut ke kode aktual yang akan berinteraksi dengan UI web. Definisi langkah ini harus menggunakan dukungan WebDriver Serenity untuk mengotomatiskan interaksi dengan UI web.
- melakukan eksekusi pengujian: Setelah skenario pengujian dan definisi langkah telah ditulis, gunakan pelari pengujian IntelliJ untuk menjalankan pengujian. Runner pengujian akan menjalankan setiap skenario dan definisi langkah dan melaporkan setiap kesalahan atau kegagalan yang terjadi.
- melakukan review hasil pengujian: Serenity menghasilkan laporan HTML komprehensif yang memberikan informasi mendetail tentang pengujian yang dijalankan, termasuk kegagalan atau kesalahan apa pun yang terjadi. Laporan ini dapat ditinjau di browser web dan memberikan gambaran yang jelas tentang hasil pengujian.
