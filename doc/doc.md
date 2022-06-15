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
---
## Language description
APP is a simple imperative language modeled on Logo language, where object is controlled by the forces 
applied to it. The language will allow you to create many objects that will collide with each other in 
a perfectly elastic manner.

## Motivation
We wanted to create language that would allow the user to create physical simulations in a simple and 
intuitive way.

It's especially useful for people who want to visualize their physics
tasks to better understand how forces affects on object and also predict the result they will get after applying the 
given sequence of forces to the object.

## Initial goals and what we have achieved
###  _Variable types_
We wanted to provide five types of variables which was:
- `INT`
- `FLOAT`
- `TIME` - a type representing time in format `hh:mm:ss` or as an integer corresponding to the number of seconds 
- `OBJECT` - a type representing an object controlled by forces, optionally its mass and size can be defined
- `FORCE` - type representing a force, to define it, specify the force and the angle at which it is applied to the object.

We were able to successfully realize this point of our plan.
### _Arithmetical operations_
We wanted to provide basic arithmetical operations that are crucial to 
ensure user with the freedom to use our language:
- `addition` (+)
- `subtraction` (-)
- `multiplication` (*)
- `division` (/) 
- `sinus` (SIN)
- `cosinus`(COS)

We were able to implement most of this part of the plan, `sinus` and `cosinus` were left in the realm of language 
development plans. As well as respecting parentheses in the order of operations.
### _Conditional statements_
We wanted to provide the user with access to the classic `IF` conditional statement. 
In order to achieve this goal, we had to provide comparison operations for the full convenience of using 
our language. 

We also managed to fully implement this point of the plan.

```
IF (<CONDITION>) THEN
	....
ENDIF;
```

_Available compare operations_:
- `==` - equal
- `>` - bigger
- `<` - smaller
- `<=` - less than or equal to
- `>=` - greater than or equal to

In the realm of language development plans we also left a logical operations such as `OR` and `AND`.

### _Loop_
Another essential thing for our language was `LOOP`.

```
LOOP(<OPTIONAL DEFINITION>; <CONDITION>; <ACTION>)
	...
ENDLOOP:
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

Both of those function types were successfully implemented.
### _Predefined function- applying force to an object_
The essence of our language is to act on forces. So it was necessary to provide a function that would make this possible. 

The `apply_force` function applies the indicated force to the indicated object for a given time.

```
apply_force(OBJECT, FORCE, TIME);
```
### _Paralleling of forces_
In most physical phenomena, there is usually not only one force acting on the body at the same time.

To meet this challenge, we have created the `PARALLEL` block in our language.

All application of force actions contained in one `PARALLEL` block start at the same time and last for their proper duration.
No instructions outside of the `PARALLEL` block are executed until all instructions in the block have been ended.
```
PARALLEL
	...
ENDPARALLEL;
```