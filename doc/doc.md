# <center> APP </center>

### <center> Physical phenomena programming language </center>

---
### Team
- Paulina Gacek
- Paweł Magnuszewski
- Aneta Postrożny
---
### Contents
1. [Language description](#language-description)
2. [Motivation](#motivation)
3. [Initial goals and what we have achieved](#initial-goals-and-what-we-have-achieved)
4. [Additional features](#additional-features)
5. [Some code examples](#some-code-examples)
---
## Language description
APP is a simple imperative language modeled on Logo language, where object represented by the ball is controlled by the forces 
applied to it. The language will allow you to create many objects that will collide with each other in 
a elastic collisions.

## Motivation
We wanted to create language that would allow the user to create physical simulations in a simple and 
intuitive way.

It's especially useful for people who want to visualize their physics
tasks to better understand how forces affect on objects and also to predict the result they will get after applying the 
given sequence of forces to the object.

## Initial goals and what we have achieved
### _Keywords_
The set of keywords of the APP language:

`SET`, `AS`, `DEFINE`, `IF`, `ELIF`, `ELSE`, `THEN`, `ENDIF`, `LOOP`, `ENDLOOP`, `FOR` ,`PARALELL`, `ENDPARALELL`, `WITH`,
`FUNCTION`, `ENDFUNCTION`, `SIN`, `COS`

and all variable types.
###  _Variable types_
We wanted to provide five types of variables which was:
- `INT`
- `FLOAT`
- `TIME` - a type representing time in format `hh:mm:ss` or as an integer corresponding to the number of seconds 
- `OBJECT` - a type representing an object controlled by forces, optionally its `MASS` and `SIZE` can be defined by using `WITH` keyword
- `FORCE` - type representing a force, to define it, specify the force and the angle at which it is applied to the object. Type format: `[angle,power]` 

We were able to successfully realize this point of our plan.
### _Acceptable variable / function names_
- names can only contain uppercase and lowercase letters, numbers and `_`
- names have to start with a lowercase letter

### _Variable declaration and definition_
To define or declare variable user has to use the structure below.
- declaration with definition:
```
DEFINE <TYPE> <NAME> AS <VALUE>;
```
- definition:
```
SET <NAME> AS <VALUE>;
```
- example of usage:
```
DEFINE OBJECT o AS (40,40) WITH SIZE 40; 
DEFINE FORCE f2 AS [0, 300];
SET f2 AS [0.5, 30];

```
### _Arithmetical operations_
We provided basic arithmetical operations that are crucial to 
provide user with the freedom to use our language:
- `addition` (+)
- `subtraction` (-)
- `multiplication` (*)
- `division` (/) 
- `sinus` (SIN)
- `cosinus`(COS)

We wanted to add brackets to our language as well but for now it is the plan for the future.

### _Conditional statements_
We wanted to provide the user with access to the classic `IF` conditional statement. 
In order to achieve this goal, we had to provide comparison operations for the full convenience of using 
our language. 

We also managed to fully implement this point of the plan.

```
IF (<CONDITION>) THEN
	....
ELIF (<CONDITION>) THEN
    ....
ELSE
    ....
ENDIF;
```
_Available compare operations_:
- `==` - equal
- `>` - bigger
- `<` - smaller
- `<=` - less than or equal to
- `>=` - greater than or equal to

Example of usage:
```
DEFINE INT t AS 20; 
DEFINE INT w AS 50;
DEFINE OBJECT o AS (200,200); 
DEFINE FORCE f AS [0,4];
IF (w<t) THEN 
    DEFINE TIME t AS 213; 
ENDIF;
```

In the realm of language development plans we also left a logical operations such as `OR` and `AND`.

### _Loop_
Another essential thing for our language was `LOOP`.

```
LOOP(<CONDITIONAL STATEMENT>)
	...
ENDLOOP:
```
- example of usage
```
DEFINE INT t AS 20; 
LOOP (counter < 1000)
    SET t AS t + 3;
    SET counter AS counter + 1; 
ENDLOOP;
```
We managed to implement this point of the plan.
### _Functions_
We wanted to create two kinds of functions, one with no parameters and the other one with them. 

- No parameters
```
DEFINE FUNCTION <NAME> AS 
  ...
ENDFUNCTION;
```
- With parameters
```
DEFINE FUNCTION <NAME>(TYPE <NAME>,...) AS 
  ...
ENDFUNCTION;
```
- example of usage:
```
DEFINE TIME z AS 20; 
funkcja2(z); 

DEFINE FUNCTION funkcja2( TIME t) AS 
    DEFINE TIME t AS 30; 
ENDFUNCTION;
```
During the development of the language, we found out that functions that return a value can be useful.
To implement this type of function you have to use such a construct:
- Function that returns value
```
DEFINE FUNCTION <NAME>(TYPE <NAME>,...) ->TYPE AS 
    ...
    RETURN <NAME>;
ENDFUNCTION;
```
- example of usage:
```
DEFINE FUNCTION fun(INT n)-> INT AS 
    DEFINE INT result AS n + 5;
    RETURN result; 
ENDFUNCTION; 

DEFINE INT number AS 4;
DEFINE INT l AS fun(number);
```
All of those function types were successfully implemented.
### _Predefined function- applying force to an object_
The essence of our language is to act on forces. So it was necessary to provide a function that would make this possible. 

The `APPLY` function applies the indicated force to the indicated object for a given time.
You can define `DELAY` of force application.
```
APPLY <force> TO <object> FOR <time>;
```
```
APPLY <force> TO <object> FOR <time> DELAY <time>;
```
- example of usage:
```
DEFINE OBJECT o AS (400,600);
APPLY [0,10] TO o FOR 1;
```
### _Paralleling of forces_
In most physical phenomena, usually there are many forces acting on the object at the same time.

To meet this challenge, we have created the `PARALLEL` block in our language.

All applications of force actions contained in one `PARALLEL` block start at the same time and last for their proper duration.
Instructions not placed in `PARALLEL` block are executed sequentially.
```
PARALLEL
	...
ENDPARALLEL;
```
- example of usage
```
DEFINE OBJECT o AS (40,40) WITH SIZE 40; 
DEFINE OBJECT o2 AS (200,20); 
PARALLEL 
    APPLY [0,2] TO o FOR 0:00:10; 
    APPLY [90,2] TO o2 FOR 30; 
ENDPARALLEL;
```
### _Recursion_ 
The language also supports `recursion`, thanks to which it is possible to calculate, for example, factorials:
```
DEFINE INT number AS 4;
DEFINE FUNCTION factorial(INT n)-> INT AS 
    DEFINE INT result AS 0; 
    IF(n <= 1) 
        THEN SET result AS 1; ENDIF; 
    IF (n > 1) 
        THEN SET result AS factorial(n-1) * n; ENDIF; 
    RETURN result; 
ENDFUNCTION; 
DEFINE INT factorial4 AS factorial(number);
```
### _Scopes_
In APP it is also possible to create different variable scopes. User is able to create 
nested scopes using simple construction:
```
<ScopeName>{...};
```
and then refer to variables in each scope by:
```
<ScopeName>::<VariableName>
```
- example of usage:
```
DEFINE TIME t AS 213; 
IF (3<=6) THEN 
    DEFINE TIME t AS 20; 
    IF (3<=6) THEN 
        DEFINE TIME t AS 30; 
    ENDIF; 
ENDIF;
MyScope{DEFINE TIME zmienna AS 420;};
IF (3<=6) THEN 
    DEFINE TIME t AS 111; 
    IF (3<=6) THEN 
        DEFINE TIME t AS 301; 
    ENDIF; 
ENDIF;
MyScope{DEFINE TIME zmienna2 AS 4220;};
MyScope{ MyNestedScope{ DEFINE TIME zmienna2 AS 0;};}; 
MyScope{ MyNestedScope2{ DEFINE TIME zmienna2 AS 0;};}; 
MyNestedScope2{ DEFINE TIME zmienna2 AS 0;};
SET MyScope::zmienna2 AS 100;
```
### _Comments_
As in other languages, in APP user has the possibility of using comments that can be created using the structure below. 
```
/* ... */
```
- example of usage:
```
/* This is comment */
DEFINE TIME t AS 213; 
```
---
## Additional features
During the process of creating various simulations using our language, we managed to come up with some useful functionalities
that we believe will make it easier for the user to use our language.


### _ANGLE BETWEEN_
It is a function that returns angle between two objects.
```
ANGLE BETWEEN <object1>, <object2>;
```
- example of usage:
```
DEFINE OBJECT o1 AS (400,600);
DEFINE OBJECT o2 AS (400,400);
DEFINE FLOAT angle AS ANGLE BETWEEN o1, o2;
```

### _COORDINATE_
It is a function that returns coordinates of object. You have to specify axis you want to get.
```
COORDINATE axis=['X'|'Y'] OF <object>;
```
- example of usage:
```
DEFINE OBJECT o AS (400,600);
DEFINE FLOAT coordinate AS COORDINATE X OF o;
```

### _DISTANCE BETWEEN_
It is a function that returns distance between two objects.

```
DISTANCE BETWEEN <object1>, <object2>;
```
- example of usage:
```
DEFINE OBJECT o1 AS (400,600);
DEFINE OBJECT o2 AS (400,400);
DEFINE FLOAT distance AS DISTANCE BETWEEN o1, o2;
```

### _VELOCITY_
It is a function that returns velocity of object.
You have to specify axis you want to get.
```
VELOCITY axis=('X'|'Y'|'VALUE') OF <object>;
```
- example of usage:
```
DEFINE OBJECT o AS (400,600);
DEFINE FLOAT velocity AS VELOCITY X OF o;
```
---
## Some code examples

### _Solar system_
```
DEFINE OBJECT o AS (400,600);
DEFINE OBJECT o2 AS (400,400);
DEFINE OBJECT o3 AS (400,650);
DEFINE FLOAT f AS ANGLE BETWEEN o, o2;
DEFINE FLOAT f2 AS DISTANCE BETWEEN o, o2;
DEFINE FLOAT f3 AS 9000;
DEFINE FLOAT f4 AS ANGLE BETWEEN o3, o;
DEFINE FLOAT f5 AS DISTANCE BETWEEN o3, o;
DEFINE FLOAT f6 AS 25000;
DEFINE INT counter AS 0;
APPLY [0,52] TO o3 FOR 1;
APPLY [0,10] TO o FOR 1;
LOOP (counter < 1000)
    SET f AS ANGLE BETWEEN o, o2;
    SET f2 AS DISTANCE BETWEEN o, o2;
    SET f3 AS 3990;
    SET f3 AS f3/f2/f2;
    SET f4 AS ANGLE BETWEEN o3, o;
    SET f5 AS DISTANCE BETWEEN o3, o;
    SET f6 AS 23000;
    SET f6 AS f6/f5/f5;
    PARALLEL
        APPLY [f,f3] TO o FOR 1;
        APPLY [f4,f6] TO o3 FOR 1;
    ENDPARALLEL;
    SET counter AS counter + 1; 
ENDLOOP;
```

### _Throw_
```
DEFINE OBJECT o AS (20,20);
DEFINE FORCE g AS [270, 10];
PARALLEL
    APPLY [45,130] TO o FOR 1;
    APPLY g TO o FOR 100;
ENDPARALLEL;
```
### _Factorial_
```
DEFINE INT number AS 4;
DEFINE FUNCTION silnia(INT n)-> INT AS 
DEFINE INT wynik AS 0; 
IF(n <= 1) 
    THEN SET wynik AS 1; ENDIF; 
IF (n > 1) 
    THEN SET wynik AS silnia(n-1) * n; ENDIF; 
RETURN wynik; 
ENDFUNCTION; 
DEFINE INT silnia3 AS silnia(number);
```
