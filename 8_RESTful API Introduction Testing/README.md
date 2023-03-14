### Resume Rest API Intrduction and Testing

## Introduction
API(Application Programming Interface) sebagai sarana dalam komunikasi dan pertukaran data dengan menggunkana interaksi dengan aplikasi lain. Manfaat dari rest api sendiri yaitu waktu yang dipakai menjadi efisien, bahasa yang digunakan independen, mampu mengurangi biaya jika melakukan pengujian, dan tentunya mengurangi resiko kegagalan aplikasi/produk.

Workflow dalam rest api ini yaitu klien akan mengajukan request kepada waiter yang mana disini adalah API kemudian request tersebut dilanjutkan ke sistem/server, setelah server mendapat request lalu ia akan memproses  dan mengajukan respon itu kembali ke waiter dan waiter meneruskan ke klien. Rest API menggunakan sistem komunikasi HTTP yang memiliki beberapa perintah seperti resource, get, put, post, delete dan masih banyak lagi. Komponen yang dimiliki pada Rest API sendiri yaitu
- methode
- URL (Base URL +Path)
- Header
- Body

## API Testing
API Testing terdiri dari beberapa rangkaian uji
1. Functionally
2. load Testing
3. security
 Tools yang digunakan pada praktikum ini yaitu Postman diantara tools lain seperti Jmeter dsb. Proses yang dilakukan dalam melakukan pengujian rest API adalah membuat spesifikasi review kemudian melakukan test terhadap spesifikasi development, melakukan framework development, membuat test case development (membuat test skenario dan test case) yang terakhir yaitu melakukan eksekusi terhadap test case yang dilakukan.

 Tantangan dalam pengujian API yaitu terdapat parameter yang kompleks sehingga kombinasi tersebut harus diperiksa secara teliti, tidak adanya GUI, harus paham mengenai parameter yang digunakan dalam aplikasi atau produk tersebut, kemudian harus melakukan tes eror handling dari sistem API.
