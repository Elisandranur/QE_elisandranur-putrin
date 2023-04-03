### Resume Rest API with rest assured

## Rest API with Rest assured
Data ditransfer menggunakan REST (Representational State Transfer) API berbasis web. Itu dilakukan pada CRUD (Make, read, Perbarui, delete) pada data melalui permintaan HTTP. Toolkit berbasis Java yang disebut Rest-assured menawarkan bahasa khusus domain untuk membuat pengujian API. Karena menawarkan cara yang mudah dan mudah dipahami untuk membuat pengujian API dan mendukung format data JSON dan XML, ini banyak digunakan untuk menguji API REST karena mampu mengirimkan permintaan HTTP dengan mudah dan memvalidasi balasan server menggunakan assured. API testing yang ditawarkannya menyediakan metode permintaan, URL, header, argumen, dan informasi payload.

Fundamental test proses dari API meliputi
- Record, Define API Information
- Parsing, Filter or recording API data and then extract
- reconstruction API calls, and sent them from stimulate client
- Test validation

Piramida pengujian untuk pengujian API adalah strategi pengujian yang melibatkan pengorganisasian pengujian API ke dalam tiga level atau lapisan yang berbeda: pengujian unit, pengujian integrasi, dan  end-to-end (E2E). Gagasan di balik piramida tes adalah untuk memastikan bahwa sebagian besar tes ditulis di tingkat yang lebih rendah di mana mereka lebih cepat, lebih murah, dan lebih dapat diandalkan, dan lebih sedikit tes yang ditulis di tingkat yang lebih tinggi. Kepraktisan piramida pengujian untuk pengujian API adalah sebagai berikut:

- Tes Unit: Tes ini berfokus pada pengujian fungsi atau metode individual secara terpisah. Dalam  pengujian API, pengujian unit dapat digunakan untuk menguji titik akhir, pengontrol, atau lapisan layanan API. Tes unit biasanya otomatis dan berjalan cepat, menjadikannya ideal untuk menangkap bug kecil di awal proses pengembangan.
- Tes integrasi: Tes ini berfokus pada pengujian interaksi berbagai komponen API. Pengujian integrasi dapat digunakan, misalnya, untuk menguji bagaimana API berinteraksi dengan database, cache, atau layanan pihak ketiga. Pengujian integrasi lebih lambat daripada pengujian unit, tetapi masih relatif cepat dan dapat membantu mengidentifikasi bug yang mungkin tidak dapat dilakukan oleh pengujian unit.
- Pengujian Penuh: Pengujian ini berfokus pada pengujian seluruh API, termasuk semua berbagai komponen dan integrasi  serta antarmuka pengguna. Pengujian end-to-end lebih lambat dan lebih kompleks daripada pengujian unit atau integrasi, tetapi dapat membantu mengidentifikasi cacat yang  hanya dapat terjadi jika semua komponen bekerja sama.

Dengan menggunakan piramida pengujian untuk pengujian API Anda, Anda dapat memastikan bahwa sebagian besar pengujian Anda ditulis di tingkat yang lebih rendah, yang lebih cepat, lebih murah, dan lebih andal, dan lebih sedikit pengujian yang ditulis di tingkat yang lebih tinggi. Ini dapat membantu  menangkap bug di awal proses pengembangan dan memastikan bahwa API  berfungsi seperti yang diharapkan. Selain itu, menggunakan piramida pengujian dapat membantu Anda mengurangi  biaya pengujian dan memastikan bahwa API Anda stabil dan andal.
