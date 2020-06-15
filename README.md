# AirlineAPIExam

# Bilet

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/biletAl | `POST` | {'yolcuAdı':'Kerem', 'yolcuSoyadı':'Yılmaz', 'yolcuTC':11112223335, 'krediKartıNo':'1111222233334444', 'havayolu':{id:1}, 'ucus':{id:6} | Bilet alma işlemi. |
| /api/biletleriGetir | `GET` | Empty | Bütün bilet bilgilerini listeler. |
| /api/biletSorgula/{yolcuTC} | `GET` | Empty | TC no ile bilet sorgulama işlemi |
| /api/biletIptalEt/{id} | `DELETE` | Empty | Bilet id no ile iptal etme işlemi yapar. |

# Havaalanı

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /api/havaalaniEkle | `POST` | 'isim':'Esenboga Havalimanı', 'sehir':'Ankara', 'ulke':'Turkiye',  | Yeni bir havaalanı ekler. |
| /api/havaalaniListele | `GET` | Empty | Bütün havaalantını listeler. |
| /api/havaalaniAra/{ad} | `GET` | Empty | İlgili parametre ile havaalanı araması yapar. |


# HavayoluSirketi

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| api/havayoluSirketiEkle | `POST` | { 'isim':"Pegasus Havayolları" } | Yeni bir havayolu şirketi tanımlar. |
| api/havayoluSirketiListele | `GET` | Empty | Bütün havayolu şirketlerini listeler. |
| api/havayoluSirketiAra/{ad} | `GET` | Empty | İlgili parametre ile havayolu şirketi araması yapar. |


# Rota

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| api/rotaOlustur | `POST` | { 'kalkisYeri':'Ankara', 'varisYeri':'Trabzon' } | Yeni bir rota girişi tanımlar. |
| api/rotaAraKalkis/{rota} | `GET` | Empty | Kalkis yerine göre arama işlemi yapar. |
| api/rotaAraVaris/{rota} | `GET` | Empty | Varis yerine göre arama işlemi yapar. |


# Ucus

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| api/ucusKaydet | `POST` | { 'kontenjan':150, 'fiyat':250, 'havayolu':{'id':1}, 'rota':{id:1} } | Yeni bir ucus bilgisi tanımlar. |
| api/ucus/kontenjanDuzenle/{ucusid} | `POST` | Örn: 150 | ucusid ile alınan ucus bilsinin kontenjanını günceller. |
| api/ucuslariListele | `GET` | Empty | Butun ucus bilgilerini listeler. |

## Örn. Bilet Alma
![GitHub Logo](https://github.com/sahindogukan/AirlineAPIExam/blob/master/biletAl.PNG)
![GitHub Logo](https://github.com/sahindogukan/AirlineAPIExam/blob/master/biletAlH2.PNG)

## Örn. Havayolu Sirketleri Listesi
![GitHub Logo](https://github.com/sahindogukan/AirlineAPIExam/blob/master/havayoluSirketiListele.PNG)

## Örn. Ucus Listesi
![GitHub Logo](https://github.com/sahindogukan/AirlineAPIExam/blob/master/ucusListele.PNG)
