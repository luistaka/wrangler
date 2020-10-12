# Number Functions

The collection of functions for handling numbers in the data.

## AsDouble
Returns double value of the given argument.

#### Namespace
`number`

#### Input
number

#### Output
double

#### Example
If `a` contains the number `5.2`
then the following two functions are equivalent, and return the value `2.6`:

```
set-column val number:AsDouble(a/2)
set-column val number:AsDouble(5.2/2)
```

## AsFloat
Returns double value of the given argument.

#### Namespace
`number`

#### Input
number

#### Output
double

#### Example
If `a` contains the number `5.2`
then the following two functions are equivalent, and return the value `2.6`:

```
set-column val number:AsFloat(a/2)
set-column val number:AsFloat(5.2/2)
```

## AsInteger
Returns integer value of the given argument.

#### Namespace
`number`

#### Input
number

#### Output
integer

#### Example
If `a` contains the number `5.2`
then the following two functions are equivalent, and return the value `2`:

```
set-column val number:AsInteger(a/2)
set-column val number:AsInteger(5.2/2)
```

## MantissaFromDecimal
Returns the mantissa from the given number.

#### Namespace
`number`

#### Input
number

#### Output
double

#### Example
If `a` contains the number `123.4567`
then the following two functions are equivalent, and return the value `4567`:

```
set-column val number:MantissaFromDecimal(a)
set-column val number:MantissaFromDecimal(123.4567)
```

## MantissaFromDFloat
Returns the mantissa from the given float.

#### Namespace
`number`

#### Input
number

#### Output
double

#### Example
If `a` contains the number `1.0123`
then the following two functions are equivalent, and return the value `123`:

```
set-column val number:MantissaFromDecimal(a)
set-column val number:MantissaFromDecimal(1.0123)
```
