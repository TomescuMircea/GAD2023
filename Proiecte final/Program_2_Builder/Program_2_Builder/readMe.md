# Publicatie de stiri - Design pattern: Observer

## Documentație

### Descriere design pattern

Builderul este un design pattern cu ajutorul căruia putem crea obiecte de diferite tipuri și care vine în ajutorul utilizatorului deoarece uneori poate fi greu să creezi un obiect cu foarte mulți parametri. 
Builderul creează el obiectul așa cum ne dorim și ni-l retunează.
### Descrierea programului
Am implementat design patternul Builder prin construirea unui program ce "simulează" un configurator de mașini.
"Configuratorul" (Builderul) primește brandul, modelul, culoarea și motorul, iar el adaugă viteza și numărul de locuri.
În Main am creat două obiecte de tipul mașină ce sunt instanțiate cu ajutorul builderului care le construiește cu caracteristicile cerute.


În problemă am folosit clasa Car ce are get-erele specifice caracteristicilor sale, un constructor privat pentru a nu-i da voie utilizatorului să își creeze obiectul în mod direct și o clasă statică Builder care construiește o mașină așa cum dorim și o returnează.