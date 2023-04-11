# +Interview'lerde kaç çeşit xpath vardır şeklinde soru gelebilir.

## 1. Absolute Xpath :

/html/body/div[2]/div/div/div/form/input

*
    1. / ile başlıyor.
*
    2. En baştan HTML den başlyarak bir yol bulur.Araya başka eleman girdiğinde yol kaybolur.
       Bu yüzden kullanışsızdır.

## 2. Relative Xpath :

//*[@id='login-button']

*
    1. // başlıyor.
*
    2. Elemanı direk bulur, baştan itibaren diğer elemanlara bağlı kalmaz.

            findEmelent(By.xpath("//a[@id='proceed-link']"));
            findElement(By.cssSelector("a#proceed-link"));  

              CSS                          XPATH
              ile başlayan  id^            //*[start-with(@id,'u_')]
              ile biten     id$            //*[ends-with(@id,'_4545')]
              içinde geçen  id*            //*[contains(@id,'u_')]

              CSS                          XPATH
              [id='msg'][value='Good']     //*[@id='msg' and @value='Good']

              CSS                          XPATH
              >       : çocuklar           /
              space   : tüm cocuklar       //
              +       : bitişik kardeş     following-sibling::
              ~       : tüm kardeşler      following::

## XPATH in CSS den üstünlüğü

| KULLANIM                                | İŞLEV                                                                          |
|-----------------------------------------|--------------------------------------------------------------------------------|
| ```/..```                                     | Parent e gider                                                                 |
| ```//*[ text()='merhaba dünya']```            | Görünen yazısı ile bulma                                                       |
| ```//*[ contains( text(), 'merhaba' ) ]```    | Görünen yazısında merhaba geçen                                                |
| ```(//*[@id='user-message'])[1]```            | Bütün sayfada bulunan çoklu locatorlarda<br/> hangi eleman istenirse onu bulma |
| ```//ul[@class='nav navbar-nav']/li[2]```     | CSS deki nth-child ın XPATH deki karşılığı                                     |
| ```//label[text()='Enter message']/../..```   | Bir üste parente gitme /..                                                     |

---
[NOT] : Kullanım Sırası > id > name >  CSS > XPATH (CSS 2ms daha hızlı)

**********************************************
## getText() ile getAttribute("value"); farkı

```getText()``` ile tag lerin arasında kalanı alırsın. 
Mesela,<br>
```<p> merhaba dünya </p>```'da 
(p) elementi locate edilince, <br>
pElement.getText()'i _merhaba dünya_ yazdrır. <br>

```getAttribute("value")``` da ise sorulan attribute un değerini döndürür. 
Mesela,<br>
```<input type="text bla bla..." value="merhaba dünya" />``` 'da
(input) elementi locate edilince, <br>
iElement.getAttribute("type") _text bla bla..._ döndürür. <br>
iElement.getAttribute("value") _merhaba dünya_ döndürür. <br>

---
