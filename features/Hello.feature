Feature: Conversor de Numeros Romanos  Para poder entender facilmente los relojes de mano necesitamos una forma rapida de transformar numeros

  @important
  Scenario Outline: Numero menor a 100
    Given Si tengo el numero <arabigo>
    When lo convierto
    Then deberia ver <romano>

  Examples:
    | arabigo | romano |
    |  12     |  XII   |
    |  20     |  XX    |
    |  50     |  L     |
    |  80     |  LXXX  |


