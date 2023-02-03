# java_ex1

## Abstrakti luokka

Luokka, josta ei voi tehdä oliota vaan sitä käytetään yliluokkana jollekin toiselle luokalle.

### Esimerkki

Kantaluokka
Animal (abstrakti luokka)
siihen laitetaan eläimille yhteisiä ominaisuuksia

Luokat Cat ja Dog perivät Animal-luokan
ja niillä kummallakin voi olla omia erityisominaisuuksiaan

### Abstrakti metodi 

Luokassa vain metodin esittely, mutta ei toteutusta. Perivän luokan tulee
toteuttaa abstraktit metodit