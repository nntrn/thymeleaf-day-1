# thymeleaf-day-1
a closer look at thymeleaf's fragment expressions using bootstrap 4

### [view demo](https://thymeleaf-fragments.herokuapp.com/)

## getting started

```
git clone https://github.com/nntrn/thymeleaf-day-1.git
cd thymeleaf-day-1
mvn spring-boot:run
```
refer to this [page](https://www.baeldung.com/maven-local-repository) for help setting up maven's local repository

### http://localhost:8081/

## quick notes

* `${...}` : Variable expressions.
* `*{...}` : Selection expressions.
* `#{...}` : Message (i18n) expressions.
* `@{...}` : Link (URL) expressions.
* `~{...}` : Fragment expressions.

### Literals and operations

* Literals:
  * Text literals: `'one text'`, `'Another one!'`,…
  * Number literals: `0`, `34`, `3.0`, `12.3`,…
  * Boolean literals: `true`, `false`
  * Null literal: `null`
  * Literal tokens: `one`, `sometext`, `main`,…
* Text operations:
  * String concatenation: `+`
  * Literal substitutions: `|The name is ${name}|`
* Arithmetic operations:
  * Binary operators: `+`, `-`, `*`, `/`, `%`
  * Minus sign (unary operator): `-`
* Boolean operations:
  * Binary operators: `and`, `or`
  * Boolean negation (unary operator): `!`, `not`
* Comparisons and equality:
  * Comparators: `>`, `<`, `>=`, `<=` (`gt`, `lt`, `ge`, `le`)
  * Equality operators: `==`, `!=` (`eq`, `ne`)
* Conditional operators:
  * If-then: `(if) ? (then)`
  * If-then-else: `(if) ? (then) : (else)`
  * Default: `(value) ?: (defaultvalue)`
