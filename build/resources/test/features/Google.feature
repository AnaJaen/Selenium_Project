Feature: Probar búsqueda en Google

Scenario: Buscar algo en Google
    
    Given navego a Google
    When busco con un criterio de búsqueda
    And hago click en el botón buscar
    Then Obtengo resultado

    