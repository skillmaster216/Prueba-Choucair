package com.choucair.empleos.user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.choucairtesting.com/empleos-testing/")
public class ChoucairEmpleosPage extends PageObject {
  public static final Target KEYWORDS_SEARCH = Target.the("El campo de busqueda por keyword ").located(By.id("search_keywords"));
  public static final Target LOCATION_SEARCH = Target.the("El campo de busqueda por location ").located(By.id("search_location"));
  public static final Target SEARCH_BUTTON = Target.the("El boton de busqueda ").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input"));
  public static final Target RESULT_MESSAGE = Target.the("El mensaje de los resultados de la busqueda ").located(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[2]/span"));
}
