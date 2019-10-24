# Figuras


Se solicita modelar un conjunto de figuras geométricas a las cuales se les puede preguntar su:

* `Double area()`
* `String color()`
* `Boolean esRegular()`

Todas las figuras geométricas tienen un color definido. Las figuras permiten ser pintadas y así cambia de color.

* `pintar(Color: color)`

Se considera que un figura es igual a otra si el tipo,area y color son igual.

## Figuras Básicas :

#### Circulo
Tiene como atributo `radio` de tipo `Integer`. El area se calcula:

* `area`: Pi * Radio ^ 2

y es una figura `regular`.

#### Semicirculo
Tiene los mismos atributos que circulo pero su `area` se calculan distinto:

* `area`: es la mitad de la superficie del circulo

No es una figura `regular`.

#### Triángulo
Tiene como atributos la base y la altura y su area se calcula de la siguiente forma:

* `area`: base * altura / 2

y es una figura `regular`.


#### Rectángulo
Tambien tiene como atributos la base y la altura y su area se calcula de la siguiente forma:

* `area`: base * altura

y es una figura `regular`.


## Pruebas

1. Crear un circulo de radio `10` y color `amarillo` y verificar que su area es aproximadamente `314,16`.
2. Crear un Semicirculo de radio `10` y color `verde` y verificar que su area es aproximadamente `157,08`.
3. Crear un Triangulo de base `10` y altura `20` y de color `azúl` y verificar que su area es `100`.
4. Crear un Rectangulo de base `10` y altura `20` y  color `violeta` y verificar que su area es `200`.
5. Crear otro Rectangulo de base `10` y altura `20` y  color `violeta` y verificar que es igual al creado en el punto anterior.
6. Pintar de color `verde` alguno de los rectangulos ya creado y verficiar que ya no son iguales.
7. Ordenar **programaticamente** por su area las figuras creadas de menos a mayor y verificar q la mas pequeña es el triángulo y la mas grande es el circulo.

## Figuras agujereadas

Mas allá de las figuras básicas es posible tener figuras `agujereadas`. Tienen básicamente los mismos atributos que las figuras básicas pero cambia la forma en la que se calcula el area.
El area de una figura agujereada es un tercio del area de la figura original, por ejemplo:

* Area del Rectángulo agujereado = base * altura / 3

Se solicita poder tener una figura agujereada  por cada figura básica existente.

## Extra Extra !!

### Ordenamientos alternativos

Incorporar al diseño la posibilidad de ordenar las figuras por criterios alternativos al area. Por ejemplo, es deseable poder ordenar las figuras por los siguientes criterios:

- Por color. Siendo el orden de los colores arbitrario y definido por ustedes. Lo importante es que se respete el orden definido por uds.

- Por tipo (primero regular y luego irregular) y luego por area.

### Validaciones

Se solicita impedir q se pueda instaciar figurar con dimensiones `inválidas`, por ejemplo, un cuadrado de altura negativa o un triangulo de base 0.
En estos casos se debe arrojar una excepción notificando de tal condición.

Realizar los tests necesarios para verificar ambos extrás.






