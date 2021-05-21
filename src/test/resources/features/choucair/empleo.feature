Feature: Buscar
En la seccion "Empleos disponibles" de la pagina Choucair-Empleos los filtros "Keywords" y "Location" deben filtrar correctamente
  Scenario: Buscar por keywords
    Given que la pagina de choucair empleos este abierta
     When el usuario busque un empleo con la palabra clave "analista"
     And el usuario le de click al boton buscar
     Then deberian aparecer "5" resultados
  
  Scenario: Buscar por location
    Given que la pagina de choucair empleos este abierta
     When el usuario busque un empleo en la ciudad de "Medellin"
     And el usuario le de click al boton buscar
     Then deberian aparecer "6" resultados
  
  Scenario: Buscar por keywords y location
    Given que la pagina de choucair empleos este abierta
     When el usuario busque un empleo con la palabra clave "analista"
      And el usuario busque un empleo en la ciudad de "Medellin"
      And el usuario le de click al boton buscar
     Then deberian aparecer "4" resultados
