# Publicatie de stiri - Design pattern: Observer

## Documentație

### Descriere design pattern

Observer este un design pattern în care avem două "entități". Una este observabilă și cealaltă este cea care o observă. Scopul observerului este ca atunci când entitatea observabilă își modifică starea sau realizează un eveniment să fie notificate și entitățile care o observă pentru a efectua acțiunile aflate în legătură directă cu ceea ce clasa observată a făcut.

### Descrierea programului
Am implementat design patternul Observer prin 
problema curentă ilustrând o publicație de știri în care pot fi 
adăugate articole sportive, oportunități de job și știri. De asemenea avem și o listă
de subscriberi, iar de fiecare dată când adăugăm o publicație subscriberii
sunt notificați și afișează un mesaj în acest sens.

În problemă am folosit următoarele clase:

- clasa abstractă Publication care este extinsă de
cele 3 clase ce implementează diverse tipuri de publicații
- interfața Observable ce este implementată de clasa NewsFeed care implementează o revistă/site-ul unei publicații
- interfața Observer ce este implementată de clasa Subscriber și afisează un mesaj specific atunci când cititorul 
este notificat de publicarea unei publicații noi
- Main-ul în care avem o listă de cititori și o publicație în care adăugăm diferite articole .

La rularea programului se afișează pe ecran numele cititorului și articolul pe care l-a citit (Titlu+Descriere).