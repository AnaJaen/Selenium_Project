Feature: Probar busqueda en Google

Scenario: Buscar algo en Google
    
    Given navego a Google
    When busco con un criterio de busqueda
    And hago click en el boton buscar
    Then Obtengo resultado

    