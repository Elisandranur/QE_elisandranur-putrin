### Resume Iterable Data Structure

## Iterable Data Structure
Antarmuka variabel disertakan dalam paket java.lang. Ini mewakili struktur data berulang. Antarmuka Iterable menyediakan metode yang membuat iterator. Menggunakan Iterable kita tidak bisa mendapatkan elemen dari indeks. Selain itu, kami tidak mendapatkan elemen pertama atau terakhir dari struktur data. Implementasi khusus dari antarmuka Iterable dapat berguna jika kita memiliki struktur data spesifik yang ingin kita iterasi.

OUTLINE dari iterable data sendiri itu memiliki beberapa fungsi command seperti,
- Stack, Stack adalah struktur data dengan sistem LIFO, yang terakhir menjadi posisi yang pertama. fungsi yang ada dalam stack seperti init(), full(), empty(), clear()
- Queue, merupakan data yang memiliki penambahan elemen didalamnya baik pada sisi belakang maupun dengan penghapusan dari sisi depan. fungsi yang umum digunakan seperti create(), enqueue(), clear(), isempty().
- Priority Queue, merupakan bentuk dari struktur data yang memiliki basis seperti pada Queue umum. Implementasi yang disajikan merupakan bentuk dari data heaps. fungsinya seperti heaps, comparator, last.
- Deque ialah antrian dimana elemennya bisa masuk dan keluar lewat kedua ujungnya (berbeda dengan queue yang hany bisa masuk lewat ujung belakang dan keluar lewat ujung depan). Biasanya DEQUE disajikan dengan menggunakan Double link list yang memiliki dua buah pointer yang menunjuk ke posisi sebelumnya dan sesudahnya.
- Set & Map, Set adalah jenis array yang tidak membolehkan adanya value duplicate, saat ada insert value yang sudah ada sebelumnya, maka value itu akan terotomatisasi dibuang salah satunya dan akhirnya value tersebut hanya tetap ada satu saja. Set juga memiliki beberapa fungsi yang cukup membantu, seperti clear(), add (Object e), remove(Object e). Map adalah jenis array yang indexnya tidak hanya nilai integer 0,1,2 dan seterusnya, melainkan kita dapat melakukan custom pada nilai indexnya, asalkan nilai indexnya adalah selalu unik. Pada jenis array ini masih memiliki kemungkinan terdapat value yang sama (duplicate)

Iterator merepresentasikan interface yang digunakan untuk melakukan pengulangan terhadap collection yang dimilikinya. Ketika akan mengimplementasikan iterator, perlu menggunakan metode pemanggil hasNext() dan next().iterable juga memungkinkan melakukan penghapusan atau penggantian isi varibel meskipun masih dalam proses looping.

## Map Data Structure
map adalah generalisasi dari array. Seperti array, map juga memiliki operasi untuk mengambil dan meletakkan elemen. Pada map, objek yang digunakan sebagai “indeks” disebut kunci (key). Objek yang ditunjuk oleh indeks tersebut disebut nilai (value). Satu kunci hanya boleh menunjuk pada satu nilai, akan tetapi satu nilai bisa ditunjuk oleh beberapa kunci.

Jenis MAP: HashMap, TreeMap, LinkedHashMap

- map.get(kunci) -- mengembalikan Object yang ditunjuk oleh kunci. Jika map tidak memiliki nilai yang ditunjuk oleh kunci, maka nilai null akan dikembalikan. Menggunakan "map.get(kunci)" sama dengan perintah "A[kunci]" pada array A. (Akan tetapi pada map tidak ada pengecualian IndexOutOfBoundsException)
- map.putAll(map2) -- jika map2 adalah map lain, maka perintah ini akan mengkopi semua isi pada map2 ke dalam map.
- map.remove(kunci) -- Jika map memiliki kunci yang menunjuk pada suatu nilai, perintah ini akan menghapus kunci beserta nilai yang ditunjuknya, atau dengan kata lain menghapus pasangan kunci dan nilai pada map sekaligus.
- map.containsKey(kunci) -- mengembalikan nilai boolean true jika map memiliki kunci yang merujuk pada suatu nilai
- map.containsValue(nilai) -- mengembalikan nilai boolean true jika map memiliki nilai yang ditunjuk oleh kunci apapun.
- map.size() -- mengembalikan int yang berisi jumlah pasangan asosiasi pada map.
- map.isEmpty() -- mengembalikan boolean true jika map tidak berisi pasangan asosiasi apa-apa.
- map.clear() -- menghapus semua pasangan asosiasi dalam map.
