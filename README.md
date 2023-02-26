# **RESUMEN**

## **Expresiones Regulares**
1. [Expresiones regulares en Java](https://refactorizando.com/expresiones-regulares-java/)
2. [Java Regex](https://www.javatpoint.com/java-regex)
3. [Qué son las expresiones regulares](https://www.arteco-consulting.com/post/tutorial-java-regexp)
4. [Lista de expresiones regulares](https://docs.vmware.com/es/vRealize-Log-Insight/8.0/com.vmware.log-insight.user.doc/GUID-88B2952D-3112-46BC-B126-84C9BF38B6D2.html)

```
public static char[] decompose(String word, int nChar){
        //String decomposeWord = "";
        int i, add;
        i = add = 0;
        char[] letters = new char[nChar];


        while(add != nChar){
            if(pattern.matcher(String.valueOf(word.charAt(i))).matches()){
                letters[add] = word.charAt(i);
                add++;
            }
            i++;
        }
```
## **Arreglos y Strings**

 1. [Métodos para las clases String](https://tinchicus.com/2019/04/12/java-metodos-para-la-clase-string/)
 2. Array de carácteres de String
 ```
    char array[] = {'A','V','I','L','A'};
    System.out.println(String.valueOf(array));
    /*or*/
    String characters = new String(array);
 ```
 3. Copiar datos de un arreglo de carácteres a un String
 ```
    String decomposeWord = "";
    Char [] letters = {'a', 'b', 'c'}
    decomposeWord = String.copyValueOf(letters); 
 ```