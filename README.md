# java_ex1

## Abstrakti luokka

Luokka, josta ei voi tehdä oliota vaan sitä käytetään yliluokkana jollekin toiselle luokalle.

### Esimerkki

Kantaluokka
Animal (abstrakti luokka)
siihen laitetaan eläimille yhteisiä ominaisuuksia <br>
kts. Animal.java

Luokat Cat ja Dog perivät Animal-luokan
ja niillä kummallakin voi olla omia erityisominaisuuksiaan<br>
kts. Cat.java ja Dog.java

### Abstrakti metodi 

Luokassa vain metodin esittely, mutta ei toteutusta. Perivän luokan tulee
toteuttaa abstraktit metodit.

## Interface luokka

Luokka, jonka kaikki metodit ovat automaattisesti Abstrakteja. <br>
kts. IAnimal.java ja Horse.java

## Moniperintä?
Javassa luokka voi periä vain yhden luokan ja implementoida yhden interface luokan.
Esimerkiksi <br>
<pre>
public class Horse extends Animal implements IAnimal
</pre>